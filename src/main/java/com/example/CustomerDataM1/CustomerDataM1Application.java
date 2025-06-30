package com.example.CustomerDataM1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients(basePackages = "com.example.CustomerDataM1.Config")
public class CustomerDataM1Application {

	public static void main(String[] args) {
		SpringApplication.run(CustomerDataM1Application.class, args);
	}

}
