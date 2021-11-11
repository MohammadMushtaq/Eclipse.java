package com.xworkz.poly;

import com.xworkz.poly.runtime.Belt;

public class BeltScanner {

	public static void main(String[] args) {
		
		Belt belt =new Belt("vega", "leather", 30.5f, "male");
		Belt belt1 =new Belt("nike", "pureLeather", 25.5f, "femail");
		Belt belt2=new Belt("vega", null, 30.5f, null);
		
		System.out.println(belt.getBrand());
		System.out.println(belt.hashCode());
		
		System.out.println(belt1.getBrand());
		System.out.println(belt1.hashCode());
		
		System.out.println(belt.equals(belt1));
		System.out.println(belt.equals(null));
		System.out.println(belt.equals(belt2));
		System.out.println(belt.equals(5456));
		
	}

}
