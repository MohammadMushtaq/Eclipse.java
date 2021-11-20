package com.xworkz.bridge.interfac;

public class Indiancitizen implements TrafficRule,MarriageRule,VotingRule{
	
	private String name;
	private Address address;
	
	
	public void displayNameAndAddressDetails(String name,Address address) {
		System.out.println("invoked displayNameAndAddressDetailsmethod");
		this.name=name;
		this.address=address;
	}

	@Override
	public int validAge() {
		System.out.println("invoked valid age method");
		return 25;
	}

	@Override
	public String validId() {
		System.out.println("invoked valid age method");
		return ("54625751654");
	}

	@Override
	public boolean validAge(char gender, int age) {
		System.out.println("invoked valid age method");
		return false;
	}

	@Override
	public boolean validLicence() {
		System.out.println("invoked valid licence method");
		return false;
	}

	@Override
	public String LincenseNo() {
		System.out.println("invoked licence no age method");
		return ("ka2020");
	}

	@Override
	public boolean validInsurence() {
		System.out.println("invoked valid insurance method");
		return false;
	}
		
	}


