SUMMARY = "Wizewater Qt Image"
HOMEPAGE = "http://www.wizewater.us"
LICENSE = "MIT"

require wizewater-qt-base.bb

WIZEWATER_APPS = " \
  water-control \
"

QT_EXTRAS = " \
  qt3d \
  qtcharts \
  qtdeclarative \
  qtgraphicaleffects \
  qtgraphicaleffects-qmlplugins \
  qtlocation-plugins \
  qtmultimedia \
  qtquickcontrols2 \
  qtsensors-plugins \
  qtserialbus \
  qtsvg \
  qtwebsockets-qmlplugins \
  qtvirtualkeyboard \
  qtxmlpatterns \
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
    ${WIZEWATER_APPS} \
"

export IMAGE_BASENAME = "wizewater-qt-demo"
