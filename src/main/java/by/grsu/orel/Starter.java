package by.grsu.orel;

import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Starter {
	private static final Logger logger = Logger.getLogger(Starter.class);

	public static void main(String[] args) {
		SpringApplication.run(Starter.class, args);
	}
}
