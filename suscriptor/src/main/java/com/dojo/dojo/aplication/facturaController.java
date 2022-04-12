package com.dojo.dojo.aplication;


import com.dojo.dojo.domain.entity.Factura;
import com.dojo.dojo.domain.service.facturaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class facturaController {
    @Autowired
    private facturaService facturaService;

    @GetMapping("/factura")
    public Factura crearFactura() {
        return facturaService.createFact();
    }




}
