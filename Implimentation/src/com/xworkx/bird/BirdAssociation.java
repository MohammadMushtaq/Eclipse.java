package com.xworkx.bird;

public class BirdAssociation {
	BirdInterface dao;

	public BirdAssociation(BirdInterface dao) {
		super();
		this.dao = dao;
	}

	public void saveBird(BirdDTO dto) {

		if (dto != null && dao.saveBirdData(dto)) {

			System.out.println("invoked save method");
		} else {
			System.out.println("dto is pointing to null");
		}
	}

	public void getBirdage(BirdDTO dto) {

		if (dto != null) {
			System.out.println(dto.getAge());
		}

	}

	public void displayDetails() {
		if (dao != null) {

			dao.displayBirdDetails();

		}

	}


}
