package com.xworkz.functional;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class MlaSetScanner {

	public static void main(String[] args) {
		Set<String> set= new TreeSet<String>();
		
		set.add("somlingappa");
		set.add("shree ramulu");
		set.add("janaardhan reddy");
		set.add("somshekar reddy");
		set.add("bm nagraj");
		set.add("prasad abbayya");
		set.add("prasad abbayya");
		
		
		
		
		
		for (String content :set) {
			System.out.println(content);
		}
		System.out.println("==========================");
		set.forEach((e) ->{
			System.out.println(e);
		});
		System.out.println("==========================");
		
		
	}

}
