package com.dojo.dojo.domain.entity;

import java.util.List;
import java.util.UUID;

public class Order {
    private String id= UUID.randomUUID().toString().substring(0, 5);
    private String nameClient;
    private List<Product> productList;

  /*  public Order( String nameClient, List<Product> productList) {
        this.nameClient = nameClient;
        this.productList = productList;
    }*/

    public Order(String id, String nameClient, List<Product> productList) {
        this.id = id;
        this.nameClient = nameClient;
        this.productList = productList;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNameClient() {
        return nameClient;
    }

    public void setNameClient(String nameClient) {
        this.nameClient = nameClient;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }
}
