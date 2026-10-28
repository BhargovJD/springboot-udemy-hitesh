package com.example.springbootdemo;

import org.springframework.stereotype.Component;

@Component 
public class NotificationService {
    public void send(){
        System.out.println("Sending notification");
    }


}
