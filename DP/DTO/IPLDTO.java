package com.xworkz.DP.DTO;


public class IPLDTO {

	private String name;
	private Integer NoOfPlayer;
	private Integer teamSize;
	private String ownerName;
	private String sponsership;

	public IplDTO() {
		System.out.println("invoked no argument constructor");
	}

	public IplDTO(String name, Integer noOfPlayer, Integer teamSize, String ownerName, String sponsership) {
		super();
		this.name = name;
		NoOfPlayer = noOfPlayer;
		this.teamSize = teamSize;
		this.ownerName = ownerName;
		this.sponsership = sponsership;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getNoOfPlayer() {
		return NoOfPlayer;
	}

	public void setNoOfPlayer(Integer noOfPlayer) {
		NoOfPlayer = noOfPlayer;
	}

	public Integer getTeamSize() {
		return teamSize;
	}

	public void setTeamSize(Integer teamSize) {
		this.teamSize = teamSize;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerSize) {
		this.ownerName = ownerName;
	}

	public String getSponsership() {
		return sponsership;
	}

	public void setSponsership(String sponsership) {
		this.sponsership = sponsership;
	}
}
