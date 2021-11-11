package com.xworkz.poly;

public class Headset {

	private String brand;
	private int warrenty;
	private float battery;
	private HeadsetType headsetType;
public Headset() {
	// TODO Auto-generated constructor stub
}
public Headset(String brand,  HeadsetType headsetType, int warrenty, float battery) {
	super();
	this.brand = brand;
	this.headsetType = headsetType;
	this.warrenty = warrenty;
	this.battery = battery;
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
public boolean equals(Object obj) {
	
	System.out.println("invoked equal methos");
	if(obj !=null) {
		System.out.println("right not passing a null");
		if (obj instanceof Headset)
		{
			System.out.println("your passed a headset ref");
		}else {
			System.err.println("your not passing a headset ref ");
		}
		Headset href=(Headset)obj;
		String ref=href.getBrand();
		HeadsetType ref2=href.getType();
		if(this.brand.equals(ref) && this.headsetType.equals(ref2)) 
		{
			System.out.println("headsetfound ");
			return true;}
		else{
				System.out.println("not found");
			}
		}
		

	return false;
	
}

public String getBrand() {
	return brand;
}

public HeadsetType getType() {
	return headsetType;
}
public int getWarrenty() {
	return warrenty;
}

public float getBattery() {
	return battery;
}

	

}


