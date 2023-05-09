SUMMARY = "RTL88x2BU kernel driver (wifi)"
DESCRIPTION = "RTL88x2BU kernel driver (like RTL8812BU)"
LICENSE = "GPL-2.0-only"
LIC_FILES_CHKSUM ?= "file://${COMMON_LICENSE_DIR}/GPL-2.0-only;md5=801f80980d171dd6425610833a22dbe6"

FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"
SRCREV = "efcaffbd60e8114b5338f51cec8b3f7b6ef51045"
SRC_URI = "\
    git://github.com/lwfinger/rtl8723du;protocol=https;branch=master \
    file://0001-use-modules_install-as-wanted-by-yocto.patch \
"
PV = "5.13.4-git"

inherit module
S = "${WORKDIR}/git"
EXTRA_OEMAKE:append = " KSRC=${STAGING_KERNEL_DIR}"
