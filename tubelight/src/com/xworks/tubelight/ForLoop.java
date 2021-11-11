package com.xworks.tubelight;

import javax.sound.midi.SysexMessage;

public class ForLoop {

	public static void main(String[] args) {
	/*	String name="abcdefghijklmnopqrstuvwxyz", strng="";
		 char store;
		 System.out.print("orginal word: ");
		 System.out.println(name);
		 
		for (int i=0 ; i<name.length(); i++)
		{
			store=name.charAt(i);
			strng=store+strng;	
		}			
		System.out.println("reverse word: "+strng);
}
}*/

String name="ravi";
StringBuffer str = new StringBuffer(name);

System.out.println(str.reverse());

}

}









/*String input = "Geeks for Geeks";

StringBuilder input1 = new StringBuilder();

// append a string into StringBuilder input1
input1.append(input);

// reverse StringBuilder input1
input1.reverse();

// print reversed String
System.out.println(input1);*/

