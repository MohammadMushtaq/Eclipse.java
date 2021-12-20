package com.xworkz.functional.impliment;
import com.xworkz.functional.find.Find;

public class EqualContentImpliment implements Find  {

	@Override
	public boolean experssion(String arg1, String arg2) {
		System.out.println("invoked equal element");
		return arg1.contains(arg2);
	}

}
