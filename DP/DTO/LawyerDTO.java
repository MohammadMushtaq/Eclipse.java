package com.xworkz.DP.DTO;

public class LawyerDTO {
	
	private String name;
	private String qualification;
	private int experience;
	private String gender; 
	private int age;
	private int caseWon;
	private int caseLost;
	public LawyerDTO() {
		super();
		System.out.println("invoke no argumenrt const");
	}
	public LawyerDTO(String name, String qualification, int experience, String gender, int age, int caseWon,
			int caseLost) {
		super();
		this.name = name;
		this.qualification = qualification;
		this.experience = experience;
		this.gender = gender;
		this.age = age;
		this.caseWon = caseWon;
		this.caseLost = caseLost;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public int getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getCaseWon() {
		return caseWon;
	}
	public void setCaseWon(int casewon) {
		this.caseWon = casewon;
	}
	public int getCaseLost() {
		return caseLost;
	}
	public void setCaseLost(int caseLost) {
		this.caseLost = caseLost;
	}
	
	
}
