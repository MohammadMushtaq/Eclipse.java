package com.xworkz.maps.Map;

import java.util.Collection;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class CountryMapTester {

	public static void main(String[] args) {
		
		Map<String, String> coll= new HashMap<String, String>();
				
		coll.put("india", "bangalore");
		coll.put("pakistan", "lahore");
		coll.put("u.s.a", "texas");
		coll.put("china","benjin" );
		coll.put("soudiArabia", "dubai");
		
		Set<String> set=coll.keySet();
		set.stream().sorted().forEach((e) -> System.out.println(e));
		
		System.out.println(System.lineSeparator());

		Collection<String> set1=coll.values();
		set1.stream().sorted(Comparator.reverseOrder()).forEach((e) -> System.out.println(e));
		
		System.out.println(System.lineSeparator());
		
		Collection<Entry<String, String>> set2=coll.entrySet();
		set2.forEach((e) -> System.out.println(e));
		
		System.out.println(System.lineSeparator());
		
		Set<Map.Entry<String,String>> entryset1=coll.entrySet();
		Iterator<Map.Entry<String,String>> entry=entryset1.iterator();
		
		while(entry.hasNext())
		{
			Map.Entry<String,String> element=entry.next();
			System.out.println(element.getKey() . concat( ":").concat(element.getValue()));
		}
		
		entryset1.forEach((e) -> System.out.println(e.getKey().concat(":").concat(e.getValue())));

	}
}
