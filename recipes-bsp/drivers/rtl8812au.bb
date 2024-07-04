SUMMARY = "Realtek 802.11n WLAN Adapter Linux driver"
LICENSE = "GPL-2.0-only"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1918d7d89f091725a3188ff95f7c72b"
FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"

inherit module

SRC_URI = " \
    git://github.com/morrownr/8812au-20210820.git;protocol=https;branch=main \
    file://0001-Use-modules_install-as-wanted-by-yocto.patch \
"

SRCREV = "c0efee9cd121d9f0c815d9771475f76339a8f7d3"

PV = "5.13.6-git"
S = "${WORKDIR}/git"

EXTRA_OEMAKE:append = " KSRC=${STAGING_KERNEL_DIR}"
