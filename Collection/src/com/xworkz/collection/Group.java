package com.xworkz.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Group {
	public static void main(String[] args) {
		
		String actor1="salman";
		String actor2="sharuk";
		String actor3="amitab bachan";
		String actor4="ajay";
		String actor5="puneet";
		String actor6="akshay";
		String actor7="katrina";
		
		Collection<String> collect = new ArrayList<String>();
		collect.add(actor1);
		collect.add(actor2);
		collect.add(actor3);
		collect.add(actor4);
		collect.add(actor5);
		collect.add(actor6);
		collect.add(actor7);
	
		collect.remove(actor4);
		System.out.println(collect);
		
		
		Iterator<String> exists=collect.iterator();
	/*	System.out.println(exists.hasNext());
		System.out.println(exists.next());
		System.out.println(exists.hasNext());
		System.out.println(exists.next());
		System.out.println(exists.hasNext());
		System.out.println(exists.next());*/
		
		
		
		
		while( exists.hasNext()) {
		System.out.println(exists.next());
		}
		boolean see=collect.contains("salman");
		System.out.println(see);
		
		System.out.println(collect.isEmpty());
		
		
		
		Collection<Integer> c= new ArrayList<Integer>();
		c.add(452);
		c.add(45454);
		Iterator<Integer> s= c.iterator();
		
		System.out.println("checking contain "+c.contains(452));
		System.out.println(c);
		c.clear();
		System.out.println(c);
		
		
	//	System.out.println(s.next());
		
	
		
		boolean check=c.isEmpty();
		
		System.out.println("checking is empty "+check);
		
		
		
		
		
		
		
	//	c.remove(452);
		
	}

}
