package com.xworkz.functional.impliment;

import com.xworkz.functional.find.Find;

public class StartWith implements Find{

	@Override
	public boolean experssion(String arg1, String arg2) {
		
		return arg1.startsWith(arg2);
	}

}
