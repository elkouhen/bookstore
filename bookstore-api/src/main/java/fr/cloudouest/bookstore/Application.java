package fr.cloudouest.bookstore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// Comme
@SpringBootApplication(scanBasePackages = "fr.cloudouest.bookstore")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
