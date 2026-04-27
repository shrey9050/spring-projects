package com.example.controller;

import com.example.service.ProductService;
import org.springframework.stereotype.Controller;

@Controller
public class ProductController {

    private ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    public void buyProduct(int id){
        productService.purchaseProductById(id);
    }

    public void listAllProducts(){
        productService.getAllProduct();


    }


}
