package com.bazlur.cafebabe;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
public class CafebabeApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(CafebabeApplication.class, args);
    }
}
