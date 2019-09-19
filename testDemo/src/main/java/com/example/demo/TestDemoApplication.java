package com.example.demo;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = { "com.example.*" })
@ComponentScan("com.example.*")
@EntityScan("com.example.model")
@EnableJpaRepositories("com.example.repo")

public class TestDemoApplication {
	final static Logger logger=Logger.getLogger(TestDemoApplication.class);

	public static void main(String[] args) {
		
		PropertyConfigurator.configure("log4j.properties");
		 logger.debug("Debugging log");
	        logger.info("Info log");
	        logger.warn("Warning log");
	        logger.error("Error log");
	        logger.fatal("Fatal log");
		
		SpringApplication.run(TestDemoApplication.class, args);
	}

}
