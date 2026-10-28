package com.example.springbootdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration 
public class AppConfig {
    @Bean 
    NotificationService notificationService(){

        System.out.println("Before creating NotificationService");
        return new NotificationService();
    }

}
