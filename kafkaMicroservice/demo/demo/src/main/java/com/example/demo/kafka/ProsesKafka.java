package com.example.demo.kafka;

import org.springframework.stereotype.Service;
import org.springframework.kafka.annotation.KafkaListener;

@Service
public class ProsesKafka{
  
  
  @KafkaListener (topics ="topiknya", groupId="belajar")
  public void jalan(String data){
    System.out.println("diterima:"+data);
  }
}