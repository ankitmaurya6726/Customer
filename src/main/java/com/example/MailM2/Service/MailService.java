package com.example.MailM2.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class MailService {

    @Autowired
    
    private JavaMailSender  mailSender;

    public String sendMail(String to, String name, Long customerId) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo(to);
        message.setSubject("Movie Booking Registration");
        message.setText("Hi " + name + ",\n\nThank you for registering.\nYour Customer ID is: " + customerId);

        mailSender.send(message);

        return "Mail sent successfully!";
    }
}

