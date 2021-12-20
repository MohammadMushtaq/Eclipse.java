package com.xworkz.functional;
import com.xworkz.functional.DAO.AmesmentParkDAO;
import com.xworkz.functional.DTO.AmesmentParkDTO;


public class WounderlaScanner {

	public static void main(String[] args) {
		AmesmentParkDTO dtoToCompare = new AmesmentParkDTO("wounderla","1500",true,true);

		AmesmentParkDAO dao = new AmesmentParkDAO();
		
		AmesmentParkDTO found = dao.find((dto1, dto2) -> {
			if (dto1.getName().equals(dto2.getName())) {
				return dto1;
			}
			return null;
		}, dtoToCompare);
		System.out.println(found);
	}
}

