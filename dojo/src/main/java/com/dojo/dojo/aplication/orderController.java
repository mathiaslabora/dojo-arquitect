package com.dojo.dojo.aplication;

import com.dojo.dojo.domain.entity.Order;
import com.dojo.dojo.domain.service.orderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class orderController {
    @Autowired
    private orderService orderService;


    @GetMapping("/order")
    public Order crearOrden() {
        return orderService.createOrder();
    }

}
