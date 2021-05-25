package com.example.ecommerceprototype.controller;

import com.example.ecommerceprototype.model.Product;
import com.example.ecommerceprototype.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping("/product")
    public ResponseEntity<String> addProduct(@RequestBody Product product){
        productService.addProduct(product);

        URI uri = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("").buildAndExpand().toUri();
        return ResponseEntity.created(uri).build();
    }

    @GetMapping("/product/{name}")
    public List<Product> getProductByName(@PathVariable String name){
        return productService.getProductByName(name);
    }
}
