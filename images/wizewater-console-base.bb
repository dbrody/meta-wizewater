SUMMARY = "Wizewater Console Base Image"
HOMEPAGE = "http://www.wizewater.us"
LICENSE = "MIT"

IMAGE_FEATURES += " package-management splash"
IMAGE_LINGUAS = "en-us"

inherit core-image

DEPENDS += "bcm2835-bootfiles"

CORE_OS = " \
    openssh openssh-keygen openssh-sftp-server \
    term-prompt \
    tzdata \
"

WIFI_SUPPORT = " \
    crda \
    iw \
    linux-firmware-bcm43430 \
    linux-firmware-ralink \
    linux-firmware-rtl8192ce \
    linux-firmware-rtl8192cu \
    linux-firmware-rtl8192su \
    wireless-tools \
    wpa-supplicant \
"

DEV_SDK_INSTALL = " \
    git \
"

DEV_EXTRAS = " \
    ntp \
    ntp-tickadj \
    serialecho  \
    spiloop \
"

EXTRA_TOOLS_INSTALL = " \
    ethtool \
    i2c-tools \
    nano \
"

CAN_TOOLS = " \
"

RPI_STUFF = " \
    bcm2835-tests \
    raspi2fb \
    rpio \
    rpi-gpio \
    wiringpi \
"

IMAGE_INSTALL += " \
    ${CAN_TOOLS} \
    ${CORE_OS} \
    ${DEV_SDK_INSTALL} \
    ${DEV_EXTRAS} \
    ${EXTRA_TOOLS_INSTALL} \
    ${RPI_STUFF} \
    ${WIFI_SUPPORT} \
"

set_local_timezone() {
    ln -sf /usr/share/zoneinfo/EST5EDT ${IMAGE_ROOTFS}/etc/localtime
}

disable_bootlogd() {
    echo BOOTLOGD_ENABLE=no > ${IMAGE_ROOTFS}/etc/default/bootlogd
}

ROOTFS_POSTPROCESS_COMMAND += " \
    set_local_timezone ; \
    disable_bootlogd ; \
 "

export IMAGE_BASENAME = "wizewater-console-base"
