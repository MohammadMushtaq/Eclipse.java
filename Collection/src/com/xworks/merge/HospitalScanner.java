package com.xworks.merge;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import com.xworkz.collection.HospitalDto;

public class HospitalScanner {

	public static void main(String[] args) {
		
		HospitalDto hospitalDto1= new HospitalDto("malya","mejestic",25,"truma");
		HospitalDto hospitalDto2= new HospitalDto("narayana","chandapura",100,"kidney");
		HospitalDto hospitalDto3= new HospitalDto("jayadeva","banashankari",50,"heart");
		HospitalDto hospitalDto4= new HospitalDto("malya","mejestic",25,"truma");
		HospitalDto hospitalDto5= new HospitalDto("nimans","lalbagh",75,"cancer");
		
		Set<HospitalDto> sets= new HashSet<HospitalDto>();
			sets.add(hospitalDto1);
			sets.add(hospitalDto2);
			sets.add(hospitalDto3);
			sets.add(hospitalDto4);
			sets.add(hospitalDto5);
			
			System.out.println(sets.size());
		
		Iterator<HospitalDto> hosp= sets.iterator();
			
		while(hosp.hasNext()) {
			HospitalDto content=hosp.next();
			System.out.println(content);
		}
	}

}
