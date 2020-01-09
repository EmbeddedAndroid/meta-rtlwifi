SUMMARY = "RTL8821CU kernel driver (wifi)"
DESCRIPTION = "RTL8821CU kernel driver"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://Kconfig;md5=bc2a2406eb72158dee196a8486a2aec9"

SRCREV = "3d9d2401a8912fd96efdec3bf0c88a4e8bab2d76"
SRC_URI = "git://github.com/spriteguard/rtl8821CU;protocol=https "

S = "${WORKDIR}/git"

PV = "1.0-git"

DEPENDS = "virtual/kernel"

inherit module

EXTRA_OEMAKE  = "ARCH=${ARCH}"
EXTRA_OEMAKE += "KSRC=${STAGING_KERNEL_BUILDDIR}"

MODULES_INSTALL_TARGET="install"

do_install () {
    install -d ${D}${nonarch_base_libdir}/modules/${KERNEL_VERSION}/kernel/drivers/net/wireless
    install -m 0644 ${B}/8821cu.ko ${D}${nonarch_base_libdir}/modules/${KERNEL_VERSION}/kernel/drivers/net/wireless/rtl8821cu.ko
}

FILES_${PN} += "${nonarch_base_libdir}/modules/${KERNEL_VERSION}/kernel/drivers/net/wireless/rtl8821cu.ko"
RPROVIDES_${PN} += "kernel-module-${PN}-${KERNEL_VERSION}"

