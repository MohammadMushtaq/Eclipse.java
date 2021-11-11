package com.xworkz.police;

public class TrafficPolice extends Police{

	public TrafficPolice() {
		System.out.println("invoked traffic no arg const");
		System.out.println(super.designation);
		System.out.println(super.name);
		
	
	} 
	public void test() {
		
		System.out.println("invoked test method");
		super.displayDetail();
	}
}
