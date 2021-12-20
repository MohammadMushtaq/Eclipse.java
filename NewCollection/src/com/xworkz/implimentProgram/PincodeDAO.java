package com.xworkz.implimentProgram;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class PincodeDAO {

	private Collection<Integer> pin = new HashSet<Integer>();
	
	public boolean save(int num) {
		return this.pin.add(num);
		
	}
	
	public boolean contain(int find) {
		if(find!=0) {
			Iterator<Integer> itr= pin.iterator();
			while (itr.hasNext()) {
				Integer integer = (Integer) itr.next();
				if(integer==find) {
					return true;
				}
			}
		}
		return false;	
	}
	public boolean startwith(int num) {
		String convert=Integer.toString(num);
		if(num!=0) {
			Iterator<Integer> it = pin.iterator();
			while (it.hasNext()) {
				Integer integer = (Integer) it.next();
				String s= Integer.toString(integer);
				if(s.startsWith(convert)) {
					System.out.println("its matched");
					return true;
				}
			}System.err.println("not matched");
		}
		
		return false;
		
	}
	public boolean endWith(int num)
	{
		String convert = pin.toString();
		if(num!=0) {
			Iterator<Integer> itr = pin.iterator();
			while (itr.hasNext()) {
				Integer integer = (Integer) itr.next();
				String s=integer.toString();
				if(s.endsWith(convert)) {
					System.out.println("it is found");
					return true;
				}
			}System.out.println("its not found");
		}
		return false;
	}
	
	
	
}




