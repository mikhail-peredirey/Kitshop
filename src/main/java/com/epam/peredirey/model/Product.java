package com.epam.peredirey.model;

/**
 * Created by mikhail.peredirey on 03.07.2015.
 */
public class Product {
    private final String vendor;
    private final String model;
    private final Integer ports;
    private final String firmware;
    private final String feature;

    Product(final ProductBuilder productBuilder) {
        this.vendor = productBuilder.getVendor();
        this.model = productBuilder.getModel();
        this.ports = productBuilder.getPorts();
        this.firmware = productBuilder.getFirmware();
        this.feature = productBuilder.getFeature();
    }

    public String getVendor() {
        return vendor;
    }

    public String getModel() {
        return model;
    }

    public Integer getPorts() {
        return ports;
    }

    public String getFirmware() {
        return firmware;
    }

    public String getFeature() {
        return feature;
    }
}




