package com.example.orderService.controller;


import com.example.orderService.model.Order;
import com.example.orderService.producer.diProses;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;




@RestController
@RequestMapping("/awal")
public class kendali {
    

    @Autowired
    private diProses ds;

    @PostMapping("/jalan")
    public String pesan(@RequestBody Order order){
        ds.kirim(order);
        return  "order dikirim";
    }
}
