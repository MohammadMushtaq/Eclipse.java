package com.xworkz.bridge;

import com.xworkz.bridge.interfac.Address;
import com.xworkz.bridge.interfac.AfricaCitizen;
import com.xworkz.bridge.interfac.Indiancitizen;
import com.xworkz.bridge.interfac.MarriageRule;
import com.xworkz.bridge.interfac.TrafficRule;
import com.xworkz.bridge.interfac.VotingRule;

public class RulesScanner {

	public static void main(String[] args) {
		
		Object obj = new Object();
		
		VotingRule voting = new Indiancitizen();
		System.out.println(voting.validId());
		
		System.out.println(voting.validAge());
		
		Indiancitizen indian = new Indiancitizen();
	
		indian.displayNameAndAddressDetails("ravi", Address.BANGALORE);
		System.out.println(indian);
		System.out.println(indian.LincenseNo());
		indian.validAge();
		System.out.println(indian.validAge('M', 25));
		System.out.println(indian.validInsurence());
		System.out.println(indian.validLicence());
		
		MarriageRule marraige =new Indiancitizen();
		System.out.println(marraige.validAge('M', 25));	
		
		TrafficRule traffic =new Indiancitizen();
		System.out.println(traffic.LincenseNo());
		System.out.println(traffic.validInsurence());
		System.out.println(traffic.validLicence());
		
		
		
		AfricaCitizen africa = new AfricaCitizen();
		africa.LincenseNo();
		africa.displayDetails();
		africa.validAge();
		africa.validAge('f', 25);
		africa.validId();
		africa.validInsurence();
		africa.validLicence();
		
		MarriageRule marr =new AfricaCitizen();
		System.out.println(marr.validAge('m', 24));
		
		VotingRule votingRule =new AfricaCitizen();
		System.out.println(votingRule.validAge());
		System.out.println(votingRule.validId());
		
		TrafficRule trafficRule =new AfricaCitizen();
		System.out.println(trafficRule.LincenseNo());
		System.out.println(trafficRule.validInsurence());
		System.out.println(trafficRule.validLicence());
		
		
		
		
			
	}

}
