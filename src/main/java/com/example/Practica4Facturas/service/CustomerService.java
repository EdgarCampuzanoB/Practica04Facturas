package com.example.Practica4Facturas.service;

import com.example.Practica4Facturas.entity.Product;
import com.example.Practica4Facturas.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

    @Autowired
    CustomerRepository customerRepository;

    public List<Product> getCustomer(){
        return  customerRepository.getCustomerList();
    }
}
