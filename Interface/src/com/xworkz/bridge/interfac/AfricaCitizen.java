package com.xworkz.bridge.interfac;

public class AfricaCitizen implements VotingRule,MarriageRule,TrafficRule{

	private String name;
	private String stateName;
	
	public void displayDetails() {
		System.out.println("invoked displaydetails");
		this.name="manju";
		this.stateName="Karnatak";
	}
	
	@Override
	public boolean validLicence() {
		System.out.println("invoked valid lincence method");
		return false;
	}

	@Override
	public String LincenseNo() {
		System.out.println("invoked valid lincence no method");
		return ("ka202021");
	}

	@Override
	public boolean validInsurence() {
		System.out.println("invoked valid insurance");
		return false;
	}

	@Override
	public boolean validAge(char gender, int age) {
		System.out.println("invoked valid age method");
		return false;
	}

	@Override
	public int validAge() {
		System.out.println("invoked valid age method");
		return 25;
	}

	@Override
	public String validId() {
		System.out.println("invoked valid age method");
		return ("123553659");
	}

}
