
make_dir() {
    install -d $1
}

copy_file_recursive() {
    cd $1 && find . -type d -exec install -d $2/"{}" \;
    cd $1 && find . -type f -exec install -c -m 444 "{}" $2/"{}" \;
}

do_install_append() {
  make_dir ${D}${includedir}/wiringPi
  copy_file_recursive ${S}/wiringPi ${D}${includedir}/wiringPi
}
