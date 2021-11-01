package com.xworkz.factory.yes;

public class Factory {

	private String factoryName;
	private int noOFEmployees;
	private float revenue;
	private String owner;

	public Factory() {
		super();
		System.out.println("invoked no-argument const");
	}

	public Factory(String factoryName) {

		this.factoryName = factoryName;
		System.out.println("factory name :-".concat(factoryName));
	}

	public Factory(int noOFEmployees) {

		this.noOFEmployees = noOFEmployees;
		System.out.println("no of empolyees".concat(String.valueOf(noOFEmployees)));
	}

}
