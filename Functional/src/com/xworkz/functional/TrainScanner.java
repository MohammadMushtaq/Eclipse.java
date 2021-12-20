package com.xworkz.functional;

import com.xworkz.functional.DAO.TrainNos;
import com.xworkz.functional.find.Find;
import com.xworkz.functional.impliment.EndsWith;
import com.xworkz.functional.impliment.EqualContentImpliment;
import com.xworkz.functional.impliment.StartWith;

public class TrainScanner {

	public static void main(String[] args) {
		
		TrainNos tr= new TrainNos();
		
		Find enter= new StartWith();
		boolean s=tr.find(enter,"915");
		System.out.println(s);
		
		Find ent= new EndsWith();
		boolean r= tr.find(ent, "123");
		System.out.println(r);
		
		Find ent1= new EqualContentImpliment();
		boolean f= tr.find(ent, "845454845");
		System.out.println(f);

	}

}
