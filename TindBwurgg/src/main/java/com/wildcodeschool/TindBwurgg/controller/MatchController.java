package com.wildcodeschool.TindBwurgg.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.wildcodeschool.TindBwurgg.FilmFromJson;
import com.wildcodeschool.TindBwurgg.MonsterFromJson;
import com.wildcodeschool.TindBwurgg.model.Film;

@Controller
public class MatchController {
	
	
	@GetMapping("/match")
	public String matchPage(@RequestParam(value="name") String monsterParm, ModelMap modelMap) {
		modelMap.put("matchMonster", monsterParm);
		modelMap.addAttribute("film", FilmFromJson.getMyFilm());
		
			return "match";
	}
	
}
