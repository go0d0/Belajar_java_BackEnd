package com.example.demo.kafka;


import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class kafkaProducerService{
   
   
   public final KafkaTemplate<String, String> kt ;
   public static final String  topic = "topiknya";
  
  public kafkaProducerService(KafkaTemplate<String, String> kt){
    this.kt = kt;
  }
  
  public void proses(String data){
    kt.send(topic, data);
    System.out.println("kirim:" + data);
  }
  
}
