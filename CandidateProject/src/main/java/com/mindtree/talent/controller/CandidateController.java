package com.mindtree.talent.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CandidateController {

		
	@GetMapping("/send")
	public String getMessage() {
		return "Working";
	}
	
}
