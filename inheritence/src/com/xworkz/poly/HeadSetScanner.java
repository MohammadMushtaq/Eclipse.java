package com.xworkz.poly;

public class HeadSetScanner {

	public static void main(String[] args) {
		
		Headset headset1=new Headset("sony",HeadsetType.BLUETOOTH,1,2);
		Headset headset2=new Headset("boult",HeadsetType.WIRE,1,1);
		Headset headset3=new Headset("sony",HeadsetType.BLUETOOTH,2,3);

		System.out.println(headset1.hashCode());
		System.out.println(headset1.toString());
		
		System.out.println(headset2.toString());
		System.out.println(headset2.hashCode());
		
		System.out.println(headset1.equals(headset3));
		System.out.println(headset1.equals(headset2));
		System.out.println(headset1.equals(null));
		System.err.println(headset1.equals(123));
	}
}
