package com.danielhessell.notifierms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class NotifiermsApplication {

	public static void main(String[] args) {
		SpringApplication.run(NotifiermsApplication.class, args);
	}

}
