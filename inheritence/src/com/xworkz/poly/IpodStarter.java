package com.xworkz.poly;

import com.xworkz.poly.runtime.Ipod;

public class IpodStarter {

	public static void main(String[] args) {
		
		Ipod ipod = new Ipod();
		Ipod ipod2 = new Ipod();
	//	ipod.toString();
		System.out.println(ipod.toString());
		System.out.println(ipod.hashCode());

		ipod.setModelNo("HD1901");
		ipod2.setModelNo("HD1901");
		System.out.println(ipod.equals(ipod2));
	}

}
