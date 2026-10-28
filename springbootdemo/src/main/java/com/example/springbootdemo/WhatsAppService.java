package com.example.springbootdemo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary 
public class WhatsAppService implements NotificationService {
    @Override
    public void send(String title) {
        System.out.println("Sending notification to WhatsApp: " + title);
    }
}
