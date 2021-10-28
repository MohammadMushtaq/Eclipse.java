package com.xworkz.DP.DTO;

public class ArmyDTO {

	private String country;
	private int noOfSoldiers;
	private int noOfTanker;
	private String generalName;
	private int noOfAirCraft;
	private int noOfSubmarine;

	public ArmyDTO() {
		System.out.println("no argument constructor");
	}

	public ArmyDTO(String country, int noOfSoldiers, int noOfTanker, String generalName, int noOfAirCraft,
			int noOfSubmarine) {
		super();
		this.country = country;
		this.noOfSoldiers = noOfSoldiers;
		this.noOfTanker = noOfTanker;
		this.generalName = generalName;
		this.noOfAirCraft = noOfAirCraft;
		this.noOfSubmarine = noOfSubmarine;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public int getNoOfSoldiers() {
		return noOfSoldiers;
	}

	public void setNoOfSoldiers(int noOfSoldiers) {
		this.noOfSoldiers = noOfSoldiers;
	}

	public int getNoOfTanker() {
		return noOfTanker;
	}

	public void setNoOfTanker(int noOfTanker) {
		this.noOfTanker = noOfTanker;
	}

	public String getGeneralName() {
		return generalName;
	}

	public void setGeneralName(String generalName) {
		this.generalName = generalName;
	}

	public int getNoOfAirCraft() {
		return noOfAirCraft;
	}

	public void setNoOfAirCraft(int noOfAirCraft) {
		this.noOfAirCraft = noOfAirCraft;
	}

	public int getNoOfSubmarine() {
		return noOfSubmarine;
	}

	public void setNoOfSubmarine(int noOfSubmarine) {
		this.noOfSubmarine = noOfSubmarine;
	}

}
