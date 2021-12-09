package com.xworkz.collection;

public class HospitalDto {

	String name;
	String location;
	Integer Staff;
	String type;

	public HospitalDto() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "HospitalDto [name=" + name + ", location=" + location + ", Staff=" + Staff + ", type=" + type + "]";
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return 10;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj != null) {
			if (obj instanceof HospitalDto) {
				HospitalDto hospital = (HospitalDto) obj;
				if (this.name.equals(hospital.name) && this.Staff.equals(hospital.Staff)) {

					System.out.println("are same" + hospital);
					return true;
				}
			}
		}
		return false;
	}

	public HospitalDto(String name, String location, int staff, String type) {
		super();
		this.name = name;
		this.location = location;
		Staff = staff;
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getStaff() {
		return Staff;
	}

	public void setStaff(int staff) {
		Staff = staff;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
