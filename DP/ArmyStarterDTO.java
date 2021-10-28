package com.xworkz.DP;

import com.xworkz.DP.DTO.ArmyDTO;

public class ArmyStarterDTO {

	public static void main(String[] args) {
		ArmyDTO ref = new ArmyDTO();

		ref.setCountry("India");
		ref.setGeneralName("general Thimmaiah");
		ref.setNoOfAirCraft(1000);
		ref.setNoOfSoldiers(300000);
		ref.setNoOfTanker(4000);

		ArmyDTO army1 = new ArmyDTO("Sri Lanka", 300000, 10, "Belliappa", 100, 0);
		ArmyDTO army2 = new ArmyDTO("america", 2500000, 10, "stene lee", 1664, 66);
		ArmyDTO army3 = new ArmyDTO("mexico", 3005000, 9, "meme", 105, 8);
		ArmyDTO army4 = new ArmyDTO("Sri Lanka", 300000, 10, "Belliappa", 100, 0);
		ArmyDTO army5 = new ArmyDTO("Sri Lanka", 300000, 10, "Belliappa", 100, 0);
		ArmyDTO army6 = new ArmyDTO("Sri Lanka", 300000, 10, "Belliappa", 100, 0);

		ArmyDTO[] array = new ArmyDTO[5];
		array[2] = army2;
		array[3] = army1;
		array[0] = army4;
		array[1] = army3;
		array[2] = army2;

		for (int i = 0; i < array.length; i++) {
			
			System.out.println("````````````````````````````````````````````");

			if (array[i] != null) {
				System.out.println("country :".concat(array[i].getCountry()));
				System.out.println("general name :".concat(array[i].getGeneralName()));
				System.out.println("No of soldiers :".concat(String.valueOf( array[i].getNoOfSoldiers())));
				System.out.println("No of Tanker :".concat(String.valueOf(array[i].getNoOfTanker())));
				System.out.println("No of Submarine :".concat(String.valueOf(array[i].getNoOfSubmarine())));

			} else {
				System.out.println("array is null");
			}
		}

	}


	}

