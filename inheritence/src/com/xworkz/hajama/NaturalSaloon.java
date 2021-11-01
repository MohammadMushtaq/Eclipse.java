package com.xworkz.hajama;

public class NaturalSaloon extends Saloon{
	public String name="NA";
	public int noOFHajama=4;
	

	public NaturalSaloon()
	{
		//super();
		this("name");
		System.out.println("invoked Naturalsaloon no- arg const");
	}

	public NaturalSaloon(String name)
	{
		//this.name=name;
		System.out.println("invoke NaturalSaloon parameter const");
	}
	
}
