package co.simplon.p25.restcountries;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// @SpringBootApplication(exclude = SecurityAutoConfiguration.class)
@SpringBootApplication
public class RestcountriesApiApplication {

    public static void main(String[] args) {
	SpringApplication.run(RestcountriesApiApplication.class, args);
    }
}
