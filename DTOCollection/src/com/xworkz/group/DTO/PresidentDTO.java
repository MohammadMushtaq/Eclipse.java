package com.xworkz.group.DTO;

import java.io.Serializable;

public class PresidentDTO implements Serializable {
	
	private float id;
	private String name;
	private  int tenure; 
	private String CountryName;
	
	public PresidentDTO() {
		System.out.println("invoked no argument constructor");
	}
	

	public PresidentDTO(float id, String name, int tenure, String countryName) {
		super();
		this.id = id;
		this.name = name;
		this.tenure = tenure;
		CountryName = countryName;
	}
	@Override
	public int hashCode() {
		
		return super.hashCode();
	}
	@Override
	public String toString() {
		return "PresidentDTO [id=" + id + ", name=" + name + ", tenure=" + tenure + ", CountryName=" + CountryName
				+ "]";
	}


	public float getId() {
		return id;
	}

	public void setId(float id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getTenure() {
		return tenure;
	}

	public void setTenure(int tenure) {
		this.tenure = tenure;
	}

	public String getCountryName() {
		return CountryName;
	}

	public void setCountryName(String countryName) {
		CountryName = countryName;
	}
	
}
