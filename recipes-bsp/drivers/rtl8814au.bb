SUMMARY = "RTL8814AU kernel driver (wifi)"
DESCRIPTION = "RTL8814ABU kernel driver"
LICENSE = "GPL-2.0-only"
LIC_FILES_CHKSUM = "file://LICENSE;md5=ab842b299d0a92fb908d6eb122cd6de9"

SRCREV = "6f80699e68fd2a9f2bba3f1a56ca06d1b7992bd8"
SRC_URI = " \
    git://github.com/morrownr/8814au;protocol=https;branch=main \
    file://0001-fix-makefile.patch \
"
PV = "5.8.5.1-git"

inherit module
S = "${WORKDIR}/git"
EXTRA_OEMAKE:append = " KSRC=${STAGING_KERNEL_DIR}"
