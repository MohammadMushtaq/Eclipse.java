package com.xworkz.jdbc.scan;

import com.xworkz.jdbc.dao.FestivalDto;
import com.xworkz.jdbc.dto.FestivalDao;

public class FeestivalScanner {

	public static void main(String[] args) {
		
		FestivalDto festivalDto= new FestivalDto(1,"deepawali",10,"tamilNadu");
		FestivalDto festivalDto1= new FestivalDto(2,"sankranti",7,"karnataka");
		FestivalDto festivalDto2= new FestivalDto(3,"lodi",9,"punjab");
		FestivalDto festivalDto3= new FestivalDto(4,"navrattri",10,"gujrat");
		
		FestivalDao f= new FestivalDao();
	//	f.save(festivalDto3);
		
		boolean remove=f.deleteById(2);
		System.out.println(remove);
		
		
		
		
	}

}
