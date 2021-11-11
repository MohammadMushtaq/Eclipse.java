package com.xworks.tubelight;

public class TubelightStarter {

	public static void main(String[] args) {
		String length = "30cm";
		length=length.concat(" length");
		System.out.println(length);
		String length1=new String("40cm");
		length=length1.concat(" length");
		System.out.println(length1);
		System.out.println(length);
		System.out.println(length1+"  "+null);

		
	}

}
