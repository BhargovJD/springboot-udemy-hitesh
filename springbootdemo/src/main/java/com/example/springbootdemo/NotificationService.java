package com.example.springbootdemo;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component 
public class NotificationService {
    public void send(){
        System.out.println("Sending notification");
    }

    @PostConstruct
    public void afterInit(){
        System.out.println("Before notification bean is used");
    }

    @PreDestroy
    public void beforeDestroy(){
        System.out.println("Before notification bean is destroyed");
    }


}
