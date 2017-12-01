SUMMARY = "Wizewater Qt Image"
HOMEPAGE = "http://www.wizewater.us"
LICENSE = "MIT"

require wizewater-qt-base.bb

QT_EXTRAS = " \
    qtdeclarative \
    qtdeclarative-qmlplugins \
    qtgraphicaleffects \
    qtgraphicaleffects-qmlplugins \
    qtsensors-plugins \
"

QT_DEMOS = " \
  cinematicexperience \
  qtsmarthome \
  qt5ledscreen \
  quitbattery \
  quitindicators \
  qt5nmapper \
  qt5nmapcarousedemo \
  qt5-opengles2-test \
"

IMAGE_INSTALL += " \
    ${QT_EXTRAS} \
    packagegroup-iotivity \
    iotivity-simple-client \
    iotivity-sensorboard \
    qt-iotivity-demo \
"

export IMAGE_BASENAME = "wizewater-qt-demo"
