package com.example.notifService.consumer;

import com.example.notifService.model.Order;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class ambil {
      @KafkaListener(topics = "order-topic", groupId = "notification-group")
    public void listen(Order order) {
        System.out.println("Received Order: " + order.getOrderId() + " - " + order.getProduct());
    }
}
