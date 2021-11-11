package com.example.Practica4Facturas.service;

import com.example.Practica4Facturas.entity.Product;
import com.example.Practica4Facturas.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    ProductRepository productRepository;

    public List<Product> getProducts(){
        return  productRepository.getProductList();
    }
}
