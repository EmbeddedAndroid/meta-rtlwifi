SUMMARY = "RTL8821CU kernel driver (wifi)"
DESCRIPTION = "RTL8821CU kernel driver"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://Kconfig;md5=bc2a2406eb72158dee196a8486a2aec9"

SRCREV = "5e3e572007cb4f0802b4c3a8462742879dcd5e48"
SRC_URI = "git://github.com/wifi-securities/rtl8821CU;protocol=https "

S = "${WORKDIR}/git"

PV = "1.0-git"

DEPENDS = "virtual/kernel"

inherit module

EXTRA_OEMAKE  = "ARCH=${ARCH}"
EXTRA_OEMAKE += "KSRC=${STAGING_KERNEL_BUILDDIR}"

#do_compile () {
#    unset LDFLAGS
#    oe_runmake
#}

MODULES_INSTALL_TARGET="install"

do_install () {
    install -d ${D}${nonarch_base_libdir}/modules/${KERNEL_VERSION}/kernel/drivers/net/wireless
    install -m 0644 ${B}/8821cu.ko ${D}${nonarch_base_libdir}/modules/${KERNEL_VERSION}/kernel/drivers/net/wireless/rtl8821cu.ko
}

FILES_${PN} += "${nonarch_base_libdir}/modules/${KERNEL_VERSION}/kernel/drivers/net/wireless/rtl8821cu.ko"
RPROVIDES_${PN} += "kernel-module-${PN}-${KERNEL_VERSION}"

