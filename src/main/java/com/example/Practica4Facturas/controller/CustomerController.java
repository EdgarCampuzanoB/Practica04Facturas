package com.example.Practica4Facturas.controller;

import com.example.Practica4Facturas.service.CustomerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CustomerController {
    CustomerService customerService;

    @GetMapping("/customerPage")
    public String customerPage(Model model){
        model.addAttribute("customers", customerService.getProducts());
    }
}
