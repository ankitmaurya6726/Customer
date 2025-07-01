package com.example.MailM2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;


@EnableFeignClients
@SpringBootApplication
public class MailM2Application {

	public static void main(String[] args) {
		SpringApplication.run(MailM2Application.class, args);
	}

}
