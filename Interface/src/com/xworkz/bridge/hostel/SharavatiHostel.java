package com.xworkz.bridge.hostel;

public class SharavatiHostel implements HostelRules, Visiter  {

	
	@Override
	public int inTime() {
		System.out.println("invoke in time method");
		return 0;
	}

	public int outTime() {
		System.out.println("invoke outTime");
		return 9;	
	}

	@Override
	public String vistingDay() {
		System.out.println("invoked visting day");
		return ("sunday");
	}
	
	
}
