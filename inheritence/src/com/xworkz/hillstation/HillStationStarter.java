package com.xworkz.hillstation;

import com.xworkz.hillstation.state.HillStation;
import com.xworkz.hillstation.state.NandiHillStation;

public class HillStationStarter {

	public static void main(String[] args) {
		
		//parent ref =child instance
		//class type =new instance
//we can declaere inst va by  lit method const,method
	//when declare arguby another package by inheritance and ref
		//inheritence by partent to child class by extends keyword
		
		HillStation hillStation=new HillStation("nan",900);
		System.out.println(hillStation.elivation);
		System.out.println(hillStation.name);
		NandiHillStation nandiHillStation=new NandiHillStation();
		System.out.println(nandiHillStation.elivation);
		System.out.println(nandiHillStation.name);
		NandiHillStation hillStation2 =new NandiHillStation();
		hillStation2.displaydetails();
		((NandiHillStation)hillStation2).updateElivation(1500);
		
		String rep = hillStation.toString();
		System.out.println(rep);
		System.out.println(hillStation.hashCode());
		System.out.println(hillStation);
		
		String name="mushtaq";
		System.out.println(name.hashCode());
		
	}

}
