package com.xworkz.crud.crudoperator;

import java.util.Iterator;

public class BeachOperator {

	private String country = new String();
	private int counter = 0;

	private String[] beachname = new String[5];

	public BeachOperator() {
		this("India");
		System.out.println("invoked Beachope no arugument const");
	}

	public BeachOperator(String country) {
		this.country = country;
		System.out.println("invoked Beachoper string constructor");
	}

	public String getCountry() {
		return country;
	}

	public void beachName(String name) {
		System.out.println("invoked BeachName");
		System.out.println("name :".concat(name));

		if (this.counter < 5) {
			this.beachname[this.counter] = name;
			this.counter++;
		} else {
			System.out.println("erray is full");
		}
	}

	public void displayBeachNames() {
		System.out.println("display beachname");
		for (int i = 0; i < beachname.length; i++) {
			String name = this.beachname[i];
			System.out.println(name);
		}
	}

}
