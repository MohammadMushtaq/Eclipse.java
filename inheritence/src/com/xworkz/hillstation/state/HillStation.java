package com.xworkz.hillstation.state;

public class HillStation {

	public String name;
	public int elivation;
	
	public HillStation() {
		System.out.println("invoked hill station no arg const");
	}

	public HillStation(String name, int elivation) {
		super();
		this.name = name;
		this.elivation = elivation;
	}
	public void displaydetails() {
		System.out.println("invoked displaydetail");
		System.out.println(this.elivation);
		System.out.println(this.name);
	}
	
	
}
