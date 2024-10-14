package com.bsm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class BootMsProj10ConsumerAppApplication {

	public RestTemplate createTemplate() {
		return new RestTemplate();
	}
	
	
	public static void main(String[] args) {
		SpringApplication.run(BootMsProj10ConsumerAppApplication.class, args);
	}
}
