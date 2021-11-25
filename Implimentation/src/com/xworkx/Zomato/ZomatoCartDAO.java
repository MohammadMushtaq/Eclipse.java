package com.xworkx.Zomato;

public interface ZomatoCartDAO {
	
	boolean save(CartDTO cartDTO);
	CartDTO findByName(String name);
	void displayAllDetails();

}
