package com.xworkz.accessing.enter;

public class Allowing {
String name;
int branch;
int atmNum;

	public Allowing(int atmNum) {
		this.atmNum=atmNum;
		System.out.println(this.atmNum);
	}


	public void bank(String name,int branch) {
		this.name=name;
		this.branch=branch;
		System.out.println(this.name);
		System.out.println(this.branch);
		System.out.println(this.atmNum);
	}
	
}
