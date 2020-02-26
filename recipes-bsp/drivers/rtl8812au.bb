SUMMARY = "RTL8812AU kernel driver (wifi)"
DESCRIPTION = "RTL8812AU kernel driver"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://Kconfig;md5=b6eba614442863d69c7bf9846cecf9fb"

SRC_URI = "git://github.com/aircrack-ng/rtl8812au.git;protocol=https;branch=v5.3.4"
SRCREV = "df9cff6c573a4fde54a6ebacac0495c5727ff9e6"

S = "${WORKDIR}/git"

PV = "1.0-git"

DEPENDS = "virtual/kernel"

inherit module

EXTRA_OEMAKE  = "ARCH=${ARCH}"
EXTRA_OEMAKE += "KSRC=${STAGING_KERNEL_BUILDDIR}"

MODULES_INSTALL_TARGET="install"

do_install () {
    install -d ${D}${nonarch_base_libdir}/modules/${KERNEL_VERSION}/kernel/drivers/net/wireless
    install -m 0644 ${B}/8812au.ko ${D}${nonarch_base_libdir}/modules/${KERNEL_VERSION}/kernel/drivers/net/wireless/rtl8812au.ko
}

FILES_${PN} += "${nonarch_base_libdir}/modules/${KERNEL_VERSION}/kernel/drivers/net/wireless/rtl8812au.ko"
RPROVIDES_${PN} += "kernel-module-${PN}-${KERNEL_VERSION}"

