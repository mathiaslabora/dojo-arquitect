package com.dojo.dojo.domain.service;

import com.dojo.dojo.domain.entity.Order;
import com.dojo.dojo.domain.entity.Product;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class orderService {

    @Bean
    public Order createOrder() {
        List<Product> productos = new ArrayList<>();
        Product producto1 = new Product("123","Telefono", 500.0);
        Product producto2 = new Product("456","Notebook", 800.0);
        productos.add(producto1);
        productos.add(producto2);
        return new Order("789","Jorge", productos);
    }


}
