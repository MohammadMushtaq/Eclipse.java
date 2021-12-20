package com.xworkz.implimentProgram;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class ClothBrandDAO {
	
	private Collection<String> cloth=new ArrayList<String>();
	
	public boolean save(String item) {
		
		
		return this.cloth.add(item);	
	}
	public boolean contain(String name) {
		if(name!=null) {
			if(this.cloth.contains(name)) {
			return true;
		}else {System.err.println("not found "+name);
		}
		}
		return false;	
	}
	public boolean findCaseSensitive(String name) {
		if(name!=null) {
			Iterator<String> it= cloth.iterator();
			while (it.hasNext()) {
				String string = (String) it.next();
				if(string.equalsIgnoreCase(name)) {
					System.out.println("equal ignore case "+name);
					return true;
				}
			}
		}
		
		return false;	
	}
	public boolean startWith(String name) {
		if(name!=null) {
			Iterator<String> it = cloth.iterator();
			while (it.hasNext()) {
				String string = it.next();
				if(string.startsWith(name)) {
				System.out.println("found that start with "+name);
				return true;
				}
			}
		}else {
			System.err.println("it does not start with ");
		}
		return false;
	} 
	
	public boolean endsWith(String name){
		if(name!=null) {
			Iterator<String> it= cloth.iterator();
			while (it.hasNext()) {
				String string = (String) it.next();
				if(string.endsWith(string)) {
					System.out.println(" found end with ".concat(name));
					return true;
				}
			}
		}
		return false;
		
	}
	

}
