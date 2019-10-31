package com.wildcodeschool.TindBwurgg.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

	@Controller
	public class ErreurControlleur {
		
		
		@GetMapping("/404")

		public String erreur() {
			
    	return "404";
		}
	}


