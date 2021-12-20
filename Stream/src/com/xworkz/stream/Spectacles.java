package com.xworkz.stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Spectacles {

	public static void main(String[] args) {
		String brand1="RAYBAN ";
		String brand2="adidas ";
		String brand3="Oakley";
		String brand4="Carrera ";
		String brand5="Farenheit";
		String brand6="Armani Exchange ";
		String brand7="FASTTRACK ";
		String brand8="guztag ";
		String brand9=" IDEE";
		String brand10=" golden";
		String brand11=" avait";
		String brand12=" titan";
		String brand13="cartlon ";
		String brand14="vincent chase ";
		String brand15="barrlkley ";
		String brand16="ray ";
		String brand17="brand";
		String brand18=" vintage";
		String brand19="Apple ";
		String brand20="gucci ";

		Stream<String> brandList=Stream.of(brand1,brand2,brand3,brand4,brand5,brand6,brand7,brand8,
				brand9,brand10,brand11,brand12,brand13,brand14,brand15,brand16,brand17,brand18,brand19,brand20);
		List<String> temp= brandList.sorted((e1,e2) -> e2.compareTo(e1)).collect(Collectors.toList());
		temp.forEach((e) -> System.out.println(e.toLowerCase()));
	}

}
