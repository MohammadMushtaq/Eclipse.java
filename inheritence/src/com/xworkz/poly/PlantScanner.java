package com.xworkz.poly;

import com.xworkz.poly.runtime.Plant;
import com.xworkz.poly.runtime.PlantType;

public class PlantScanner {

	public static void main(String[] args) {
		Plant plant1 = new Plant("Coconut", true, 80F, PlantType.HERBS);
		Plant plant2 = new Plant("Tamarind", true, 200F, PlantType.SHURBS);
		Plant plant3 = new Plant("Coconut", false, 80F, PlantType.HERBS);

		System.out.println(plant1.toString());
		System.out.println(plant1.hashCode() + "\n");

		System.out.println(plant2.toString());
		System.out.println(plant2.hashCode() + "\n");

		System.out.println(plant3.toString());
		System.out.println(plant3.hashCode() + "\n");

		System.out.println(plant1.equals(plant3) + "\n");
		System.out.println(plant1.equals(plant2) + "\n");
		System.out.println(plant1.equals(null) + "\n");
		System.out.println(plant1.equals(26.7) + "\n");

	}


	}
