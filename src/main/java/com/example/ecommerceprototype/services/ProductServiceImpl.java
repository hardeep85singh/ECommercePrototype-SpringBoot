package com.example.ecommerceprototype.services;

import com.example.ecommerceprototype.model.Product;
import com.example.ecommerceprototype.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("productService")
public class ProductServiceImpl implements ProductService{

    @Autowired
    ProductRepository productRepository;

    @Override
    public Product addProduct(Product product) {
        return productRepository.save(product);
    }

    @Override
    public List<Product> getProductByName(String name) {
        return productRepository.getProductByName(name);
    }
}
