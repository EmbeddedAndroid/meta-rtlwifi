SUMMARY = "RTL8192AU kernel driver (wifi)"
DESCRIPTION = "RTL8192AU kernel driver"
LICENSE = "GPL-2.0-only"
LIC_FILES_CHKSUM ?= "file://${COMMON_LICENSE_DIR}/GPL-2.0-only;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "git://github.com/Mange/rtl8192eu-linux-driver.git;protocol=https;branch=realtek-4.4.x"
SRCREV = "528ae31705764d78cc117abd604d9b799bd52543"

S = "${WORKDIR}/git"

PV = "4.4.1-git"

DEPENDS = "virtual/kernel"

inherit module

EXTRA_OEMAKE  = "ARCH=${ARCH}"
EXTRA_OEMAKE += "KSRC=${STAGING_KERNEL_BUILDDIR}"

do_compile () {
    unset LDFLAGS
    oe_runmake
}

do_install () {
    install -d ${D}${nonarch_base_libdir}/modules/${KERNEL_VERSION}
    install -m 0755 ${B}/8192eu.ko ${D}${nonarch_base_libdir}/modules/${KERNEL_VERSION}/8192eu.ko
}

