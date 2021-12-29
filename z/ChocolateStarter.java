package com.xworkz.crud;

import com.xworkz.crud.crudoperator.Chocolate;

public class ChocolateStarter {

	public static void main(String[] args) {
		Chocolate ref = new Chocolate();

		ref.getChocolate();
		ref.addflovor("pista");
		ref.addflovor("badam");
		ref.addflovor("venilla");
		ref.displayFlovors();

	}

}
