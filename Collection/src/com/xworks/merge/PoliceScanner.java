package com.xworks.merge;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import com.xworkz.collection.PoliceDto;

public class PoliceScanner {

	public static void main(String[] args) {
		
		PoliceDto policeDto1= new PoliceDto("btmLayout","civil","micolayout",25);
		PoliceDto policeDto2= new PoliceDto("madiwala","crime","madiwalaStation",20);
		PoliceDto policeDto3= new PoliceDto("silkboard","crime","silkstation",35);
		PoliceDto policeDto4= new PoliceDto("bangalore","crime","bangstation",45);
		PoliceDto policeDto5= new PoliceDto("btmLayout","civil","micolayout",25);
		
		Set<PoliceDto> set= new HashSet<PoliceDto>();
		set.add(policeDto1);
		set.add(policeDto2);
		set.add(policeDto3);
		set.add(policeDto4);
		set.add(policeDto5);
		
		Iterator<PoliceDto> ite=set.iterator();
		while(ite.hasNext()) {
			PoliceDto content=ite.next();
			System.out.println(content);
			
		}
			
		}

	}

