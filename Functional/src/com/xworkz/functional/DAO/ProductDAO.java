package com.xworkz.functional.DAO;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.xworkz.functional.DTO.AmesmentParkDTO;
import com.xworkz.functional.DTO.ProductDTO;
import com.xworkz.functional.find.Product;

public class ProductDAO {

private List<ProductDTO> list = new ArrayList<ProductDTO>();
	

	public ProductDAO() {
		ProductDTO productDTO1 = new ProductDTO("0986chik", "Shampoo", 1, "Chik ");
		ProductDTO productDTO2 = new ProductDTO("milk3456", "Dairy Milk", 20, "Cadbury");
 		ProductDTO productDTO3 = new ProductDTO("890tfgs", "cold drinks", 50, "Mazza");
 		ProductDTO productDTO4 = new ProductDTO("Kurta456il", "Dress", 600, "Lylar");
 		ProductDTO productDTO5 = new ProductDTO("DAYPACKNEO15CBCRE", "Safari College Backpack", 300, "Safari");
 		ProductDTO productDTO6 = new ProductDTO("bagsskyer", "Bag", 500, "Sky bags");
 		ProductDTO productDTO7 = new ProductDTO("chair05set", "Chair", 50, "Ninga");
 		ProductDTO productDTO8 = new ProductDTO("woods345tg", "flywood", 1000, "GreenPly Industries Ltd");
 		ProductDTO productDTO9 = new ProductDTO("paragon778", "footware",500, "Paragon");
 		ProductDTO productDTO10 = new ProductDTO("pencil586", "pencil", 50, "Hindustan Pencils");
		this.list.add(productDTO1);
		this.list.add(productDTO2);
		this.list.add(productDTO3);
		this.list.add(productDTO4);
		this.list.add(productDTO5);
		this.list.add(productDTO6);
		this.list.add(productDTO7);
		this.list.add(productDTO8);
		this.list.add(productDTO9);
		this.list.add(productDTO10);
		
	}
	
	public ProductDTO find(Product match, ProductDTO dtoCompare ) {
		for(ProductDTO a : list) {
			return a;
		}
		return null;
	
}
}