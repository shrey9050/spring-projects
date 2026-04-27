package com.example.repository;

import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class ProductRepository {

    private Map<Integer, String> product =new HashMap<>();

    public ProductRepository() {
        product.put(1 , "Laptop");
        product.put(2 , "Phone");
        product.put(3 , "Aeroplane");
        product.put(4 , "Air Conditioner");
    }

    public String findProductById(int id){
        return product.get(id);
    }

    public void getAllProducts(){
        for (Map.Entry<Integer, String> entry : product.entrySet()) {
            System.out.println("ID: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}
