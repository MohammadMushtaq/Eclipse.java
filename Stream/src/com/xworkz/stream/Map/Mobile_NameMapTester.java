package com.xworkz.stream.Map;

import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Mobile_NameMapTester {

	public static void main(String[] args) {
		
		
		Map<Long, String> mobile= new HashMap<Long, String>();
		
		mobile.put(948676866l, "mushtaq");
		mobile.put(889224520l, "asif");
		mobile.put(944855555l, "irfan");
		mobile.put(154454545l, "mutahir");
		mobile.put(948454512l, "fuz");
		mobile.put(824754665l, "ravi");
		mobile.put(287874546l, "sam");
		
		Set<Entry<Long, String>> set = mobile.entrySet();
		set.stream().forEach((e) -> System.out.println(e.getKey()+" "+e.getValue()));
		
		System.out.println(System.lineSeparator());
		
		Set<Long> set1=mobile.keySet();
		set1.stream().sorted().forEach((e) -> System.out.println(e));
		
		System.out.println(System.lineSeparator());

		
		Collection<String> set2=mobile.values();
		set2.stream().sorted(Comparator.reverseOrder()).forEach((e) -> System.out.println(e));
		
		System.out.println(System.lineSeparator());

		Set<Map.Entry<Long, String>> entryset1=mobile.entrySet();
		Iterator<Map.Entry<Long, String>> entry=entryset1.iterator();
		
		while(entry.hasNext())
		{
			Map.Entry<Long, String> element=entry.next();
			System.out.println(element.getKey()+( ":").concat(element.getValue()));
		}
		
		System.out.println(System.lineSeparator());
		
		entryset1.forEach((e) -> System.out.println(e.getKey()+(":").concat(e.getValue())));

	}
		
}
