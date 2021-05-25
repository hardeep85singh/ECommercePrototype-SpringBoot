package com.example.ecommerceprototype.repository;

import com.example.ecommerceprototype.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

    @Query("SELECT p FROM Product WHERE p.productName LIKE %?1%")
    List<Product> getProductByName(String name);
}
