package com.wildcodeschool.TindBwurgg.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.wildcodeschool.TindBwurgg.MonsterFromJson;

@Controller
public class ProfilController {
	
	
	@GetMapping("/profil")
	public String profilPage(@RequestParam(value="name") String name, ModelMap modelMap) {
		modelMap.put("nameConnect", name);
		modelMap.addAttribute("monster", MonsterFromJson.getMyMonster());
		String sylvain ="sylvain";
		if(name.equals(sylvain)) {
			return "404";
		}
    	return "profil";
	}
}
