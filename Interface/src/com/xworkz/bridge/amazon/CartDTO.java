package com.xworkz.bridge.amazon;

public class CartDTO {
	
	private String name;
	private int quantity;
	private double pice;
	private String item;
	
	public CartDTO() {
		System.out.println("invoked catrdto");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getPice() {
		return pice;
	}

	public void setPice(double pice) {
		this.pice = pice;
	}

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public CartDTO(String name, int quantity, double pice, String item) {
		super();
		this.name = name;
		this.quantity = quantity;
		this.pice = pice;
		this.item = item;
	}
	

}
