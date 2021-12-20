package com.xworkz.functional.DTO;

import java.io.Serializable;

public class AmesmentParkDTO implements Serializable {
	
	private String name;
	private String ticketPrice;
	private boolean games;
	private boolean resturant;
	
	public AmesmentParkDTO() {
		
	}
	public AmesmentParkDTO(String name, String ticketPrice, boolean games, boolean resturant) {
		super();
		this.name = name;
		this.ticketPrice = ticketPrice;
		this.games = games;
		this.resturant = resturant;
	}
	@Override
	public String toString() {
		return "AmesmentParkDTO [name=" + name + ", ticketPrice=" + ticketPrice + ", games=" + games + ", resturant="
				+ resturant + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTicketPrice() {
		return ticketPrice;
	}

	public void setTicketPrice(String ticketPrice) {
		this.ticketPrice = ticketPrice;
	}

	public boolean isGames() {
		return games;
	}

	public void setGames(boolean games) {
		this.games = games;
	}

	public boolean isResturant() {
		return resturant;
	}

	public void setResturant(boolean resturant) {
		this.resturant = resturant;
	}

	
	
	
}
