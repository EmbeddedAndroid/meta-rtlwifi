SUMMARY = "Realtek 802.11n WLAN Adapter Linux driver"
LICENSE = "GPL-2.0-only"
LIC_FILES_CHKSUM = "file://LICENSE;md5=ab842b299d0a92fb908d6eb122cd6de9"
FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"

inherit module

SRC_URI = " \
    git://github.com/morrownr/8812au-20210629.git;protocol=https;branch=main \
    file://0001-Use-modules_install-as-wanted-by-yocto.patch \
"

#SRCREV = "663dc8fe1fbc100be9ed532f003c6eb90dab3d33"
SRCREV = "b5f4e6e894eca8fea38661e2fc22a2570e0274ad"

PV = "5.13.6-git"
S = "${WORKDIR}/git"

EXTRA_OEMAKE:append = " KSRC=${STAGING_KERNEL_DIR}"
