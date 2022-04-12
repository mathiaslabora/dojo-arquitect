package com.dojo.dojo.domain.service;

import com.dojo.dojo.domain.entity.Factura;
import org.springframework.stereotype.Service;

@Service
public class facturaService {

    public Factura createFact() {
       return new Factura(500.0, "123");
    }
}
