package com.example.ecommerceprototype.model;

import javax.persistence.*;
import java.io.Serializable;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;


@Entity
@Table(name = "product")
public class Product implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "productName")
    @NotBlank
    @Size(max=50)
    private String name;

    @Column(name = "imageUrl")
    private String imageUrl;

    @Column(name = "description")
    @NotBlank
    @Size(max = 500)
    private String description;

    @Column(name = "brand")
    @NotBlank
    @Size(max=50)
    private String brand;

    @Column(name = "price")
    @NotBlank
    @Size(max=30)
    private double price;

    public Product() {
    }

    public Product(@NotBlank @Size(max = 50) String name, @NotBlank @Size(max = 50) String brand, @NotBlank @Size(max = 30) double price) {
        this.name = name;
        this.brand = brand;
        this.price = price;
    }

    public Product(@NotBlank @Size(max = 50) String name, @NotBlank @Size(max = 500) String description, @NotBlank @Size(max = 50) String brand, @NotBlank @Size(max = 30) double price) {
        this.name = name;
        this.description = description;
        this.brand = brand;
        this.price = price;
    }

    public Product(@NotBlank @Size(max = 50) String name, String imageUrl, @NotBlank @Size(max = 500) String description, @NotBlank @Size(max = 50) String brand, @NotBlank @Size(max = 30) double price) {
        this.name = name;
        this.imageUrl = imageUrl;
        this.description = description;
        this.brand = brand;
        this.price = price;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
