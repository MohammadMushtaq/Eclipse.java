package com.xworkz.factory.yes;

public class SugarFactory extends Factory{
	
	public SugarFactory()
	{
		super("Sugar Industry");
		System.out.println("invoked no argument");
	}
	
	public SugarFactory(String factoryName)
	{	
		super(factoryName);
		System.out.println("invokes para2");
	}
	public SugarFactory(int noOFEmployees)
	{	
		super(noOFEmployees);
		System.out.println("invokes para3");
	}
	
}