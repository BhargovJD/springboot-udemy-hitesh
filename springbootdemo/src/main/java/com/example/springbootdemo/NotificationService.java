
package com.example.springbootdemo;

public interface NotificationService {

    // Every implementing class must provide the send() method
    void send(String title);
}
