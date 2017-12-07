SUMMARY = "Wizewater Controller Codes"
HOMEPAGE = "http://www.wizewater.us"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

DEPENDS += " \
  wiringpi \
  qtbase \
  qtdeclarative \
  qtgraphicaleffects \
  iotivity \
"

PR = "r1"

SRCREV = "${AUTOREV}"
PVBASE := "${PV}"
PV = "${PVBASE}+${SRCPV}"
SRC_URI = "git://git@github.com/dbrody/water-control.git;protocol=ssh"

S = "${WORKDIR}/git/station-group-controller/src"

require recipes-qt/qt5/qt5.inc

inherit pkgconfig

do_compile_prepend() {
    export PKG_CONFIG_PATH="${PKG_CONFIG_PATH}"
    export PKG_CONFIG="PKG_CONFIG_SYSROOT_DIR=\"${PKG_CONFIG_SYSROOT_DIR}\" pkg-config"
    export LD_FLAGS="${LD_FLAGS}"
    export LDLIBS_IOTIVITY=$(shell $(PKG_CONFIG) iotivity --libs)
    export LDLIBS_WIRINGPI=$(shell $(PKG_CONFIG) wiringpi --libs)
    export LDLIBS="#{LDLIBS_IOTIVITY} ${LDLIBS_WIRINGPI}"
}

do_install() {
    install -d ${D}${bindir}
    install -m 0755 ${B}/station-group-controller ${D}${bindir}
}

FILES_${PN} = "${bindir}"

RDEPENDS_${PN} = " \
  qtbase-plugins \
  qtdeclarative-qmlplugins \
  qtgraphicaleffects-qmlplugins  \
  iotivity-resource \
  iotivity-service \
  wiringpi \
"
BBCLASSEXTEND = "native nativesdk"
