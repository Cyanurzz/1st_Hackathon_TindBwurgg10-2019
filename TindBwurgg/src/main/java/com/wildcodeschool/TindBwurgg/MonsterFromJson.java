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
import com.wildcodeschool.TindBwurgg.model.Monster;

import reactor.core.publisher.Mono;
	
public class MonsterFromJson {
		
	static String url = "https://hackathon-wild-hackoween.herokuapp.com/monsters";
	private static Monster[] myMonster;
		
	public static Monster[] createMonster() {
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
			JsonNode monster = objectMapper.readTree(response).get("monsters");
		   myMonster = objectMapper.convertValue(monster, Monster[].class);
		} catch (JsonProcessingException e) {
		   e.printStackTrace();
		}
		
		return myMonster;
		
	}
	

	public static Monster[] getMyMonster() {
		return myMonster;
	}

	public void setMyMonster(Monster[] myMonster) {
		this.myMonster = myMonster;
	}
}
		
