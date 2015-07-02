package com.epam.peredirey.model;


import java.util.ArrayList;
import java.util.List;

public class ProductsShop {
    private static List<Product> products = new ArrayList<>();

    public static final List<Product> getProductsList() {
        products.add(new ProductBuilder()
                .vendor("Cisco")
                .model("2940")
                .ports(10)
                .firmware("Cisc2940-K9")
                .feature("STP")
                .build());
        products.add(new ProductBuilder()
                .vendor("D-Link")
                .model("DES-3200")
                .ports(18)
                .firmware("DES-FIRMWARE-3.0.0")
                .feature("RSTP")
                .build());
        products.add(new ProductBuilder()
                .vendor("HP")
                .model("ProCurve2910")
                .ports(48)
                .firmware("HP-PROCURVE")
                .feature("LACP")
                .build());
        products.add(new ProductBuilder()
                .vendor("Zyxel")
                .model("ES-2108")
                .ports(10)
                .firmware("ZYXEL-FIRMWARE")
                .feature("SFP+")
                .build());
        return products;
    }
}