package com.xworkz.bridge;

import com.xworkz.bridge.Temple.DevoteeRule;
import com.xworkz.bridge.Temple.PublicDevoteeRule;
import com.xworkz.bridge.Temple.TempleAssociation;

public class TempleScanner {

	public static void main(String[] args) {
	DevoteeRule dev = new PublicDevoteeRule();
		
		TempleAssociation temple= new TempleAssociation(dev,"ickon");
		temple.allowDevotee();

	}

}
