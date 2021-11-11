package com.example.Practica4Facturas.entity;

import java.io.Serializable;
import java.util.List;

public class Customer implements Serializable {
    private Integer id;
    private String name;
    private String Lastname;
    private String email;
    private List<Invoice>invoiceList;

    public Customer(Integer id, String name, String lastname, String email) {
        this.id = id;
        this.name = name;
        Lastname = lastname;
        this.email = email;
    }

    public Customer(Integer id, String name, String lastname, String email, List<Invoice> invoiceList) {
        this.id = id;
        this.name = name;
        Lastname = lastname;
        this.email = email;
        this.invoiceList = invoiceList;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return Lastname;
    }

    public void setLastname(String lastname) {
        Lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Invoice> getInvoiceList() {
        return invoiceList;
    }

    public void setInvoiceList(List<Invoice> invoiceList) {
        this.invoiceList = invoiceList;
    }
}
