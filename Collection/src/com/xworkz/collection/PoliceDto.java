package com.xworkz.collection;

import java.io.Serializable;

public class PoliceDto implements Serializable{
	
	String name,type,location;
	int staff;
	
	public PoliceDto() {
		System.out.println("invokes police station");
	}
	
	@Override
	public String toString() {
		return "PoliceDto [name=" + name + ", type=" + type + ", location=" + location + ", staff=" + staff + "]";
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return 5;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj!=null) {
			if(obj instanceof PoliceDto) {
				PoliceDto dto= (PoliceDto)obj;
				if(this.name.equals(dto.name)&& this.location.equals(dto.location)) {
					System.out.println("the content is same "+dto);
					return true;
				}
			}
			
		}
		return false;
		
	
	}
	public PoliceDto(String name, String type, String location, int staff) {
		super();
		this.name = name;
		this.type = type;
		this.location = location;
		this.staff = staff;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public int getStaff() {
		return staff;
	}
	public void setStaff(int staff) {
		this.staff = staff;
	}
	
	

}
