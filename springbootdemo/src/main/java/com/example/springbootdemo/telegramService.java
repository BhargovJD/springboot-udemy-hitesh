package com.example.springbootdemo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;


@Component
@Qualifier("telegram")
@ConditionalOnProperty(name = "notification.type", havingValue = "tele")
public class telegramService implements NotificationService {

    public void send(String title) {
        System.out.println("Sending notification to Telegram: " + title);
    }
}
