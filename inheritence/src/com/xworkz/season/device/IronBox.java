package com.xworkz.season.device;

public class IronBox {

	private String brandName;
	private String type;
	private boolean Working;
	private double maxTemp;
	private double minTemp;
	
	public IronBox() {
		// TODO Auto-generated constructor stub
	}

	public IronBox(String brandName, String type, boolean working, double maxTemp, double minTemp) {
		super();
		this.brandName = brandName;
		this.type = type;
		Working = working;
		this.maxTemp = maxTemp;
		this.minTemp = minTemp;
	}
	protected void produceHeat() {
		System.out.println("invoked produce heat");
	}
	protected void turnOn(){
		System.out.println("invoked turn on");
	}
	protected void turnOff() {
		System.out.println("invoked turnoff");
	}
	protected String getBrandName() {
		return brandName;
	}

	protected String getType() {
		return type;
	}

	protected boolean isWorking() {
		return Working;
	}

	protected double getMaxTemp() {
		return maxTemp;
	}

	protected double getMinTemp() {
		return minTemp;
	}
	
	
}
