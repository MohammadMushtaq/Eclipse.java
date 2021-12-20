package com.xworkz.stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AirPortRunner {

	public static void main(String[] args) {
		
		String Airport1="kempegounda";
		String Airport2="rajivgandi";
		String Airport3="chatrapati";
		String Airport4="sambaji";
		String Airport5="Ambani";
		String Airport6="sai";
		String Airport7="bellary";
		String Airport8="hubli";
		String Airport9="raichur";
		String Airport10="shivmaogga";
		String Airport11="Indra gandi";
		String Airport12="bidar";
		String Airport13="dubai";
		String Airport14="oman";
		String Airport15="iran";
		String Airport16="America";
		String Airport17="china";
		String Airport18="japan";
		String Airport19="southkoria";
		String Airport20="northkoria";
		
		
		System.out.println("Ascending order---------------");
		System.out.println(" ");
		
		
		Stream<String> airportList1=Stream.of(Airport1,Airport2,Airport3,Airport4,Airport5,
				Airport6,Airport7,Airport8,Airport9,Airport10,Airport11,Airport12,Airport13,Airport14,
				Airport15,Airport16,Airport17,Airport18,Airport19,Airport20);
		
		List<String> temp1= airportList1.filter((a1) ->a1.startsWith("s")).collect(Collectors.toList());
		temp1.forEach((a) -> System.out.println(a.toUpperCase()));
		
		
		
		Stream<String> airportList=Stream.of(Airport1,Airport2,Airport3,Airport4,Airport5,
				Airport6,Airport7,Airport8,Airport9,Airport10,Airport11,Airport12,Airport13,Airport14,
				Airport15,Airport16,Airport17,Airport18,Airport19,Airport20);
		
		System.out.println(" ");
		System.out.println( "Decending order=========================");
		System.out.println(" ");
		List<String> temp= airportList.sorted((e1,e2) -> e2.compareTo(e1)).collect(Collectors.toList());
		temp.forEach((e) -> System.out.println(e.toLowerCase()));
		
		
		
	}

}
