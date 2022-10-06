SUMMARY = "Realtek 802.11n WLAN Adapter Linux driver"
LICENSE = "GPL-2.0-only"
LIC_FILES_CHKSUM = "file://Kconfig;md5=4b85004ff83dd932ff28f7f348fb2a28"
FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"

inherit module

SRC_URI = " \
	git://github.com/gordboy/rtl8812au.git;protocol=https;branch=master \
	file://0001-Use-modules_install-as-wanted-by-yocto.patch \
"

SRCREV = "30d47a0a3f43ccb19e8fd59fe93d74a955147bf2"

S = "${WORKDIR}/git"

EXTRA_OEMAKE:append = " KSRC=${STAGING_KERNEL_DIR}"
