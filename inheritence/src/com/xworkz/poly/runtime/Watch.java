package com.xworkz.poly.runtime;

public class Watch {

	private String brand;
	private Type type;
	private Float price;

	public Float getPrice() {
		return price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}

	public Watch() {

		System.out.println("invoke watch const");
	}

	@Override
	public int hashCode() {

		return super.hashCode();
	}

	@Override
	public String toString() {

		return super.toString();
	}

	@Override
	public boolean equals(Object obje) {
		System.out.println("invoked equal method");
		if (obje != null) {
			System.out.println("great not passing a null");
			
		if(obje instanceof Watch ) {
			System.out.println("passing a valid watch ref");
	
		Watch wat = (Watch)obje;
		String ref1=wat.brand;
		Type ref2=wat.type;
		if(this.brand.equals(ref1) && this.type.equals(ref2)) {
			System.out.println("Watch found matched");
			return true;
		}else {
			System.out.println("watch not found mismatch");
		}
		}
		else {
			System.err.println("aare wrong ref bejra dek");
		}}else {
			System.err.println("hey! your passing a null");
			}
		return false;
		}
	

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

}
