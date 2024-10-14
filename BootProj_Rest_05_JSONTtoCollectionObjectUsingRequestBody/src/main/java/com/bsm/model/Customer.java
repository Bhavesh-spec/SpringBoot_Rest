package com.bsm.model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;
@Data
public class Customer {
private Integer cno;
private String cname;
private List<Company> companiesList;
@JsonFormat(pattern = "yyyy-MM-dd")
private LocalDate dob;
private LocalDateTime purchaseDate;
private List<Map<String,Long>> family;

//{
//	  "cno": 123,
//	  "cname": "John Doe",
//	  "companiesList": [
//	    {
//	      "name": "GURJAR FLY",
//	      "location": "BANGLURU",
//	      "size":500
//	    },
//	    {
//	    	"name": "ACCENTURE",
//		      "location": "BANGLURU",
//		      "size":1000
//	    }
//	  ],
//	  "dob": "1985-10-25",
//	  "purchaseDate": "2024-09-03T14:30:00",
//	  "family": [
//	    {
//	      "father": 1,
//	      "mother": 2
//	    },
//	    {
//	      "brother": 3,
//	      "sister": 4
//	    }
//	  ]
//	}

}
