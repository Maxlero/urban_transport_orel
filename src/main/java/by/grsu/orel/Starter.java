package by.grsu.orel;

import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Main Spring class. It will start the project
 */
@SpringBootApplication
public class Starter {
    private static final Logger logger = Logger.getLogger(Starter.class);

    public static void main(String[] args) {
        SpringApplication.run(Starter.class, args);
    }
}
