package com.xworkz.implimentProgram.Scanner;

import com.xworkz.implimentProgram.PlacesDAO;

public class PlacesScanner {

	public static void main(String[] args) {
		
		PlacesDAO place = new PlacesDAO();
		place.save("bellary");
		place.save("bangalore");
		place.save("hospet");
		place.save("raichur");
		place.save("shivmogga");
		place.save("bijapur");
		place.save("hydrabad");
		
		boolean cases=place.findCaseIncensitive("bangare");
		System.out.println(cases);		
		
		boolean contain= place.findEndwith("apur");
		System.out.println(contain);
		
		boolean cont= place.findStartwith("bell");
		System.out.println(cont);
		
		boolean match=place.findMatching("hydrabad");
		System.out.println(match);
	}
	


}
