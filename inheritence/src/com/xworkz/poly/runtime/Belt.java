package com.xworkz.poly.runtime;

public class Belt {
	private String brand;
	private String material;
	private Float size;
	private String gender;

	public Belt() {
		System.out.println("invoked belt no arg const");
	}

	public Belt(String brand, String material, Float size, String gender) {
		super();
		this.brand = brand;
		this.material = material;
		this.size = size;
		this.gender = gender;
	}
	@Override
	public int hashCode() {
		System.out.println("invoked hashcode");
		return super.hashCode();
	}
@Override
	public String toString() {
	System.out.println("invoked toString");
		return super.toString();
	}
@Override
public boolean equals(Object obj) {
	System.out.println("invoked equal method");
	if(obj!=null) {
		System.out.println("not passing a null");
	if(obj instanceof Belt) 
	{
		System.out.println("passing a ref of belt");

	Belt belt = (Belt)obj;
	String brand =belt.getBrand();
	Float fl=belt.getSize();
	if(this.brand.equals(brand) && this.size.equals(fl)) {
		System.out.println("belt found matched");
		return true;
	 }else {
		 System.err.println("belt not found ");
		 }
	 }else {
		 System.err.println("aare proper ref bhej");
	 }
	
	}else {
		System.err.println(" passing a null");
	}
	
	
	return false;	
}

	public String getBrand() {
		return brand;
	}

	public String getMaterial() {
		return material;
	}

	public Float getSize() {
		return size;
	}

	public String getGender() {
		return gender;
	}
	
}
