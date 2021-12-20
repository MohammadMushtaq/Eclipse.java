package com.xworkz.functional;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class MallScanner {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		list.add("orianMall");
		list.add("vegacity");
		list.add("Central");
		list.add("kormangla");
		list.add("city");
		list.add("mall8");
		list.add("Mall10");
		
		Iterator<String> itr= list.iterator();
		while (itr.hasNext()) {
			String string = (String) itr.next();
			System.out.println(string);	
		}
		System.out.println("======================");

		for(String element: list ) {
			System.out.println(element);//for loop
		}
		System.out.println("======================");
		list.forEach((e) ->{
			System.out.println(e);//for each method lamda exper;
		});
		System.out.println("======================");
		
		ListIterator<String> l= list.listIterator();
		while (l.hasNext()) {
			String string = (String) l.next();
			System.out.println(string);
		}
		System.out.println("======================");
		ListIterator<String> ls= list.listIterator(list.size());
		while (ls.hasPrevious()) {
			String str = (String) ls.previous();
			System.out.println(str);
		}
		
		
	}

}
