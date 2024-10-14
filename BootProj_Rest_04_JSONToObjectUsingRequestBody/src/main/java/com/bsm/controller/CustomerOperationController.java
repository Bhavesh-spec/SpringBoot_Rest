package com.bsm.controller;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.bsm.model.Customer;
@RestController
public class CustomerOperationController {
	@PostMapping("/register")
	public ResponseEntity<String> saveCustomer(@RequestBody Customer customer) {
		return new ResponseEntity<String>(customer.toString(),HttpStatus.OK);
	}
	//"C:\Users\Bhavesh\Pictures\Screenshots\Screenshot 2024-09-03 175328.png"
}
