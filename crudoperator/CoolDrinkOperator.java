package com.xworkz.crud.crudoperator;

public class CoolDrinkOperator {

	private int counter;
	private String brandName[] = new String[7];

	public void addDrinks(String name) {
		if (this.counter < this.brandName.length)//to avoid ececption
		{
			System.out.println("invoked brandname " .concat(name));

			this.brandName[this.counter++] = name;
		} 
		else 
		{
			System.err.println("cannot load,array is fulled");
		}
	}

	public String[] getName() 
	{
		return brandName;
	}

	public void deleteName(int timer) {
		
		if (timer < this.brandName.length && timer >= 0)
		{
			System.out.println("item deleted "+this.brandName[timer]);

			this.brandName[timer] = null;
			
		} else 
		{
			System.err.println("cannot add the timer");
		}

	}

	public void update(int chakli, String name) {

		if (name != null) {
	
		if (chakli < this.brandName.length && chakli >= 0) 
		{
			this.brandName[chakli] = name;
		} else 
			
		{
			System.err.println("cannot update the chikki");
		}
		}

	}
}
