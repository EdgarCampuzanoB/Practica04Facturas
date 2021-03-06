package com.example.Practica4Facturas.entity;

public class Product {
    private Integer id;
    private String nameProduct;
    private String description;
    private String brand;
    private String model;
    private Double price;

    public Product() {
    }

    public Product(Integer id, String nameProduct, String description, String brand, String model, Double price) {
        this.id = id;
        this.nameProduct = nameProduct;
        this.description = description;
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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
