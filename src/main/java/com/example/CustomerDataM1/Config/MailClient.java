package com.example.CustomerDataM1.Config;

import java.util.Map;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name="mail-service", url = "http://localhost:8082")

public interface MailClient {

	@PostMapping("/api/mail/send")
	String sendMail(@RequestBody Map<String, Object> payload);
}
