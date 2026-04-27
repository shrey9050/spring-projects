package com.example.service;

import com.example.PaymentService;
import com.example.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    private ProductRepository productRepository;
    private PaymentService paymentService;

    @Autowired
    public ProductService(ProductRepository productRepository , PaymentService paymentService) {
        this.productRepository = productRepository;
        this.paymentService = paymentService;
    }

    public void purchaseProductById(int id){
        String product = productRepository.findProductById(id);
        System.out.println("Purchasing : " + product);
        paymentService.paymentMethod(product);

    }

    public void getAllProduct(){
        productRepository.getAllProducts();
    }




}
