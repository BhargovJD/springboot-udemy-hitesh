package com.example.springbootdemo;

public class telegramService implements NotificationService {
    @Override
    public void send(String title) {
        System.out.println("Sending notification to Telegram: " + title);
    }
}
