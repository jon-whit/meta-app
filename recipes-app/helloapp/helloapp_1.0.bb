# This file was derived from the 'Hello World!' example recipe in the
# Yocto Project Development Manual.

DESCRIPTION = "A simple Hello, World application."
SECTION = "examples"
DEPENDS = ""
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=96af5705d6f64a88e035781ef00e98a8"

FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}-${PV}:"

SRCREV = "9f73fa931955af682819902628a3c2dc62c1823b"
SRC_URI = "git://github.com/jon-whit/helloapp.git"

S = "${WORKDIR}/git"

inherit autotools
