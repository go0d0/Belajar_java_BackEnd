package com.example.demo;



import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@EnableKafka
@SpringBootApplication
public class BelajarKafkaApplication {

	public static void main(String[] args) {
		SpringApplication.run(BelajarKafkaApplication.class, args);
	}

}
