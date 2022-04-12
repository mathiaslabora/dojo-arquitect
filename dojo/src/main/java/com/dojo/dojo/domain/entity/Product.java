package com.dojo.dojo.domain.entity;

import java.util.UUID;

public class Product {
    private String id= UUID.randomUUID().toString().substring(0, 5);
    private String name;
    private Double price;

    public Product( String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public Product(String id, String name, Double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
