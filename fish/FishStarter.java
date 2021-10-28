package com.xworkz.fish;

public class FishStarter {

	public static void main(String[] args) {

		Fish f1=new SharkFish();
		System.out.println(f1.alive);
		System.out.println(f1.region);
		System.out.println("~~~~~");
		
		SharkFish f2=new GoldFish();
		System.out.println(f2.height);
		System.out.println(f2.weight);
		System.out.println(f2.alive);
		System.out.println(f2.region);
		
		GoldFish gold=new GoldFish();
		System.out.println(gold.alive);
		System.out.println(gold.height);
		System.out.println(gold.size);
	}

}
