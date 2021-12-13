package com.xworks.merge;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import com.xworkz.collection.OfficeDto;

public class OfficeStarter{

	public static void main(String[] args) {
		
		OfficeDto officeDto= new OfficeDto("RTO",50,10,"STATE","BTM");
		OfficeDto officeDto1= new OfficeDto("munciple",100,12,"STATE","majestic");
		OfficeDto officeDto2= new OfficeDto("REGISTER",30,10,"Central","kr market");
		OfficeDto officeDto3= new OfficeDto("kmdc",15,9,"central","lalbagh");
		OfficeDto officeDto4= new OfficeDto("RTO",20,10,"STATE","BTM");

		
		Set<OfficeDto> set = new HashSet<OfficeDto>();
		set.add(officeDto1);
		set.add(officeDto2);
		set.add(officeDto4);
		set.add(officeDto3);
		set.add(officeDto);
		System.out.println(set.size()); 
		
		Iterator<OfficeDto> iterator=set.iterator();
		while(iterator.hasNext()) {
			OfficeDto contain=iterator.next();
			System.out.println(contain);
		}
		
		
		
		

	}

}
