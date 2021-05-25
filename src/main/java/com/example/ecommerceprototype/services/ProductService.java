package com.example.ecommerceprototype.services;

import com.example.ecommerceprototype.model.Product;

import java.util.List;


public interface ProductService {

    Product addProduct(Product product);

    List<Product> getProductByName(String name);

}
