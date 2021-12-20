package com.xworkz.implimentProgram;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class PlacesDAO {
	
	private Collection<String> places = new ArrayList<String>();
	
	public boolean save(String name) {
		
		return this.places.add(name);
	}
	
	public boolean findMatching(String match) {
		if(match!=null) {
			if(places.contains(match)) {
			System.out.println("place matched");
			return true;
		}
		}
		System.err.println("place not matched");
		return false;		
	}
	
	public boolean findCaseIncensitive(String name){
		if(name!=null) {
			Iterator<String> str = places.iterator();
			while (str.hasNext()) {
				String string = (String) str.next();
				if(string.equalsIgnoreCase(name));
				return true;
			}
		}System.out.println("not matched");
		return false;	
	}
	
	public boolean findStartwith(String str) {
		if(str!=null) {
			Iterator<String> it= places.iterator();
			while (it.hasNext()) {
				String string = (String) it.next();
				if(string.startsWith(str));
				return true;
			}
		}System.err.println("its does n't start with that".concat(str));
		
		return false;
		
	}
	public boolean findEndwith(String str) {
		if(str!=null) {
			Iterator<String> it= places.iterator();
			while (it.hasNext()) {
				String string = (String) it.next();
				if(string.endsWith(str));
				return true;
			}
		}System.err.println("its does n't End with that".concat(str));
		
		return false;
		
	}
	
	

}
