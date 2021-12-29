package com.xworkz.sys.dto.Runner;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import com.xworkz.sys.dto.PalacesDto;

public class PalacesTester {

	public static void main(String[] args) {
		
		PalacesDto palacesDto1= new PalacesDto("mysore palace","mysore",4.5f,true,7);
		PalacesDto palacesDto2= new PalacesDto("bangalore palace","bangalore",4.1f,true,8);
		PalacesDto palacesDto3= new PalacesDto("bellary palace","bellary",4.2f,true,9);
		PalacesDto palacesDto4= new PalacesDto("mysore palace","mysore",4.3f,true,4);
		PalacesDto palacesDto5= new PalacesDto("delhi palace","delhi",4.4f,true,8);
		PalacesDto palacesDto6= new PalacesDto("taj palace","agra",5f,true,10);
		PalacesDto palacesDto7= new PalacesDto("raichur palace","raichur",3.5f,false,11);
		PalacesDto palacesDto8= new PalacesDto("punjab palace","punjab",4.5f,true,12);
		PalacesDto palacesDto9= new PalacesDto("delhi palace","del",4.5f,true,7);
		PalacesDto palacesDto10= new PalacesDto("ninepiller palace","rajkot",4.5f,false,7);
		
		List<PalacesDto> list = new ArrayList<PalacesDto>();
		list.add(palacesDto1);
		list.add(palacesDto2);
		list.add(palacesDto3);
		list.add(palacesDto4);
		list.add(palacesDto5);
		list.add(palacesDto6);
		list.add(palacesDto7);
		list.add(palacesDto8);
		list.add(palacesDto9);
		list.add(palacesDto10);
		
		boolean  remove =list.remove(palacesDto1);
		System.out.println(remove);
		
		boolean contain =list.contains(palacesDto10);
		System.out.println(contain);
		
	//	list.clear();
		
		int size =list.size();
		System.out.println(size);
		
		Iterator<PalacesDto> it=  list.iterator();
		while (it.hasNext()) {
			PalacesDto palacesDto = (PalacesDto) it.next();
			System.out.println(palacesDto);
		}
	}

}
