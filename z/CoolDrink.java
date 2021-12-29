package com.xworkz.crud;

import com.xworkz.crud.crudoperator.CoolDrinkOperator;

public class CoolDrink {

	public static void main(String[] args) {
		CoolDrinkOperator ref = new CoolDrinkOperator();
		ref.addDrinks("fiz");
		ref.addDrinks("maza");
		ref.addDrinks("slice");
		ref.addDrinks("fanta");
		ref.addDrinks("coco");
		ref.addDrinks("pepsi");
		ref.addDrinks("dew");
		ref.addDrinks("nothing");
		ref.deleteName(3);
		ref.addDrinks("coco");


		String [] array=ref.getName();
		for (int i=0;i<array.length;i++)
		{
			String sname=array[i];
			System.out.println(sname);
		}
		ref.deleteName(2);
		ref.update(6, "mountain");
	}  
	
}




