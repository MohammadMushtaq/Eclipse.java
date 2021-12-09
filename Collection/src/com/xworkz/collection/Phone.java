package com.xworkz.collection;

import java.util.ArrayList;


import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import com.xworks.merge.AcendingNumber;
import com.xworks.merge.Pnumber;

public class Phone {

	public static void main(String[] args) {
		
		List<Integer> list=new ArrayList<Integer>();
		
		
		list.add(945258565);
		list.add(945258565);
		list.add(245879563);
		list.add(847665888);
		list.add(548523544);
		list.add(454878544);
		list.add(354787545);
		list.add(146536985);
		list.add(645441254);
		list.add(785121235);
		list.add(125232325);
		System.out.println("decending order for list collection");
		
    Comparator<Integer> c = new Pnumber();
     
    Collections.sort(list,c);
    Iterator<Integer> n=list.iterator();
    while(n.hasNext()) {
    	
    int type1 = n.next();
    System.out.println(type1);
    
     
    }	
    System.out.println("=======================");
    System.out.println("ascending order for list collection");
    Comparator<Integer> com = new AcendingNumber();
    
    Collections.sort(list,com);
    Iterator<Integer> n1=list.iterator();
    while(n1.hasNext()) {
    	
    int type12 = n1.next();
    
    System.out.println(type12);
    
     
    }	

    Pnumber pnumber=new Pnumber();
	Set<Integer> set = new TreeSet<Integer>(pnumber);
	set.add(547456644);
	set.add(154546566);
	set.add(487878443);
	set.add(358761632);
	set.add(656859551);
	set.add(215745467);
	set.add(723595968);
	set.add(845453354);
	set.add(941216544);
	set.add(941216544);
	set.add(941216544);
	
	System.out.println("=======================");
	
		System.out.println("decending order for set collection");
	//	Comparator<Integer> comperator = new AcendingNumber();
     
	 //   Collections.sort(comperator);
	    Iterator<Integer> comp=set.iterator();
	    while(comp.hasNext()) {
	    	
	    int ty = comp.next();
	    System.out.println(ty);
	     
	    }
	    
	    System.out.println("Ascending order for set collection");
	    
	   // Comparator<Integer> comperators = new Pnumber();
	    
	    
	     
	  //  Collections.sort(set,comperators);
	    Iterator<Integer> ss=set.iterator();
	    while(ss.hasNext()) {
	    	int types2=ss.next();
	    	System.out.println(types2);
	    	
	    }
	    
	    
	    
		
		}   

}
