package com.xworkz.functional.DAO;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.xworkz.functional.find.Find;

public class TrainNos {
	
	List<String> l= new ArrayList<String>();
	public TrainNos() {
		l.add("216992564");
		l.add("515454845");
		l.add("415454547");
		l.add("315454879");
		l.add("915454454");
		l.add("845454845");
	}
	
	public boolean find(Find enter, String string2) {
		
		Iterator<String> itr = l.iterator();
		while (itr.hasNext()) {
			String string = (String) itr.next();
			if(enter.experssion(string, string2)) {
			return true;
			
		}
	}
		return false;
		
	}
}
