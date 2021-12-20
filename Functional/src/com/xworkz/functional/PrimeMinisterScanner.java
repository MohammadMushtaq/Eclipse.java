package com.xworkz.functional;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class PrimeMinisterScanner {

	public static void main(String[] args) {
		List<String> primeList= new ArrayList<String>();
		primeList.add("jawar lal nehru");
		primeList.add("indra gandi");
		primeList.add("rajeev gandi");
		primeList.add("Lal Bahadur Shastri");
		primeList.add("atalbihari vajpayee");
		primeList.add("manmohan singh");
		primeList.add("Narendra Modi");
		
		System.out.println("==========================");
		for(String element :primeList) {
			System.out.println(element);
		}
		primeList.forEach((e) ->{
			System.out.println(e);
		});
		System.out.println("==========================");
		
		ListIterator<String> li= primeList.listIterator();
		while (li.hasNext()) {
			String string = (String) li.next();
			System.out.println(string);
		}
		System.out.println("==========================");

		ListIterator<String> lo =primeList.listIterator(primeList.size());
		while (lo.hasPrevious()) {
			String string = (String) lo.previous();
			System.out.println(string);
			
		}
	}

}
