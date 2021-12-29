package com.xworkz.crud;

public class Island {

	private String name = "carebean";
	private int[] noOfCoconutTrees = new int[10];
	private int count = 0;

	public String getName() {
		return this.name;
	}

	public void addtrees(int trees) {

		if (count < 10) {
			noOfCoconutTrees[count] = trees;
			count++;
		} else {
			System.out.println("array is full");
		}
	}

	public void getDetails() {
		System.out.println(name);
		for (int i = 0; i < noOfCoconutTrees.length; i++) {
			System.out.println("number Of Coconut Trees :" + noOfCoconutTrees[i]);
		}

	}
}
