package com.xworks.merge;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import com.xworkz.collection.ArmyDTO;

public class ArmyScanner {

	public static void main(String[] args) {
		
	ArmyDTO armyDTO= new ArmyDTO("paramiltary","*",true,1500);
	ArmyDTO armyDTO1= new ArmyDTO("miltary","#",false,2000);
	ArmyDTO armyDTO2= new ArmyDTO("paramiltary","*",true,1500);
	ArmyDTO armyDTO3= new ArmyDTO("paramiltary","*",true,1500);

	Set<ArmyDTO> set= new HashSet<ArmyDTO>();
	
	set.add(armyDTO3);
	set.add(armyDTO2);
	set.add(armyDTO1);
	set.add(armyDTO);
	set.add(null);
	
	Iterator<ArmyDTO> army= set.iterator();
	while(army.hasNext()) {
		ArmyDTO a=army.next();
		System.out.println(a);
		
	}
	
	}

}
