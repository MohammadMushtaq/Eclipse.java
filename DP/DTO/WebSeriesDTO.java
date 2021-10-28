package com.xworkz.DP.DTO;

import com.xworkz.DP.Genre;

public class WebSeriesDTO {
	
	private String name;
	private Genre genre;
	private String cast;
	private int noOfCharcacters;
	private float rating;
	private int currentSesions;
	private int toalSesions;
	
	
	
	public WebSeriesDTO() {
	System.out.println("invoked no argu cons");
}

	public WebSeriesDTO(String name, Genre genre, String cast, int noOfCharcacters, float rating, int currentSesions,
			int toalSesions) {
		super();
		this.name = name;
		this.genre = genre;
		this.cast = cast;
		this.noOfCharcacters = noOfCharcacters;
		this.rating = rating;
		this.currentSesions = currentSesions;
		this.toalSesions = toalSesions;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Genre getGenre() {
		return genre;
	}

	public void setGenre(Genre genre) {
		this.genre = genre;
	}

	public String getCast() {
		return cast;
	}

	public void setCast(String cast) {
		this.cast = cast;
	}

	public int getNoOfCharcacters() {
		return noOfCharcacters;
	}

	public void setNoOfCharcacters(int noOfCharcacters) {
		this.noOfCharcacters = noOfCharcacters;
	}

	public float getRating() {
		return rating;
	}

	public void setRating(float rating) {
		this.rating = rating;
	}

	public int getCurrentSesions() {
		return currentSesions;
	}

	public void setCurrentSesions(int currentSesions) {
		this.currentSesions = currentSesions;
	}

	public int getToalSesions() {
		return toalSesions;
	}

	public void setToalSesions(int toalSesions) {
		this.toalSesions = toalSesions;
	
	}
	
	
	}
	
	