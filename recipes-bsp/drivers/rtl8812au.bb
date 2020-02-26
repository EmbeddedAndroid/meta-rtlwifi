SUMMARY = "RTL8812AU kernel driver (wifi)"
DESCRIPTION = "RTL8812AU kernel driver"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://Kconfig;md5=b6eba614442863d69c7bf9846cecf9fb"

SRC_URI = "git://github.com/aircrack-ng/rtl8812au.git;protocol=https"
SRCREV = "df9cff6c573a4fde54a6ebacac0495c5727ff9e6"

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
    install -m 0755 ${B}/rtl8812au.ko ${D}/lib/modules/${KERNEL_VERSION}/rtl8812au.ko
}

