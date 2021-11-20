package com.xworkz.bridge;

import com.xworkz.bridge.hostel.HostelRules;
import com.xworkz.bridge.hostel.SharavatiHostel;
import com.xworkz.bridge.hostel.Visiter;

public class HostelScanner {

	public static void main(String[] args) {
		
		HostelRules hostelRules= new SharavatiHostel();
		if(hostelRules instanceof SharavatiHostel) {
			SharavatiHostel casted=(SharavatiHostel)hostelRules;
			casted.inTime();
		}
		hostelRules.inTime();
		
		
		SharavatiHostel hostelRules2 = new SharavatiHostel();
		hostelRules2.inTime();
		hostelRules2.vistingDay();
		hostelRules2.outTime();
		
		Visiter vister = new SharavatiHostel();
		vister.vistingDay();
		System.out.println(vister.vistingDay());

		Object obj =new SharavatiHostel();////we can access 9 methods from object
		obj.equals(obj);
		Integer[] age = {24}; //we can access 9 methods from object
		age.getClass();
		
		
	}

}
