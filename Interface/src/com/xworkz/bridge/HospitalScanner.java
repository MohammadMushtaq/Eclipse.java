package com.xworkz.bridge;

import com.xworkz.bridge.hospital.Hospital;
import com.xworkz.bridge.hospital.HospitalAdmitRule;
import com.xworkz.bridge.hospital.HospitalAssociation;
import com.xworkz.bridge.hospital.HospitalDischargeRule;

public class HospitalScanner {

	public static void main(String[] args) {
		
		HospitalAdmitRule rule1 = new HospitalAssociation();
		HospitalDischargeRule rule2= new HospitalAssociation();
		
		
		Hospital hospital = new Hospital("Karnataka", "Bangalore", true, rule1, rule2);
		hospital.admitPatient();
		hospital.dischargePatient();
	}

}
