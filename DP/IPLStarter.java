package com.xworkz.DP;
import com.xworkz.DP.DAO.IPLDAO;
import com.xworkz.DP.DAO.IplDAO;
import com.xworkz.DP.DTO.IplDTO;

public class IPLStarter {
	public static void main(String[] args) {
		IPLDAO ref1 = new IPLDAO("RCB", 11, 24, "UB", "puma");
		IPLDAO ref2 = new IPLDAO("MI", 11, 24, "JIO", "JIO");
		IPLDAO ref3 = new IPLDAO("DD", 11, 24, "UB", "PARAGON");

		IPLDAO val = new IPLDAO();
		val.create(ref3);
	
		
		
		val.create(new IplDTO("srh", 11, 24, "britania", "puma"), 4);

		val.occupiedIndex();
		val.search("srh");
		
		IplDTO[] array =val.getDetails();
		
		for (int i = 0; i < array.length; i++) {
			IplDTO arr=array[i];
			System.out.println("``````````````````````````````````````````````");
			if(arr!=null) {
			System.out.println("name" +arr.getName());
			System.out.println("numberof player ".concat(String.valueOf(arr.getNoOfPlayer())));
			System.out.println("Team size "+ arr.getTeamSize());
			System.out.println("Sponsership "+ arr.getSponsership());
			System.out.println("ower name "+ arr.getOwnerName());
			
			}
			else {
				System.out.println("null");
			}
		}
	}
	}

}
