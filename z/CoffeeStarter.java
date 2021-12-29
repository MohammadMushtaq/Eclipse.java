package com.xworkz.crud;

import com.xworkz.crud.crudoperator.CoffeeOperator;

public class CoffeeStarter {

	public static void main(String[] args) {
		CoffeeOperator coffee=new CoffeeOperator();
		coffee.coffeeDrink("nescafe");
		coffee.coffeeDrink("bru");
		coffee.coffeeDrink("tata");
		coffee.coffeeDrink("capacino");
		coffee.coffeeDrink("123");
		
		coffee.erase(-1);
		
		
		
		

	}

}
