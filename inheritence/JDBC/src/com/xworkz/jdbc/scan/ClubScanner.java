package com.xworkz.jdbc.scan;

import com.xworkz.jdbc.dao.ClubDAO;
import com.xworkz.jdbc.dto.ClubDTO;

public class ClubScanner {

	public static void main(String[] args) {
		
		ClubDTO clubDTO= new ClubDTO(15,"seaclub","chandapura",50);
		
		ClubDAO clubDAO= new ClubDAO();
	//	clubDAO.save(clubDTO);
		//System.out.println(clubDTO);

		boolean delete=clubDAO.deleteById(2);
		System.out.println(delete);
	}

}
