SUMMARY = "RTL8192AU kernel driver (wifi)"
DESCRIPTION = "RTL8192AU kernel driver"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://hal/hal_com_c2h.h;md5=1b3bc120406d289b6d969a5dd22cac87;endline=19"

SRC_URI = "git://github.com/Mange/rtl8192eu-linux-driver.git;protocol=https;branch=realtek-4.4.x"
SRCREV = "49a0fb502023d0f905404d0d18f7e4df65327f75"

S = "${WORKDIR}/git"

PV = "1.0-git"

DEPENDS = "virtual/kernel"

inherit module

EXTRA_OEMAKE  = "ARCH=${ARCH}"
EXTRA_OEMAKE += "KSRC=${STAGING_KERNEL_BUILDDIR}"

do_compile () {
    unset LDFLAGS
    oe_runmake
}

do_install () {
    install -d ${D}/lib/modules/${KERNEL_VERSION}
    install -m 0755 ${B}/8192eu.ko ${D}/lib/modules/${KERNEL_VERSION}/8192eu.ko
}

