package com.wildcodeschool.TindBwurgg.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MatchController {
	
	
	private static final String HEROKUAPP_URL = "https://hackathon-wild-hackoween.herokuapp.com";
	
	@GetMapping("/match")
	public String matchPage() {
		
		
		
		
		
		
		
		
    	return "match";
	}
}
