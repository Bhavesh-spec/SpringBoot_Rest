package com.bsm.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.bsm.entity.Tourist;
import com.bsm.service.ITouristMgmtService;
@RestController
@RequestMapping("/tourist")
public class TouristOperationsController {
	@Autowired
	private ITouristMgmtService iTouristMgmtService;

	@PostMapping("/register")
	public ResponseEntity<String> enrollTourist(@RequestBody Tourist tourist) {
		try {
			String registerTourist = iTouristMgmtService.registerTourist(tourist);
			return new ResponseEntity<String>(registerTourist, HttpStatus.CREATED);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<String>("problem in tourist enrollment", HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	@GetMapping("/findAll")
	public ResponseEntity<?> displayTourists(){
		try {
			List<Tourist> list = iTouristMgmtService.fetchAllTourists();
			return new ResponseEntity<List<Tourist>>(list,HttpStatus.OK);
		} catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<String>("Problem in fetching Tourists",HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
