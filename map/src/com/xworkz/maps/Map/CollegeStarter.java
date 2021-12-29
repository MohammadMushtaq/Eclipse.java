package com.xworkz.maps.Map;

import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class CollegeStarter {

	public static void main(String[] args) {
		 
		Map<String, Integer> college = new HashMap<String, Integer>();
		college.put("Rymec", 2000);
		college.put("Rv", 5000);
		college.put("dayananda", 4000);
		college.put("BITM", 3000);
		college.put("PDIT", 1000);
		college.put("peset", 7000);
		
		Set<String> set = college.keySet();
		set.stream().sorted(Comparator.reverseOrder()).forEach((e) ->System.out.print(e+" "));
		
		System.out.println(System.lineSeparator());
		
		Collection<Integer> set1 = college.values();
		set1.stream().sorted(Comparator.reverseOrder()).forEach((e) ->System.out.print(e+" "));
		
		System.out.println(System.lineSeparator());
		
		Collection<Entry<String, Integer>> coll= college.entrySet();
		coll.stream().forEach((e) ->System.out.println(e+" "));
		
		System.out.println(System.lineSeparator());
		
		Set<Entry<String, Integer>> entryset1=college.entrySet();
		
		entryset1.forEach((e) ->System.out.println(e));

		Iterator<Entry<String, Integer>> itr= entryset1.iterator();
		System.out.println(System.lineSeparator());
		while (itr.hasNext()) {
			Map.Entry<String, Integer> entry = itr.next();
			System.out.println(entry.getKey() . concat( ":")+(entry.getValue()));
		}
		
	}

}
