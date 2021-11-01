package com.xworkz.fish;

public class GoldFish extends SharkFish{
	public String color="Gold";
	public String  size="5.1cm";
	
	public GoldFish() {
		
	   //this("name", "size");
	   
		System.out.println("invoked GoldFish no -argu const");
	}

	public GoldFish(String color, String size) {
		
		this.color = color;
		this.size = size;
		System.out.println("invoked parameter Goldfish const");
	}
	
	
	

}
