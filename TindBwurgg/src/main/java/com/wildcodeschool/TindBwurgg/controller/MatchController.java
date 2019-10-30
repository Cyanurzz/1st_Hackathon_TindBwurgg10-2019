package com.wildcodeschool.TindBwurgg.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MatchController {
	
	
	@GetMapping("/match")
	public String matchPage(Model model) {

		
    	return "match";
	}
}
