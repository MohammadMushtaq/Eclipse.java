package com.xworkz.functional.DAO;

import java.util.ArrayList;



import java.util.Collection;

import java.util.Iterator;

import com.xworkz.functional.find.Find;

public class BeerDao {
	
	Collection<String> beer = new ArrayList();
	
	public BeerDao() {
		beer.add("KingFisher");
		beer.add("Beera");
		beer.add("Odka");
		beer.add("Juice");
		beer.add("Burg");
		beer.add("Coak");
		beer.add("tiger");
		beer.add("beer6");
		beer.add("beer7");
	}
	
	public boolean find(Find enter, String value) {
		Iterator<String> it = beer.iterator();
		while (it.hasNext()) {
			String string = it.next();
			if(enter.experssion(string, value)){
			return true;
		}
		}
		return false;
		
		
	}
	
}
