Realtek wifi chipsets
=====================

(2022-12-20)

* https://www.realtek.com/en/products/communications-network-ics/category/wireless-lan-ics
* https://wikidevi.wi-cat.ru/Realtek




Chipset naming convention
-------------------------

Newer chipsets follow this naming scheme:

```
RTLnnnnXU
   |___||
     |  |____ interface type. U = "USB", E = "PCIe", S/TF/TV = "SDIO/UART
     |
     |
     |_______ chipset number, like 8811A
```




USB WLAN adapter support for Yocto
----------------------------------

- [RTL8192EU](https://www.realtek.com/en/products/communications-network-ics/item/rtl8192eu) - driver included [in this layer](./recipes-bsp/drivers/rtl8192eu.bb)
- [RTL8723BU](https://www.realtek.com/en/products/communications-network-ics/item/rtl8723bu) - driver included [in this layer](./recipes-bsp/drivers/rtl8723bu.bb)
- [RTL8723DU](https://www.realtek.com/en/products/communications-network-ics/item/rtl8723du) - driver in [kernel since 6.2](https://wireless.wiki.kernel.org/en/users/drivers/rtl819x), driver included [in this layer](./recipes-bsp/drivers/rtl8723du.bb)
- RTL8731AU - driver included [in this layer](./recipes-bsp/drivers/rtl8821cu.bb)
- [RTL8811AU](https://www.realtek.com/en/products/communications-network-ics/item/rtl8811au) - driver included [in this layer](./recipes-bsp/drivers/rtl8821au.bb)
- [RTL8811CU](https://www.realtek.com/en/products/communications-network-ics/item/rtl8811cu) - driver included [in this layer](./recipes-bsp/drivers/rtl8821cu.bb)
- [RTL8812AU](https://www.realtek.com/en/products/communications-network-ics/item/rtl8812au) - driver included [in this layer](./recipes-bsp/drivers/rtl8812au.bb)
- [RTL8812BU](https://www.realtek.com/en/products/communications-network-ics/item/rtl8812bu) - driver included [in this layer](./recipes-bsp/drivers/rtl88x2bu.bb)
- [RTL8814AU](https://www.realtek.com/en/products/communications-network-ics/item/rtl8814au) - driver included [in this layer](./recipes-bsp/drivers/rtl8814au.bb)
- [RTL8821AU](https://www.realtek.com/en/products/communications-network-ics/item/rtl8821au) - driver included [in this layer](./recipes-bsp/drivers/rtl8821au.bb)
- [RTL8821CU](https://www.realtek.com/en/products/communications-network-ics/item/rtl8821cu) - driver included [in Linux Kernel since 6.2](https://wireless.wiki.kernel.org/en/users/drivers/rtl819x), driver included [in this layer](./recipes-bsp/drivers/rtl8821cu.bb)
- [RTL8822BU](https://www.realtek.com/en/products/communications-network-ics/item/rtl8822bu) - driver included [in Linux Kernel since 6.2](https://wireless.wiki.kernel.org/en/users/drivers/rtl819x), driver included [in this layer](./recipes-bsp/drivers/rtl88x2bu.bb)
- RTL8822CU  - driver included [in Linux Kernel since 6.2](https://wireless.wiki.kernel.org/en/users/drivers/rtl819x)




Other Realtek adapters
----------------------

### 802.11ac/abgn

- [RTL8811AE](https://www.realtek.com/en/products/communications-network-ics/item/rtl8811ae)
- [RTL8812AE](https://www.realtek.com/en/products/communications-network-ics/item/rtl8812ae)
- [RTL8812AR](https://www.realtek.com/en/products/communications-network-ics/item/rtl8812ar)
- [RTL8812BRH](https://www.realtek.com/en/products/communications-network-ics/item/rtl8812brh)
- [RTL8814AE](https://www.realtek.com/en/products/communications-network-ics/item/rtl8814ae)
- [RTL8814AR](https://www.realtek.com/en/products/communications-network-ics/item/rtl8814ar)




### 802.11ac/abgn Combo

- [RTL8821AE](https://www.realtek.com/en/products/communications-network-ics/item/rtl8821ae) - driver included [in Linux Kernel since 3.16](https://wireless.wiki.kernel.org/en/users/drivers/rtl819x)
- [RTL8821AS](https://www.realtek.com/en/products/communications-network-ics/item/rtl8821as)
- [RTL8821CE](https://www.realtek.com/en/products/communications-network-ics/item/rtl8821ce) - driver included [in Linux Kernel](https://wireless.wiki.kernel.org/en/users/drivers/rtl819x)
- [RTL8821CS](https://www.realtek.com/en/products/communications-network-ics/item/rtl8821cs) - driver included [in Linux Kernel since 6.2](https://wireless.wiki.kernel.org/en/users/drivers/rtl819x)
- [RTL8822BE](https://www.realtek.com/en/products/communications-network-ics/item/rtl8822be) - driver included [in Linux Kernel since 6.2](https://wireless.wiki.kernel.org/en/users/drivers/rtl819x)
- [RTL8822BEH-VR](https://www.realtek.com/en/products/communications-network-ics/item/rtl8822beh-vr)
- [RTL8822BS](https://www.realtek.com/en/products/communications-network-ics/item/rtl8822bs)



### 802.11bgn

- [RTL8188EE](https://www.realtek.com/en/products/communications-network-ics/item/rtl8188ee) - driver included [in Linux Kernel](https://wireless.wiki.kernel.org/en/users/drivers/rtl819x)
- [RTL8188ETV](https://www.realtek.com/en/products/communications-network-ics/item/rtl8188etv)
- [RTL8188EUS](https://www.realtek.com/en/products/communications-network-ics/item/rtl8188eus) - driver included [in Linux Kernel](https://wireless.wiki.kernel.org/en/users/drivers/rtl819x)
- [RTL8188FTV](https://www.realtek.com/en/products/communications-network-ics/item/rtl8188ftv)
- [RTL8189EM](https://www.realtek.com/en/products/communications-network-ics/item/rtl8189em)
- [RTL8189EM-VI](https://www.realtek.com/en/products/communications-network-ics/item/rtl8189em-vi)
- [RTL8189ES](https://www.realtek.com/en/products/communications-network-ics/item/rtl8189es)
- [RTL8189ETV](https://www.realtek.com/en/products/communications-network-ics/item/rtl8189etv)
- [RTL8189FTV](https://www.realtek.com/en/products/communications-network-ics/item/rtl8189ftv)
- [RTL8192EE](https://www.realtek.com/en/products/communications-network-ics/item/rtl8192ee) - driver included [in Linux Kernel](https://wireless.wiki.kernel.org/en/users/drivers/rtl819x)
- [RTL8192ER](https://www.realtek.com/en/products/communications-network-ics/item/rtl8192er)
- [RTL8192ES](https://www.realtek.com/en/products/communications-network-ics/item/rtl8192es)
- [RTL8194AR](https://www.realtek.com/en/products/communications-network-ics/item/rtl8194ar)



### 802.11bgn Combo

- [RTL8723BE](https://www.realtek.com/en/products/communications-network-ics/item/rtl8723be) - driver in [kernel since 3.15](https://wireless.wiki.kernel.org/en/users/drivers/rtl819x)
- [RTL8723BS](https://www.realtek.com/en/products/communications-network-ics/item/rtl8723bs) - driver in [kernel staging since 5.15](https://wireless.wiki.kernel.org/en/users/drivers/rtl819x)
- [RTL8723DE](https://www.realtek.com/en/products/communications-network-ics/item/rtl8723de) - driver in [kernel since 6.2](https://wireless.wiki.kernel.org/en/users/drivers/rtl819x)
- [RTL8723DS](https://www.realtek.com/en/products/communications-network-ics/item/rtl8723ds) - driver in [kernel since 6.2](https://wireless.wiki.kernel.org/en/users/drivers/rtl819x)

