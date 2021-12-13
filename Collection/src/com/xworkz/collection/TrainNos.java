package com.xworkz.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import com.xworks.merge.TrainAscending;
import com.xworks.merge.TrainDesending;

public class TrainNos {
	
	public static void main(String[] args) {
		
		List<Integer> ll= new ArrayList<Integer>();
		ll.add(216565656);
		ll.add(454656566);
		ll.add(412345744);
		ll.add(784499689);
		ll.add(845466566);
		ll.add(568865656);
		ll.add(365653365);	//array list is contain duplicate but contain ascending by sorting
		ll.add(249561466);
		ll.add(984546653);
		ll.add(984546653);
			
		Comparator<Integer> com= new TrainAscending();
		Collections.sort(ll,com);
		Iterator<Integer> s= ll.iterator();
		while(s.hasNext()) {
			int content =s.next();
			System.out.println("Ascending :"+content);
		}
		System.err.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		
		Comparator<Integer> comparator= new TrainDesending();
		Collections.sort(ll,comparator);
		Iterator<Integer> p= ll.iterator();
		while(p.hasNext()) {
			int content =p.next();
			System.out.println("desending :"+content);
		}
		
		Comparator<Integer> co=new TrainAscending();
		Set<Integer> set= new TreeSet<Integer>(co);
		
		set.add(784565495);
		set.add(474544466);
		set.add(896656566);
		set.add(546565643);
		set.add(689321213);
		set.add(121366465);
		set.add(944654646);
		set.add(346464946);
		set.add(214644566);
		System.err.println("~~~~~~~~~~~~~~~~~~~~~~~~");
		Iterator<Integer> i=set.iterator();
		while(i.hasNext()) {
			System.out.println("Ascending of set "+i.next());
		}
		System.err.println("~~~~~~~~~~~~~~~~~~~~~~~~");
		Comparator<Integer> co1=new TrainDesending();
		Set<Integer> set1=new TreeSet<Integer>(co1);
		set1.add(784565495);
		set1.add(474544466);
		set1.add(896656566);
		set1.add(546565643);
		set1.add(689321213);
		set1.add(121366465);
		set1.add(944654646);
		set1.add(346464946);
		set1.add(214644566);
		Iterator<Integer> k=set1.iterator();
		while(k.hasNext()) {
			System.out.println("Desending of set "+k.next());
		}
		
	}

}
