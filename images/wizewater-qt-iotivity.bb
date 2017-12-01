SUMMARY = "Wizewater Qt Image"
HOMEPAGE = "http://www.wizewater.us"
LICENSE = "MIT"

require wizewater-qt-base.bb

IMAGE_INSTALL += " \
    packagegroup-iotivity \
    iotivity-simple-client \
    iotivity-sensorboard \
    qt-iotivity-demo \
"

export IMAGE_BASENAME = "wizewater-qt-iotivity"
