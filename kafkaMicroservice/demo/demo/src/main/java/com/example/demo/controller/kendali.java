package com.example.demo.controller;

import com.example.demo.kafka.kafkaProducerService;


import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;


@RestController
@RequestMapping("/awal")
public class kendali{
  
  
  private final kafkaProducerService ke;
  
  public kendali(kafkaProducerService ke){
    this.ke=ke;
    
  }
  
  @PostMapping
  public ResponseEntity<String> buat(@RequestParam String data){
    ke.proses(data);
   return    ResponseEntity.ok("kirim: "+ data);
  }
}
