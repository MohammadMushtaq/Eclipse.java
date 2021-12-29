package com.xworkz.maps.mapdto;

public class AddressDTO {

	private int id;
	private int doorNo;  
	private String Street;
	private String city;
	private long pincode;
	
	public AddressDTO() {
		// TODO Auto-generated constructor stub
	}

	public AddressDTO(int id, int doorNo, String street, String city, long pincode) {
		super();
		this.id = id;
		this.doorNo = doorNo;
		Street = street;
		this.city = city;
		this.pincode = pincode;
	}
	
	@Override
	public String toString() {
		return "AddressDTO [id=" + id + ", doorNo=" + doorNo + ", Street=" + Street + ", city=" + city + ", pincode="
				+ pincode + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getDoorNo() {
		return doorNo;
	}

	public void setDoorNo(int doorNo) {
		this.doorNo = doorNo;
	}

	public String getStreet() {
		return Street;
	}

	public void setStreet(String street) {
		Street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public long getPincode() {
		return pincode;
	}

	public void setPincode(long pincode) {
		this.pincode = pincode;
	}

}
