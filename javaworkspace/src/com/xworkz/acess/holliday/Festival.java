package com.xworkz.acess.holliday;

public class Festival {

	public static boolean holiday;
	String name;
	private int count=0;
	
	public Festival() {
		
		System.out.println("invoke no arugument const of festival");		
	}
	
	public void celebration(String name)
	{
		System.out.println("invoke celebartion  " +name);
	}
	public static void enjoy()
	{
		System.out.println("enjoy");
	}
	

}

