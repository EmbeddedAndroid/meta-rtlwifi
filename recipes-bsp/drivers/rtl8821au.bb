SUMMARY = "Linux driver for RTL8811AU and RTL8821AU chipsets"
LICENSE = "GPL-2.0-only"
LIC_FILES_CHKSUM = "file://LICENSE;md5=ca671256c791bbbf7c985ca88dc89fc9"
FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"

inherit module

SRC_URI = " \
	git://github.com/morrownr/8821au-20210708.git;protocol=https;branch=main \
	file://0001-Use-modules_install-as-wanted-by-yocto.patch \
"

SRCREV = "a133274b0532c17318e8790b771566f4a6b12b7c"

S = "${WORKDIR}/git"

EXTRA_OEMAKE:append = " KSRC=${STAGING_KERNEL_DIR}"
