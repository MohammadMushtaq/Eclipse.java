package com.xworkz.poly;

import com.xworkz.poly.runtime.Type;
import com.xworkz.poly.runtime.Watch;

public class WatchStarter {

	public static void main(String[] args) {
		
		Watch watch =new Watch();
		System.out.println(watch.hashCode());
		System.out.println(watch.toString());
		
		Watch w1= new Watch();
		
		watch.setBrand("titen");
		watch.setType(Type.ANALOG);
		w1.setBrand("titen");
		w1.setType(Type.ANALOG);
		
		System.out.println(watch.getBrand());
	
		System.out.println(watch.equals(w1));
		System.out.println(watch.equals(1254));
		System.out.println(watch.equals(null));
		
		

	}

}
