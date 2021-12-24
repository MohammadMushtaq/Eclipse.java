package com.xworkz.group.Scanner;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

import com.xworkz.group.DTO.PresidentDTO;

public class PresidentScanner {

	public static void main(String[] args) {
		
		PresidentDTO presidentDTO = new PresidentDTO(11,"prathiba patil",4,"india");
		PresidentDTO presidentDTO1 = new PresidentDTO(12,"apj abdul kalam",5,"india");
		PresidentDTO presidentDTO2 = new PresidentDTO(13,"Ramand govind",6,"india");
		PresidentDTO presidentDTO3 = new PresidentDTO(14,"barak obama",4,"u.s.a");
		PresidentDTO presidentDTO4 = new PresidentDTO(15,"putin ",20,"russain");
		PresidentDTO presidentDTO5 = new PresidentDTO(17,"kim ",20,"south korea");
		
		List<PresidentDTO> listpresident = new ArrayList<PresidentDTO>();
		listpresident.add(presidentDTO);
		listpresident.add(presidentDTO1);
		listpresident.add(presidentDTO2);
		listpresident.add(presidentDTO3);
		listpresident.add(presidentDTO4);
		listpresident.add(presidentDTO5);
		
		 
		Stream<PresidentDTO> president = Stream.of(presidentDTO,presidentDTO1,presidentDTO2,
				presidentDTO3,presidentDTO4,presidentDTO5); 
		
		president.forEach((e) ->System.out.println(e)) ;

		System.out.println(System.lineSeparator());
		
		Comparator<PresidentDTO> compare= (e1,e2) ->{
			float e1Tenure=e1.getId();
			float e2Tenure=e2.getId(); 
			if(e1Tenure==e2Tenure) return 0;
			if(e1Tenure<e2Tenure) return 1;
			if(e1Tenure>e2Tenure)return -10;	
			return 0;
		};
	listpresident.stream().filter((dto) ->dto.getCountryName().equals("india"))
	.sorted(compare)
	.forEach((dto) ->System.out.println(dto+" "));
	
	listpresident.stream().sorted(compare)
			.forEach((dto) ->System.out.println(dto.getName().concat(" ")
			.concat(String.valueOf(dto.getTenure()))));
	
	System.out.println(System.lineSeparator());
	
	listpresident.stream().sorted(compare.reversed()).forEach((e)
			->System.out.println(e.getName()));
	
	System.out.println(System.lineSeparator());
	
	System.out.println(listpresident.stream().max(Comparator.comparing(PresidentDTO::getTenure)).get());
	
	}
}
