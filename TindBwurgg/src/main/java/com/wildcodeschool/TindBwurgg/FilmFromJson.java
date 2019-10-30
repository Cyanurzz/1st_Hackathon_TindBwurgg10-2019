package com.wildcodeschool.TindBwurgg;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import org.springframework.web.reactive.function.client.WebClient;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.io.JsonEOFException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.wildcodeschool.TindBwurgg.model.Film;
import reactor.core.publisher.Mono;
	
public class FilmFromJson {
		
	static String url = "https://hackathon-wild-hackoween.herokuapp.com/movies";
	private static Film[] myFilm;
		
	public static Film[] createFilms() {
		WebClient webClient = WebClient.create(url);
		Mono<String> call = webClient.get()

			      .retrieve()
		      .bodyToMono(String.class);

		String response = call.block();
		ObjectMapper objectMapper = new ObjectMapper();
		
		try {

			JsonNode root = objectMapper.readTree(response);
			} catch (JsonProcessingException e) {
			   e.printStackTrace();
			}

	

		try {
			JsonNode movie = objectMapper.readTree(response).get("movies");
		   myFilm = objectMapper.convertValue(movie, Film[].class);
		} catch (JsonProcessingException e) {
		   e.printStackTrace();
		}
		
		return myFilm;
		
	}
	

	public static Film[] getMyFilm() {
		return myFilm;
	}

	public void setMyFilm(Film[] myFilm) {
		this.myFilm = myFilm;
	}
}
		
