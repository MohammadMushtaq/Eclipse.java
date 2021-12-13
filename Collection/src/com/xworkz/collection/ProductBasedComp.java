package com.xworkz.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import com.xworks.merge.ProductBasedCompAcending;
import com.xworks.merge.ProductBasedCompDesending;

public class ProductBasedComp {

	public static void main(String[] args) {
		List<String> li = new ArrayList<String>();
		li.add("Microsoft");
		li.add("Microsoft");
		li.add("Adobe");
		li.add("Salesforce");
		li.add("VMware");
		li.add("Amazone");
		li.add("Amdocs");
		li.add("Cisco");
		li.add("Google");
		li.add("Ibm");
		li.add("Intel");
		li.add("Mcafee");

		Comparator<String> c = new ProductBasedCompAcending();
		Collections.sort(li, c);

		Iterator<String> iterator = li.iterator();

		while (iterator.hasNext()) {
			System.out.println("Ascending of list " + iterator.next());
		}
		System.out.println("`````````````````");

		Comparator<String> com = new ProductBasedCompDesending();
		Collections.sort(li, com);
		Iterator<String> iterator2 = li.iterator();
		while (iterator2.hasNext()) {
			System.out.println("desending of list " + iterator2.next());
		}
		System.out.println("~~~~~~~~~~~~~~~~~~~~");
		
		Comparator<String> comparator=new ProductBasedCompAcending();
		
		Set<String> set = new TreeSet<String>(comparator);
		set.add("Paypal");
		set.add("Sap");
		set.add("Vmare");
		set.add("TejasNetwork");
		set.add("Rockstar games");
		set.add("Oracle");
		set.add("Tally");
		set.add("Semines");
		set.add("Flipkart");
		set.add("Flipkart");
		set.add("Amazone");
		
		Iterator<String> iterator3 = set.iterator();
		while (iterator3.hasNext()) {
			System.out.println("Asending of Set " + iterator3.next());
		}
		System.out.println("~~~~~~~~~~~~~~~~~~~~");
		
		Comparator<String> comparator1=new ProductBasedCompDesending();
		Set<String> set1=new TreeSet<String>(comparator1);
		set1.add("Paypal");
		set1.add("Sap");
		set1.add("Vmare");
		set1.add("TejasNetwork");
		set1.add("Rockstar games");
		set1.add("Oracle");
		set1.add("Tally");
		set1.add("Semines");
		set1.add("Flipkart");
		set1.add("Flipkart");
		set1.add("Amazone");
		
		Iterator<String> iterator4 = set1.iterator();
		while (iterator4.hasNext()) {
			System.out.println("desending of Set " + iterator4.next());
		}
	

	}

}
