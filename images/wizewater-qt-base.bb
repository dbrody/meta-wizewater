SUMMARY = "Wizewater Qt Image"
HOMEPAGE = "http://www.wizewater.us"
LICENSE = "MIT"

require wizewater-console-base.bb

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
    ${TSLIB} \
    tspress \
"

export IMAGE_BASENAME = "wizewater-qt-base"
