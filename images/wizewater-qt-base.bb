SUMMARY = "Wizewater Qt Image"
HOMEPAGE = "http://www.wizewater.us"
LICENSE = "MIT"

require wizewater-console-base.bb

DISTRO_FEATURES_remove = " x11 wayland"

EXTRA_IMAGE_FEATURES = " debug-tweaks ssh-server-openssh "

QT_DEV_TOOLS = " \
"

QT_TOOLS = " \
    qtbase \
    qtbase-plugins \
    qt5-env \
    qtserialport \
    qtwebengine \
    qtwebengine-qmlplugins \
"

SSH_DEV_TOOLS = " \
    openssh-sftp-server \
"

FONTS = " \
    fontconfig \
    fontconfig-utils \
    ttf-bitstream-vera \
"

TSLIB = " \
    tslib \
    tslib-conf \
    tslib-calibrate \
    tslib-tests \
"

IMAGE_INSTALL += " \
    ${FONTS} \
    ${QT_TOOLS} \
    ${SSH_DEV_TOOLS} \
    ${TSLIB} \
    tspress \
"

export IMAGE_BASENAME = "wizewater-qt-base"
