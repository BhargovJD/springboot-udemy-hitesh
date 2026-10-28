package com.example.springbootdemo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


@Component
@Qualifier("telegram")
public class telegramService implements NotificationService {

    public void send(String title) {
        System.out.println("Sending notification to Telegram: " + title);
    }
}
