package com.manipal.Finance.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController

public class HomeController{
	
	@GetMapping("/")
	public String home() {
		
		String finance="i am gonna make a fintech application right now i ll kill the lab endsem";
		
		return finance;
		
	}
}