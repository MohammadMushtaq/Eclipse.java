package com.xworkz.season.device;

import com.xworkz.season.company.Kalla;

public class MobileKalla extends Kalla{

	public String nativePlace;
	
	public MobileKalla() {
		System.out.println("invoked mobile kalla");
	}
	public MobileKalla(String name, String area, float exp, int age, int noOfCases,String nativePlace) 
	{
	super(name,area,exp,age, noOfCases);
	this.nativePlace=nativePlace;
	System.out.println("invoke name,area,exp,age, noOfCases nativeplace");
	}
	
	
	@Override
	public String item() {
		System.out.println("Invoked item from Mobile Kalla class");
		return "Mobile";
	}
	@Override
	public void display() {
		super.display();
		System.out.println("theif native place"+this.nativePlace);
		
	}
	
	
	
	
}
