package com.xworkz.maps.mapdto;

import java.io.Serializable;

public class PersonDTO implements Serializable{

	private int id;
	private String name;
	private float age;
	private String email;
	
	public PersonDTO() {
		// TODO Auto-generated constructor stub
	}

	public PersonDTO(int id, String name, float age, String email) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.email = email;
	}

	@Override
	public String toString() {
		return "PersonDTO [id=" + id + ", name=" + name + ", age=" + age + ", email=" + email + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getAge() {
		return age;
	}

	public void setAge(float age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	public int compareTo(PersonDTO o) {
		return this.name.compareTo(o.getName());	
	}
	public int compareTo1(PersonDTO b) {
		return b.name.compareTo(this.getEmail());	
	}
	
}
