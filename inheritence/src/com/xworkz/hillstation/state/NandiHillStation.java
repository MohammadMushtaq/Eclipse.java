package com.xworkz.hillstation.state;

public class NandiHillStation extends HillStation{

	public NandiHillStation() {
		super("nandi",1200);
		System.out.println("invoked nandi no arg const");
	}
	
	public void updateElivation(int elivat)
	{
		super.elivation=elivat;
		super.displaydetails();
		System.out.println("invoke update method");	
	}
	
	
}
