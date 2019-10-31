package com.wildcodeschool.TindBwurgg.model;

public class Film {

	private int id;
	private String title;
	private String director;
	private int year;
	private String country;
	private String posterUrl;
	private String createdAt;
	private String updatedAt;

	
	public Film() {
		
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getDirector() {
		return director;
	}


	public void setDirector(String director) {
		this.director = director;
	}


	public int getYear() {
		return year;
	}


	public void setYear(int year) {
		this.year = year;
	}


	public String getCountry() {
		return country;
	}


	public void setCountry(String country) {
		this.country = country;
	}


	public String getPosterUrl() {
		return posterUrl;
	}


	public void setPosterUrl(String posterUrl) {
		this.posterUrl = posterUrl;
	}


	public String getCreatedAt() {
		return createdAt;
	}


	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}


	public String getUpdatedAt() {
		return updatedAt;
	}


	public void setUpdatedAt(String updatedAt) {
		this.updatedAt = updatedAt;
	}

	
}
