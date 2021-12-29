package com.xworkz.sys.dto;

public class StateDto {
	
	private String name;
	private int distics;
	private int taluk;
	private float area;
	private boolean flag;
	
	
	public StateDto(String name, int distics, int taluk, float area, boolean flag) {
		super();
		this.name = name;
		this.distics = distics;
		this.taluk = taluk;
		this.area = area;
		this.flag = flag;
	}
	
	public StateDto() {
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDistics() {
		return distics;
	}

	public void setDistics(int distics) {
		this.distics = distics;
	}

	public int getTaluk() {
		return taluk;
	}

	public void setTaluk(int taluk) {
		this.taluk = taluk;
	}

	public float getArea() {
		return area;
	}

	public void setArea(float area) {
		this.area = area;
	}

	public boolean isFlag() {
		return flag;
	}

	public void setFlag(boolean flag) {
		this.flag = flag;
	}

	@Override
	public String toString() {
		return "StateDto [name=" + name + ", distics=" + distics + ", taluk=" + taluk + ", area=" + area + ", flag="
				+ flag + "]";
	}

}
