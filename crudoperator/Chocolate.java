package com.xworkz.crud.crudoperator;

public class Chocolate {

	private String name = new String();
	private String[] flovor = new String[3];
	private int count = 0;

	public Chocolate() {

		this("cadberry");
		System.out.println("invoked no argument Constructor");

	}

	public Chocolate(String name) {
		this.name = name;
		System.out.println("invoked parameterized constructor");

	}

	public String getChocolate() {

		return this.name;

	}

	public void addflovor(String name) {

		
		if (count < 3) {
			flovor[count] = name;
			count++;
		} else {
			System.out.println("mugeeth kathe");
		}
	}

	public void displayFlovors() {

		for (int i = 0; i < flovor.length; i++) {
			System.out.println(flovor[i]);
		}
	}
}
