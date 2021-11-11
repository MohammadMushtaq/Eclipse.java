package com.xworkz.season;

import com.xworkz.season.company.Kalla;
import com.xworkz.season.device.MobileKalla;

public class KallaStarter {

	public static void main(String[] args) {
		
		Kalla kalla = new Kalla();
		kalla.robbery("Chain");
		String ref = kalla.item();
		System.out.println(ref);

		
		MobileKalla kallar =new MobileKalla("raju","btm",25f,30,50,"bidar");
		String ref1=kallar.item();
		System.out.println(ref1);
		//kallar.item();
		kallar.display();
	
	}

}
