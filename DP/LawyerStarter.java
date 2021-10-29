package com.xworkz.DP;

import com.xworkz.DP.DAO.LawyerDAO;
import com.xworkz.DP.DTO.LawyerDTO;

public class LawyerStarter {

	public static void main(String[] args) {
		//public LawyerDTO(String name, String qualification, int experience, String gender, int age, int caseWon,
				//int caseLost)
		
		LawyerDTO lawyerDtos0 = new LawyerDTO("ravi","BALLB",1,"male",24,0,1);
		LawyerDTO lawyerDtos1 = new LawyerDTO("naveen","BALLB",2,"male",29,2,2);
		LawyerDTO lawyerDtos2 = new LawyerDTO("pooja","BALLB",3,"femail",25,1,3);
		LawyerDTO lawyerDtos3 = new LawyerDTO("prasad","BALLB",4,"male",27,0,2);
		LawyerDTO lawyerDtos4 = new LawyerDTO("Fuzail","BALLB",5,"male",28,1,2);
		LawyerDTO lawyerDtos5 = new LawyerDTO("anusha","BALLB",6,"femail",23,2,1);
		LawyerDTO lawyerDtos6 = new LawyerDTO("mishra","BALLB",7,"male",26,3,3);
		LawyerDTO lawyerDtos7 = new LawyerDTO("priyanka","BALLB",8,"femail",30,4,3);
		LawyerDTO lawyerDtos8 = new LawyerDTO("veeresh","BALLB",9,"male",32,5,2);
		LawyerDTO lawyerDtos9 = new LawyerDTO("anil","LLB",10,"male",33,6,1);
		
		LawyerDAO lawyerDAOs = new LawyerDAO();
		lawyerDAOs.save(lawyerDtos0);
		lawyerDAOs.save(lawyerDtos1);
		lawyerDAOs.save(lawyerDtos2);
		lawyerDAOs.save(lawyerDtos3);
		lawyerDAOs.save(lawyerDtos4);
		lawyerDAOs.save(lawyerDtos5);
		lawyerDAOs.save(lawyerDtos6);
		lawyerDAOs.save(lawyerDtos7);
		lawyerDAOs.save(lawyerDtos8);
		lawyerDAOs.save(lawyerDtos9);
		
		//lawyerDAOs.delete(1);
		
		//lawyerDAOs.capture(lawyerDtos9, 9);
		int number = lawyerDAOs.noOfindexOccupied();
		System.out.println("number of index occupied ".concat(String.valueOf(number)));
		
		lawyerDAOs.display();
		
		
		boolean foundName = lawyerDAOs.searchByName("ravi");
		System.out.println("name found " + foundName);

		boolean foundCaseWon = lawyerDAOs.searchByCaseWon(10);
		System.out.println(" found " + foundCaseWon);

		String name = "anil";
		String qualification = lawyerDAOs.getQualificationByName(name);
		System.out.println("qaulification of ".concat(name)+" is".concat(String.valueOf(qualification)));
		
		String[] nameWithMaxExp = lawyerDAOs.getMaxExperience();
		
		for (int i = 0; i < nameWithMaxExp.length; i++) {
			if (nameWithMaxExp[i] != null) {
				System.out.print(nameWithMaxExp[i] + " ");
			}
		}
		System.out.println(" having same  maximum experience");
		
		Integer experienceByName = lawyerDAOs.getExperienceByName("naveen");
		System.out.println("total experience " + experienceByName);
		
		

		
		
		
	}

}
