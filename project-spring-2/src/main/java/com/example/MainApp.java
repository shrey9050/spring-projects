package com.example;

import com.example.config.AppConfig;
import com.example.controller.ProductController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context =
                 new AnnotationConfigApplicationContext(AppConfig.class);

        ProductController productController =
                context.getBean(ProductController.class);

        productController.listAllProducts();
        productController.buyProduct(4);
    }
}
