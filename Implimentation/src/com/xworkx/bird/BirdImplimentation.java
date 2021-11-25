package com.xworkx.bird;

public class BirdImplimentation implements BirdInterface{
	
	BirdDTO[] dto = new BirdDTO[5];
	int counter = 0;

	@Override
	public boolean saveBirdData(BirdDTO birddto) {
		System.out.println("invoked saveBirdMethod");
		if (birddto != null) {
			dto[counter++] = birddto;
			return true;

		} else {
			System.out.println("bird dto is null");
		}

		return false;
	}

	@Override
	public BirdDTO findAge(int age) {
		System.out.println("invoked find age method");
		if (dto != null) {

			for (int i = 0; i < dto.length; i++) {
				BirdDTO ref = dto[i];
				if (ref != null) {

					int age1 = ref.getAge();
					// String.valueOf(age1);
					if (age == age1) {
						System.out.println("bird age found");
					} else {
						System.out.println("bird age not found");
					}

				} else {
					System.out.println("ref of dto is pointing to null");
				}
			}
		} else {
			System.out.println("dto is pointing to null");
		}
		return null;
	}

	@Override
	public void displayBirdDetails() {
		if (dto != null) {

			for (int i = 0; i < dto.length; i++) {

				BirdDTO birdDto = dto[i];
				if (birdDto != null) {
					System.out.println(birdDto.getAge());
					System.out.println(birdDto.getBreed());
					System.out.println(birdDto.getId());
					System.out.println(birdDto.getOrigin());
					System.out.println(birdDto.isCanfly());

				}
			}
		}

	}

}
