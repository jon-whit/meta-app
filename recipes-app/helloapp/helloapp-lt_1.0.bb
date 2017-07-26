DESCRIPTION =  "A simple Hello, World application."
SECTION = "examples"
DEPENDS = ""
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=96af5705d6f64a88e035781ef00e98a8"

# This tells bitbake where to find the files we're providing on the local filesystem
FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}-${PV}:"

# Use local tarball
SRC_URI = "file://helloapp-${PV}.tar.gz"

# Make sure our source directory (for the build) matches the directory structure in the tarball
S = "${WORKDIR}/helloapp-${PV}"

inherit autotools
