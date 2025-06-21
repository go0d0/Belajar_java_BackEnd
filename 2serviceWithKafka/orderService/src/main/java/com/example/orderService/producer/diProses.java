package com.example.orderService.producer;

import com.example.orderService.model.Order;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;


@Service
public class diProses {
    

    @Autowired
    private KafkaTemplate<String, Order> kafkaTemplate;
private static final String Topic = "order-topic";

public void kirim(Order order){
    kafkaTemplate.send(Topic, order);
    System.out.println("Order telah dikirim: " + order.getOrderId());;
}
}
