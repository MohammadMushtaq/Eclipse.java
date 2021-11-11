package com.xworkz.season.company;

import com.xworkz.season.device.IronBox;

public class PhilipIronBox extends IronBox{

	public PhilipIronBox() {
		super();
		System.out.println("invoked philips no arg const");
	}
	public PhilipIronBox(String brandName, String type, boolean working, double maxTemp, double minTemp)
	{
		super(brandName,type,working,maxTemp,minTemp);
		System.out.println("invoked all string,boolean,type,double");
	}
	public void display() {
		System.out.println(super.getBrandName());
		System.out.println(getMaxTemp());
		System.out.println(getMinTemp());
		System.out.println(super.isWorking());
		System.out.println(super.getType());
	}
	@Override
	public void produceHeat()
	{
		System.out.println("invoked ");
	}
		
	}
