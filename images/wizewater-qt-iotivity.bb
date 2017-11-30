SUMMARY = "Wizewater Qt Image"
HOMEPAGE = "http://www.wizewater.us"
LICENSE = "MIT"

require wizewater-qt-base.bb

IMAGE_INSTALL += " \
    packagegroup-iotivity \
"

export IMAGE_BASENAME = "wizewater-qt-iotivity"
