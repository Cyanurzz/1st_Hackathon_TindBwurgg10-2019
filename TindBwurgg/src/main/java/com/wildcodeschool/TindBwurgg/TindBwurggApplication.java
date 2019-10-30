package com.wildcodeschool.TindBwurgg;

import java.util.ArrayList;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.wildcodeschool.TindBwurgg.controller.MonsterFromJson;
import com.wildcodeschool.TindBwurgg.model.Film;
import com.wildcodeschool.TindBwurgg.model.Monster;

@SpringBootApplication
public class TindBwurggApplication {

	
	public static void main(String[] args) {
		SpringApplication.run(TindBwurggApplication.class, args);

		Film[] filmList = FilmFromJson.createFilms();
		Monster[] monsterList = MonsterFromJson.createMonster();
		System.out.println(filmList[3].getDirector());
		System.out.println(monsterList[2].getName());

	}

}
