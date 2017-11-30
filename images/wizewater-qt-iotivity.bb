SUMMARY = "Wizewater Qt Image"
HOMEPAGE = "http://www.wizewater.us"
LICENSE = "MIT"

require wizewater-qt-base.bb

IMAGE_INSTALL += " \
    iotivity \
    iotivity-dev \
    iotivity-resource-samples \
    iotivity-service-samples \
    packagegroup-iotivity \
"

export IMAGE_BASENAME = "wizewater-qt-iotivity"
