package com.wildcodeschool.TindBwurgg;

import java.util.ArrayList;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.wildcodeschool.TindBwurgg.model.Film;

@SpringBootApplication
public class TindBwurggApplication {

	
	public static void main(String[] args) {
		SpringApplication.run(TindBwurggApplication.class, args);

		Film[] filmList = FilmFromJson.createFilms();
		
		System.out.print(filmList[3].getDirector());

	}

}
