package com.xworkz.bridge;

import com.xworkz.bridge.amazon.AmazonBusiness;
import com.xworkz.bridge.amazon.AmazonCartDao;
import com.xworkz.bridge.amazon.ArrayAmazonCartDAO;
import com.xworkz.bridge.amazon.CartDTO;

public class AmazonScanner {

	public static void main(String[] args) {
		
		CartDTO cartDTORef=new CartDTO("gadgets",5,20000.5f,"mobile");
		AmazonCartDao amezonCartDAO=new ArrayAmazonCartDAO();
		AmazonBusiness business=new AmazonBusiness(amezonCartDAO);
		business.saveCart(cartDTORef);
		business.findCartByName(cartDTORef);
		business.displayCart();
		

	}

}
