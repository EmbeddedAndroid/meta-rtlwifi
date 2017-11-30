SUMMARY = "RTL8723 kernel driver (wifi + bluetooth)"
DESCRIPTION = "RTL8723 kernel driver"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://Kconfig;md5=ce4c7adf40ddcf6cfca7ee2b333165f0"

SRC_URI = "git://github.com/lwfinger/rtl8723bu.git;protocol=https"
SRCREV = "b922079a090dcaad58179d478442ff97f18521c9"

S = "${WORKDIR}/git"

PV = "1.0-git"

# add support for ARM platform
SRC_URI =+ "file://0001-ARM-Support.patch \
            file://0002-realtek-Disable-IPS-mode.patch "

DEPENDS = "virtual/kernel"

inherit module

EXTRA_OEMAKE  = "ARCH=${ARCH}"
EXTRA_OEMAKE += "KSRC=${STAGING_KERNEL_BUILDDIR}"

do_compile () {
    oe_runmake
}

do_install () {
    install -d ${D}/lib/modules/${KERNEL_VERSION}
    install -m 0755 ${B}/8723bu.ko ${D}/lib/modules/${KERNEL_VERSION}/8723bu.ko
}

