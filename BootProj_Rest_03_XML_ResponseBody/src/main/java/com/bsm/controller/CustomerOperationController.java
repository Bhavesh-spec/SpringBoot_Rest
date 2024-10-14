package com.bsm.controller;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.bsm.model.Customer;

@RestController
//"C:\Users\Bhavesh\Pictures\Screenshots\Screenshot 2024-09-03 175104.png"
public class CustomerOperationController {
	@GetMapping("/report")
  public Customer showData() {
	Customer cust = new Customer(101,"raja","hyd",44545.77f);
	return cust;
}
//	@GetMapping("/report")
//	public ResponseEntity<Customer> showData() {
//		Customer cust = new Customer(101,"raja","hyd",44545.77f);
//		return new ResponseEntity<Customer>(cust, HttpStatus.OK);
//	}
}
