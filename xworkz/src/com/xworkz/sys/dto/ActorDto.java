package com.xworkz.sys.dto;

public class ActorDto {
	private String name;
	private int age;
	private int Nofilms;
	private boolean alive;
	private String location;
	public ActorDto(String name, int age, int nofilms, boolean alive, String location) {
		super();
		this.name = name;
		this.age = age;
		Nofilms = nofilms;
		this.alive = alive;
		this.location = location;
	}
	@Override
	public String toString() {
		return "ActorDto [name=" + name + ", age=" + age + ", Nofilms=" + Nofilms + ", alive=" + alive + ", location="
				+ location + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getNofilms() {
		return Nofilms;
	}
	public void setNofilms(int nofilms) {
		Nofilms = nofilms;
	}
	public boolean isAlive() {
		return alive;
	}
	public void setAlive(boolean alive) {
		this.alive = alive;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	

}
