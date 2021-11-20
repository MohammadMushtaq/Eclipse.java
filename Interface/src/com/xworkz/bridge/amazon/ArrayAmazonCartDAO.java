package com.xworkz.bridge.amazon;

public class ArrayAmazonCartDAO implements AmazonCartDao {
   
	private CartDTO[] dtos=new CartDTO[10];
	private int counter;
	
	
	@Override
	public boolean save(CartDTO cartDto) {
		System.out.println("invoked save method of array method");
		if(cartDto!= null && counter<dtos.length) {
			this.dtos[counter]=cartDto;
			counter++;
			return true;
		}
		return false;
	}

	@Override
	public CartDTO findByName(String name) {
		System.out.println("invoked find array method");
		
		if(name!=null ) {
			for (int i = 0; i < dtos.length; i++) {
				CartDTO ref= dtos[i];
				if(ref!=null){
					String nameref =ref.getName();
					if(name.equalsIgnoreCase(nameref)) {
						return ref;
					}
					}
					else {
				System.out.println("name not found");
				}
			}	
	}
		return null;
}
	@Override
	public void displayAllCarDetails() {
		System.out.println("invoked details display");
		
		for (int i = 0; i < dtos.length; i++) {
			CartDTO ref= dtos[i];
			if(ref!=null){
				System.out.println(ref.getName());
				System.out.println(ref.getItem());	
				System.out.println(ref.getPice());
				System.out.println(ref.getQuantity());
				
			}
		
		else {
			System.err.println("null at the index ".concat(String.valueOf(i)));
		}}
	}

}
