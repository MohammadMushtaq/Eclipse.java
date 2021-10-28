package com.xworkz.fish;

public class SharkFish extends Fish{
	public String height="23 feet";
	public String weight="2270kg";
	public SharkFish() {
		
		//this("height", "weight");
		System.out.println("invoked SharkFish no -argu const");
	}
	
	public SharkFish(String height, String weight) {
		
		this.height = height;
		this.weight = weight;
		System.out.println("invoked SharkFish parameter -argu const");
	}
	
	
	
	
}
