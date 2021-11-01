package com.xworkz.fish;

public class Fish {

	public String region="water";
	public boolean alive;
	
	
	public Fish() {
		//this("region");
		System.out.println("invoked Fish no-argument const");
	}


	public Fish(String region) {
		this.region = region;
		System.out.println("invoed parameter region constructor");
	}
	
	

	
}
