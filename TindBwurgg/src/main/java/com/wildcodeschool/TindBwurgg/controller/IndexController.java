package com.wildcodeschool.TindBwurgg.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.wildcodeschool.TindBwurgg.FilmFromJson;
import com.wildcodeschool.TindBwurgg.MonsterFromJson;
import com.wildcodeschool.TindBwurgg.model.Film;
import com.wildcodeschool.TindBwurgg.model.Monster;

@Controller
public class IndexController {
	
	
	@GetMapping("/")
	public String start() {
		

		Film[] filmList = FilmFromJson.createFilms();
		Monster[] monsterList = MonsterFromJson.createMonster();
		System.out.println(filmList[3].getDirector());
		System.out.println(monsterList[2].getName());
    	return "Index";
	}
}
