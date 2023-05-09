SUMMARY = "Realtek 802.11n WLAN Adapter Linux driver"
LICENSE = "GPL-2.0-only"
LIC_FILES_CHKSUM = "file://LICENSE;md5=ca671256c791bbbf7c985ca88dc89fc9"
FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"

inherit module

SRC_URI = " \
    git://github.com/morrownr/8812au-20210629;protocol=https;branch=master \
    file://0001-Use-modules_install-as-wanted-by-yocto.patch \
"

SRCREV = "663dc8fe1fbc100be9ed532f003c6eb90dab3d33"

PV = "5.13.6-git"
S = "${WORKDIR}/git"

EXTRA_OEMAKE:append = " KSRC=${STAGING_KERNEL_DIR}"
