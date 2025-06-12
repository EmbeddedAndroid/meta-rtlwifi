SUMMARY = "RTL8723 kernel driver (wifi + bluetooth)"
DESCRIPTION = "RTL8723 kernel driver"
LICENSE = "GPL-2.0-only"
LIC_FILES_CHKSUM = "file://Kconfig;md5=ce4c7adf40ddcf6cfca7ee2b333165f0"

FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"
PV = "4.3.6.11-git"
SRCREV = "92c19318cb54ef96c2cfb4a22b2c98eb512812d8"
SRC_URI = "git://github.com/lwfinger/rtl8723bu.git;protocol=https;branch=master \
           file://0002-realtek-Disable-IPS-mode.patch "

S = "${WORKDIR}/git"

DEPENDS = "virtual/kernel"

inherit module

EXTRA_OEMAKE  = "ARCH=${ARCH} \
                 KSRC=${STAGING_KERNEL_BUILDDIR} \
                 USER_EXTRA_CFLAGS='-DCONFIG_IOCTL_CFG80211 -DRTW_USE_CFG80211_STA_EVENT \
                 -fdebug-prefix-map=${WORKDIR}=. -fdebug-prefix-map=${TMPDIR}=. \
                 -fmacro-prefix-map=${WORKDIR}=. -fmacro-prefix-map=${TMPDIR}=. \
'"

do_compile () {
    oe_runmake
}

do_install () {
    install -d ${D}${nonarch_base_libdir}/modules/${KERNEL_VERSION}
    install -m 0755 ${B}/8723bu.ko ${D}${nonarch_base_libdir}/modules/${KERNEL_VERSION}/8723bu.ko

    install -d ${D}${sysconfdir}/modprobe.d
    echo "blacklist rtl8xxxu" > ${D}${sysconfdir}/modprobe.d/rtl8723-blacklist.conf
}

FILES:${PN} += "${sysconfdir}"
RDEPENDS:${PN} += "linux-firmware-rtl8723"
