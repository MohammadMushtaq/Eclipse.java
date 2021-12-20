package com.xworkz.functional;

import com.xworkz.functional.DAO.ProductDAO;
import com.xworkz.functional.DTO.ProductDTO;

public class ProductScammer {

	public static void main(String[] args) {
		
		ProductDTO dtoCompare = new ProductDTO("milk3456", "Dairy Milk", 20, "Cadbury");
		ProductDAO dao = new ProductDAO();

		ProductDTO found = dao.find((dto1, dto2) -> {
			if (dto1.getName().equals(dto2.getName()) && dto1.getManufacturer().equals(dto2.getManufacturer())) {
				return dto1;
			}

			return null;
		}, dtoCompare);
		System.out.println(found);
	}

	}

