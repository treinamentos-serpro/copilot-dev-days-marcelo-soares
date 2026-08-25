package com.socops;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Entry point for the Soc Ops Spring Boot application.
 * Serves the social bingo game for in-person mixers.
 */
@SpringBootApplication
public class SocOpsApplication {

    public static void main(String[] commandLineArgs) {
        SpringApplication.run(SocOpsApplication.class, commandLineArgs);
    }
}
