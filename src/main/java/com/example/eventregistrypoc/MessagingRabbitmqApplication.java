package com.example.eventregistrypoc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class MessagingRabbitmqApplication {

	public static void main(String[] args) {
		System.out.println("Hello");
		SpringApplication.run(MessagingRabbitmqApplication.class, args);
	}

}


