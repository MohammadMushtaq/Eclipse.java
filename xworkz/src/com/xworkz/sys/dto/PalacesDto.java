package com.xworkz.sys.dto;

public class PalacesDto {
	
	private String name;
	private String location;
	private Float rating;
	private Boolean isActive;
	private Integer Timing;
	
	public PalacesDto() {
		// TODO Auto-generated constructor stub
	}

	public PalacesDto(String name, String location, Float rating, Boolean isActive, Integer timing) {
		super();
		this.name = name;
		this.location = location;
		this.rating = rating;
		this.isActive = isActive;
		Timing = timing;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Float getRating() {
		return rating;
	}

	public void setRating(Float rating) {
		this.rating = rating;
	}

	public Boolean getIsActive() {
		return isActive;
	}

	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

	public Integer getTiming() {
		return Timing;
	}

	public void setTiming(Integer timing) {
		Timing = timing;
	}

	@Override
	public String toString() {
		return "PalacesDto [name=" + name + ", location=" + location + ", rating=" + rating + ", isActive=" + isActive
				+ ", Timing=" + Timing + "]";
	}

	

}
