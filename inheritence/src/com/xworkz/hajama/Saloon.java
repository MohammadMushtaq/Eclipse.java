package com.xworkz.hajama;

public class Saloon {
	public String name="noNA";
	public int noOFHajama=6;
	
	public Saloon()
	{
		System.out.println("invoke saloon no- arg constructor");
	}
	public Saloon(String name)
	{
		
		this.name=name;
		System.out.println("invoke saloon parameter const");
	}

	
}
