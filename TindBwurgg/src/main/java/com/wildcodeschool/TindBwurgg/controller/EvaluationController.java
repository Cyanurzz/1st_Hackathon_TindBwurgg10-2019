package com.wildcodeschool.TindBwurgg.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EvaluationController {
	
	
	@GetMapping("/evaluation")
	public String evaluationPage() {
    	return "evaluation";
	}
}
