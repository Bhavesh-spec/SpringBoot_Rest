package com.bsm.controller;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/customer")
public class CustomerOperationsController {
	@GetMapping("/report")
	public ResponseEntity<String> showCustomersReport() {
		return new ResponseEntity<String>("From GET-showReport Method", HttpStatus.OK);
	}
	@PostMapping("/register")
	public ResponseEntity<String> registerCustomer() {
		return new ResponseEntity<String>("From POST-registerCustomer Method", HttpStatus.OK);
	}
	@PutMapping("/modify")
	public ResponseEntity<String> updateCustomer() {
		return new ResponseEntity<String>("From put-registerCustomer Method", HttpStatus.OK);
	}
	@PatchMapping("/pmodify")
	public ResponseEntity<String> updateCustomerByNo() {
		return new ResponseEntity<String>("From patch-registerCustomer Method", HttpStatus.OK);
	}
	@DeleteMapping("/delete")
	public ResponseEntity<String> deleteCustomer() {
		return new ResponseEntity<String>("From DELETE-registerCustomer Method", HttpStatus.OK);
	}
}
//http://localhost:9091/BootProj_Rest_02-DifferentMethodsPOC/customer/report