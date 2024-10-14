package com.bsm.runner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import lombok.extern.apachecommons.CommonsLog;
@Component
public class ShowAllActorsRunner implements CommandLineRunner{
	@Autowired
	private RestTemplate template;
	@Override
	public void run(String... args) throws Exception {
		String serviceUrl="http://localhost:4040/RestMiniProject/all";
		ResponseEntity<String> response = template.getForEntity(serviceUrl,String.class);
		System.out.println("response body(result)::"+response.getBody());
		System.out.println("response headers"+response.getHeaders());
		System.out.println("response status code"+response.getStatusCode().value());
//	String result = template.getForObject(serviceUrl,String.class);
//    System.out.println(result);
	}
}
