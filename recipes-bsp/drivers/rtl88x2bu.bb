SUMMARY = "RTL88x2BU kernel driver (wifi)"
DESCRIPTION = "RTL88x2BU kernel driver (like RTL8812BU)"
LICENSE = "GPL-2.0-only"
LIC_FILES_CHKSUM = "file://LICENSE;md5=ab842b299d0a92fb908d6eb122cd6de9"

SRCREV = "fe48647496798cac77976e310ee95da000b436c9"
SRC_URI = " \
	git://github.com/morrownr/88x2bu-20210702;protocol=https;branch=main \
	file://0001-fix-makefile.patch \
"
PV = "5.13.1-git"

inherit module
S = "${WORKDIR}/git"
EXTRA_OEMAKE:append = " KSRC=${STAGING_KERNEL_DIR}"
