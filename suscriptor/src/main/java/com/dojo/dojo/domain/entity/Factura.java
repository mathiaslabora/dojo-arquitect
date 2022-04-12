package com.dojo.dojo.domain.entity;

import java.time.LocalDate;
import java.util.Locale;
import java.util.UUID;

public class Factura {

    private String id;
    private LocalDate date;
    private Double total;
    private String orderId;

    public Factura(Double total, String orderId) {
        this.id =  UUID.randomUUID().toString().substring(0, 5);
        this.date = LocalDate.now();
        this.total = total;
        this.orderId = orderId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }
}
