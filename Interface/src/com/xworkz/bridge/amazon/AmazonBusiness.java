package com.xworkz.bridge.amazon;

public class AmazonBusiness {
	
	private AmazonCartDao dao;
	
	public AmazonBusiness(AmazonCartDao dao) {
		super();
		this.dao=dao;
	}
	
	public void saveCart(CartDTO dto) {
		
		if(dto!=null) {
			
			boolean found = dao.save(dto);
			if(found) {
			System.out.println("invoked save method Amazoncartdao");	
				
			}else {
				System.err.println("not found method ");
			}
		}else {
			System.err.println("your passing  null");
		}
		
	}
	
	public void findCartByName(CartDTO dto) {
		
		if(dto!=null) {
			CartDTO find = dao.findByName(dto.getName());
			
			if(find!=null) {
				System.out.println(" invoke method fcbn name found");
				System.out.println(find.getName());
				
			}else {
				System.err.println("name not found");
			}
			
		}else {
			System.err.println("passing a null");
		}		
	}
	public void displayCart() {
		if(dao!=null) {
		dao.displayAllCarDetails();
		}
		
	}

}
