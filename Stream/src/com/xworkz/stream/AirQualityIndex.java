package com.xworkz.stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AirQualityIndex {

	public static void main(String[] args) {

		Integer good=50;
		Integer moderate=60;
		Integer moderate2=80;
		Integer moderate3=90;
		Integer moderate4=100;
		Integer unhealthy1=110;
		Integer unhealthy2=130;
		Integer unhealthy3=140;
		Integer unhealthy4=150;
		Integer veryUnhealthy1=160;
		Integer veryUnhealthy2=180;
		Integer veryUnhealthy3=190;
		Integer veryUnhealthy4=195;
		Integer veryUnhealthy5=200;
		Integer Hazardious1=220;
		Integer Hazardious2=240;
		Integer Hazardious3=260;
		Integer Hazardious4=280;
		Integer Hazardious5=300;
		
		
		Stream<Integer> air= Stream.of(good,moderate,moderate2,moderate3,moderate4,
				unhealthy1,unhealthy2,unhealthy3,unhealthy4,veryUnhealthy1,veryUnhealthy2,veryUnhealthy3,
				veryUnhealthy4,veryUnhealthy5,Hazardious1,Hazardious2,Hazardious3,Hazardious4,Hazardious5);
		
		List<Integer> temp= air.filter((e) -> e<100).sorted() .collect(Collectors.toList());
			temp.forEach((e) -> System.out.println( "moderate "+e));
		
			Stream<Integer> air1= Stream.of(good,moderate,moderate2,moderate3,moderate4,
					unhealthy1,unhealthy2,unhealthy3,unhealthy4,veryUnhealthy1,veryUnhealthy2,veryUnhealthy3,
					veryUnhealthy4,veryUnhealthy5,Hazardious1,Hazardious2,Hazardious3,Hazardious4,Hazardious5);
				
			
		List<Integer> airlist= air1.sorted((e1,e2) ->e2.compareTo(e1)).collect(Collectors.toList());
		airlist.forEach((e) ->System.out.println("air quality "+e));
			
					
		}


}
