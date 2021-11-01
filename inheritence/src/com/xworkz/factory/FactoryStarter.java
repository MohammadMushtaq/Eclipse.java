package com.xworkz.factory;

import com.xworkz.factory.yes.Factory;
import com.xworkz.factory.yes.SugarFactory;

public class FactoryStarter {

	public static void main(String[] args) {
		
		Factory f1=new SugarFactory();
		f1=new SugarFactory("indus");
		
		SugarFactory f2 =new SugarFactory();
		f2=new SugarFactory(45);

	}

}
