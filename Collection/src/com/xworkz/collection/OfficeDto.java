package com.xworkz.collection;

import java.io.Serializable;

public class OfficeDto implements Serializable{
	
	private String departmentName;
	private int Staff;
	private int workingHours;
	private String governmentType;
	private String location;
	
	public OfficeDto() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public int hashCode() {
		
		return 7;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj!=null) {
			if(obj instanceof OfficeDto) {
				OfficeDto dto = (OfficeDto)obj;
				if(this.departmentName.equals(dto.departmentName) && this.location.equals(dto.location)) {
					System.out.println("it is a duplicate "+dto); 
					return true;
				}
			}else {
				System.err.println("not found duplicate ");
			}
			
		}
		
		
		
		return false;
		
	}

	@Override
	public String toString() {
		return "OfficeDto [departmentName=" + departmentName + ", Staff=" + Staff + ", workingHours=" + workingHours
				+ ", governmentType=" + governmentType + ", location=" + location + "]";
	}
	public OfficeDto(String departmentName, int staff, int workingHours, String governmentType, String location) {
		super();
		this.departmentName = departmentName;
		Staff = staff;
		this.workingHours = workingHours;
		this.governmentType = governmentType;
		this.location = location;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public int getStaff() {
		return Staff;
	}

	public void setStaff(int staff) {
		Staff = staff;
	}

	public int getWorkingHours() {
		return workingHours;
	}

	public void setWorkingHours(int workingHours) {
		this.workingHours = workingHours;
	}

	public String getGovernmentType() {
		return governmentType;
	}

	public void setGovernmentType(String governmentType) {
		this.governmentType = governmentType;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}
	
	
	

}
