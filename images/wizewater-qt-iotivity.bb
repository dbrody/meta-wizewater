SUMMARY = "Wizewater Qt Image"
HOMEPAGE = "http://www.wizewater.us"
LICENSE = "MIT"

require wizewater-qt-base.bb

QT_EXTRAS = " \
  qtdeclarative \
  qtdeclarative-qmlplugins \
  qtquickcontrols2 \
  qtquickcontrols-qmlplugins \
  qtsensors-plugins \
  qtserialbus \
  qtvirtualkeyboard \
  qtxmlpatterns \
"

IMAGE_INSTALL += " \
    ${QT_EXTRAS} \
    packagegroup-iotivity \
    iotivity-simple-client \
    iotivity-sensorboard \
    qt-iotivity-demo \
    water-control \
"

export IMAGE_BASENAME = "wizewater-qt-iotivity"
