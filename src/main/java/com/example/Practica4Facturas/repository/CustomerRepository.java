package com.example.Practica4Facturas.repository;

import com.example.Practica4Facturas.entity.Product;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class CustomerRepository {
    private List<Product> customerList = new ArrayList<>();

    public List<Product> getCustomerList() {
        return customerList;
    }

    public void setCustomerList(List<Product> customerList) {
        this.customerList = customerList;
    }
}
