package com.xworkz.pattern;

public class DecreaseStar {

	void DecreaseTriangleMatrix() {

		for (int row = 1; row <= 5; row++) {
			for (int col =row; col <= 4; col++) {

				System.out.print("*");

			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
	
		
		DecreaseStar matrix=new DecreaseStar();
		matrix.DecreaseTriangleMatrix();
	}

}
