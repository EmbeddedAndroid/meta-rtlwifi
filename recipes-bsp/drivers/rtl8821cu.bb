SUMMARY = "RTL8821CU kernel driver (wifi)"
DESCRIPTION = "RTL8821CU kernel driver"
LICENSE = "GPL-2.0-only"
LIC_FILES_CHKSUM = "file://LICENSE;md5=ab842b299d0a92fb908d6eb122cd6de9"

FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"
SRCREV = "e49409f22ceea0d5b5ef431e6170580028b84c9d"
SRC_URI = " \
    git://github.com/morrownr/8821cu-20210916;protocol=https;branch=main \
    file://0001-use-modules_install-as-wanted-by-yocto.patch \
"
PV = "5.12.0.4-git"

inherit module
S = "${WORKDIR}/git"
EXTRA_OEMAKE:append = " KSRC=${STAGING_KERNEL_DIR}"
