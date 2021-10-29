package com.xworkz.DP.DAO;

import com.xworkz.DP.DTO.LawyerDTO;

public class LawyerDAO {
	private LawyerDTO[] lawyerDtos = new LawyerDTO[10];
	private String[] maxExperience = new String[10];
	private int index;
	private int maximum;
	private int counterExperience;


	public void save(LawyerDTO dto) {
		if(this.index<this.lawyerDtos.length && dto!=null)
		{
			this.lawyerDtos[index]=dto;
			index++;
			System.out.println("invoked :- ".concat(String.valueOf(index)));
			}
		else{
				System.out.println("invalid index");
			}
		}

	public void delete(int indx) {
	
		if (indx<this.lawyerDtos.length && indx>=0)
		{
			if (this.lawyerDtos[index] != null) {
				this.lawyerDtos[index] = null;
				System.out.println("deleted at index ".concat(String.valueOf(indx)));
				this.index--;
			} else {
				System.out.println("Already pointing to null at index ".concat(String.valueOf(index)));
			}
		}
	}

	public void display() {
		for (int i = 0; i < this.lawyerDtos.length; i++) {
			LawyerDTO ref = this.lawyerDtos[i];
			if (ref != null) {
				System.out.println("*********************************");
				System.out.println("index is ".concat(String.valueOf(i)));
				System.out.println("lawyer name "+ref.getName());
				System.out.println("lawyer qualifivation "+ref.getQualification());
				System.out.println("experience "+ref.getExperience());
				System.out.println("gender "+ref.getGender());
				System.out.println("age "+ref.getAge());
				System.out.println(" cases won" +ref.getCaseWon());
				System.out.println("cases lost " +ref.getCaseLost());
				System.out.println("*********************************");
			} else {
				System.out.println("refer to null at index".concat(String.valueOf(i)));
			}
		}
	}

	public boolean searchByName(String found) {
		if (found!=null) {
			for (int i = 0; i < lawyerDtos.length; i++) {
				if(this.lawyerDtos[i]!=null) {
					if (this.lawyerDtos[i].getName().equalsIgnoreCase(found)) {
						return true;
					}else {
						System.out.println("searching name is null");
					}
				}
			}
		}
		return false;
			
		}
	
	public int noOfindexOccupied() {
		return this.index;
	}
	
	public boolean searchByCaseWon(int casesWon) {
		if (casesWon >= 0) {
			for (int i = 0; i < this.lawyerDtos.length; i++) {
				if (this.lawyerDtos[i] != null) {

					if (String.valueOf(this.lawyerDtos[i].getCaseWon()).equals(String.valueOf(casesWon))) {
						return true;
					}
				}
			}
		} else {
			System.out.println("passed number is invalid.cannot search");
		}
		return false;
	}
	public String getQualificationByName(String name) {
		for (int index = 0; index < this.lawyerDtos.length; index++)

		{
			LawyerDTO ref = this.lawyerDtos[index];
			if (ref != null) {
				String tempName = ref.getName();
				if (tempName.equalsIgnoreCase(name)) {
					return ref.getQualification();
				}
			}
		}

		return "No match";
	}
	public void capture(LawyerDTO refernce, int index) {
		if (index < this.lawyerDtos.length && index >= 0 && refernce != null) {
			this.lawyerDtos[index] = refernce;
			System.out.println("updated at index ".concat(String.valueOf(index)));
			this.index++;
		} else {
			System.out.println("Either index is invalid or reference is null at index ".concat(String.valueOf(index)));
		}
	}
	
	public String[] getMaxExperience()

	{
		if (this.lawyerDtos[0] != null) {
			maximum = this.lawyerDtos[0].getExperience();

			for (int biriyani = 1; biriyani < this.lawyerDtos.length; biriyani++) {
				LawyerDTO ref = this.lawyerDtos[biriyani];
				if (ref != null) {
					int exp = ref.getExperience();
					if (exp >= maximum) {

						maximum = exp;

					}
				}

			}

		}
		System.out.print("maximum experience is " + maximum + " and ");
		for (int i = 0; i < this.lawyerDtos.length; i++) {
			LawyerDTO ref = this.lawyerDtos[i];
			if (ref != null) {
				if (String.valueOf(ref.getExperience()).equals(String.valueOf(maximum))) {
					this.maxExperience[counterExperience++] = ref.getName();
				}

			}
		}

		return maxExperience;
	}
	public Integer getExperienceByName(String name) {
		if (name != null) {
			for (int i = 0; i < this.lawyerDtos.length; i++) {
				if (this.lawyerDtos[i] != null) {
					if (this.lawyerDtos[i].getName().equalsIgnoreCase(name)) {
						return this.lawyerDtos[i].getExperience();
					}
				}
			}
		}

		return null;
	}
	
}
