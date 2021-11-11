package com.example.Practica4Facturas.entity;


public class InvoiceLine {
    private Integer quantityProduct;

    public Integer getQuantityProduct() {
        return quantityProduct;
    }

    public void setQuantityProduct(Integer quantityProduct) {
        this.quantityProduct = quantityProduct;
    }

    public Double calculateAmount(){
        Product product = new Product();
        double amount;

        amount = product.getPrice() * quantityProduct;

        return amount;
    }
}
