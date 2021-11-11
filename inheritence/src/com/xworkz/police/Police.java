package com.xworkz.police;

import com.xworkz.police.constants.PoliceDept;

public class Police {
	
	public String name;
	protected String designation;
	protected int exp;
	PoliceDept dept;
	public int noOfStar;
	
	public Police() {
		System.out.println("invoke police no argu const");
	}

	protected void displayDetail() {
		System.out.println("invoke  police diaplaymethod ");
	}
}
