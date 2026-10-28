
package com.example.springbootdemo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
public class SpringbootdemoApplication implements CommandLineRunner {


    @Autowired
    Map<String, NotificationService> notificationServiceMap = new HashMap<>();

  

	public static void main(String[] args) {
		SpringApplication.run(SpringbootdemoApplication.class, args);
	}

    @Override
    public void run(String... args) throws Exception {
        // notificationService = new WhatsAppService();
        // notificationService.send("Stream is live");
        for (var notificationService : notificationServiceMap.entrySet()) {
            notificationService.getValue().send("Stream is live");
    }

}}