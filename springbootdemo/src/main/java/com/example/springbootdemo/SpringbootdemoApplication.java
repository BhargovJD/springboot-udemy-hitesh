
package com.example.springbootdemo;

// Imports the Autowired annotation for dependency injection
import org.springframework.beans.factory.annotation.Autowired;

// Allows code to execute after the Spring Boot application starts
import org.springframework.boot.CommandLineRunner;

// Used to start the Spring Boot application
import org.springframework.boot.SpringApplication;

// Enables Spring Boot auto-configuration and component scanning
import org.springframework.boot.autoconfigure.SpringBootApplication;

// Remove this import because it is not used in this program
// import tools.jackson.databind.annotation.JsonAppend.Attr;

@SpringBootApplication
// Marks this as the main Spring Boot application class
// CommandLineRunner allows us to execute code after startup
public class SpringbootdemoApplication implements CommandLineRunner {

    // Asks Spring to inject the NotificationService object automatically
    @Autowired
    NotificationService notificationService;

    // The main() method is the starting point of the Java application
    public static void main(String[] args) {

        // Starts Spring Boot and creates the Spring application context
        SpringApplication.run(SpringbootdemoApplication.class, args);
    }

    // Spring Boot automatically calls this method after startup
    @Override
    public void run(String... args) throws Exception {

        // Calls the send() method of NotificationService
        notificationService.send();
    }
}
