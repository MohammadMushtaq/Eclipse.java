package com.xworkz.functional.DAO;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.xworkz.functional.DTO.AmesmentParkDTO;
import com.xworkz.functional.find.AmesementParkFinder;


public class AmesmentParkDAO {
	
	List<AmesmentParkDTO> listref= new ArrayList<AmesmentParkDTO>();
	
	public AmesmentParkDAO() {
		AmesmentParkDTO dto1= new AmesmentParkDTO("wounderla","1500",true,true);
		AmesmentParkDTO dto2=new AmesmentParkDTO("krs","1000",false,true);
		listref.add(dto1);
		listref.add(dto2);
		this.listref.add(new AmesmentParkDTO("waterworld","800",true,true));
		this.listref.add(new AmesmentParkDTO("newWorld","1800",true,true));
	}
	public AmesmentParkDTO find(AmesementParkFinder match,AmesmentParkDTO dtoCompare ) {
		Iterator<AmesmentParkDTO> it = this.listref.iterator();
		while (it.hasNext()) {
			AmesmentParkDTO element = it.next();
			AmesmentParkDTO temp=match.evaluate(element, dtoCompare);
			if(temp!=null) {
				return element;
			}
			
	}
	return null;
	
}
}