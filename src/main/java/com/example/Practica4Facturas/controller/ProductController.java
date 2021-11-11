package com.example.Practica4Facturas.controller;

import com.example.Practica4Facturas.entity.Product;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ProductController {
    @GetMapping("/product")
    public String productForm(Model model){
        model.addAttribute("product", new Product());
        return "productoForm";
    }

    @PostMapping("/productList")
    public String productSubmit(@ModelAttribute Product product){
        return "productList";
    }
}
