package org.kein;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EventuateApplication {


    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(EventuateApplication.class);
        application.run(args);
    }
}
