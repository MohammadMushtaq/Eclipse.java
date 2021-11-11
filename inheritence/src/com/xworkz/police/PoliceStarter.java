package com.xworkz.police;

import com.xworkz.police.crime.CrimePolice;


public class PoliceStarter {

	public static void main(String[] args) {
		
		Police poli = new CrimePolice();
		poli.displayDetail();
		
		Police traffic=new TrafficPolice();
		traffic.displayDetail();
		
		
	
	}
}
