SUMMARY = "RTL88x2BU kernel driver (wifi)"
DESCRIPTION = "RTL88x2BU kernel driver (like RTL8812BU)"
LICENSE = "GPL-2.0-only"
LIC_FILES_CHKSUM = "file://LICENSE;md5=ca671256c791bbbf7c985ca88dc89fc9"

SRCREV = "9a04d2bb9d882c7f2708560774d7b96a70d83f4b"
SRC_URI = " \
	git://github.com/morrownr/88x2bu-20210702;protocol=https;branch=main \
	file://0001-fix-makefile.patch \
"
PV = "5.13.1-git"

inherit module
S = "${WORKDIR}/git"
EXTRA_OEMAKE:append = " KSRC=${STAGING_KERNEL_DIR}"
