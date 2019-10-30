package com.wildcodeschool.TindBwurgg.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.wildcodeschool.TindBwurgg.MonsterFromJson;

@Controller
public class ProfilController {
	
	
	@GetMapping("/profil")
	public String profilPage(Model model) {
		
		model.addAttribute("monster", MonsterFromJson.getMyMonster());
    	return "profil";
	}
}
