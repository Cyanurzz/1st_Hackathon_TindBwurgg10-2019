package com.wildcodeschool.TindBwurgg.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.wildcodeschool.TindBwurgg.FilmFromJson;
import com.wildcodeschool.TindBwurgg.model.Film;

@Controller
public class MatchController {
	
	
	@GetMapping("/match")
	public String matchPage(Model model) {

		model.addAttribute("film", FilmFromJson.getMyFilm());

			return "match";
		
	}
}
