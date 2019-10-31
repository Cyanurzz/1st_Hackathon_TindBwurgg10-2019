package com.wildcodeschool.TindBwurgg.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.wildcodeschool.TindBwurgg.FilmFromJson;

@Controller
public class MatchController {
	
	
	@GetMapping("/match")
	public String matchPage(@RequestParam(value="name") String monsterName, @RequestParam(value="desc") String monsterDesc, @RequestParam(value="pic") String monsterPic, ModelMap modelMap) {
		modelMap.put("monsterName", monsterName);
		modelMap.put("monsterDesc", monsterDesc);
		modelMap.put("monsterPic", monsterPic);
		modelMap.addAttribute("film", FilmFromJson.getMyFilm());
		
			return "match";
	}
	
}
