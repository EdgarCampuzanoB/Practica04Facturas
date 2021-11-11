package com.example.Practica4Facturas.entity;

public class Product {
    private Integer code;
    private String nameProduct;
    private String description;
    private String brand;
    private String model;
    private Double price;

    public Product() {
    }

    public Product(Integer code, String nameProduct, String description, String brand, String model, Double price) {
        this.code = code;
        this.nameProduct = nameProduct;
        this.description = description;
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
