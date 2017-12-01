SUMMARY = "Qt5 Demo Iotivity QT Apps"
HOMEPAGE = "http://www.wizewater.us"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

DEPENDS += "qtbase"

PR = "r1"

SRCREV = "${AUTOREV}"
SRC_URI = "git://github.com/dbrody/qt-iotivity-demo.git"

S = "${WORKDIR}/qt-iotivity-demo"

require recipes-qt/qt5/qt5.inc

do_install() {
    install -d ${D}${bindir}
    install -m 0755 ${B}/qt-iotivity-server ${D}${bindir}
    install -m 0755 ${B}/qt-iotivity-client ${D}${bindir}
}

FILES_${PN} = "${bindir}"

RDEPENDS_${PN} = "qtbase-plugins"