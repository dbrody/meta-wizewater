SUMMARY = "Wizewater Qt Image"
HOMEPAGE = "http://www.wizewater.us"
LICENSE = "MIT"

require wizewater-console-base.bb

QT_DEV_TOOLS = " \
"

QT_TOOLS = " \
    qtbase \
    qt5-env \
    qtserialport \
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
    qcolorcheck \
    qfontchooser \
    qkeytest \
    qshowfonts \
    ${TSLIB} \
    tspress \
"

export IMAGE_BASENAME = "wizewater-qt-base"
