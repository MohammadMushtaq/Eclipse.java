package com.xworkz.crud.crudoperator;

public class CoffeeOperator {

	private String[] coffeeName=new String[3];
	private int calculate;
	
	public void coffeeDrink(String name)
	{
		System.out.println("inv cofe ".concat(name));
		if (this.calculate<this.coffeeName.length) {
			this.coffeeName[calculate]=name;
			this.calculate++;
		}
		else {
			System.err.println("array full");
			
			}	
		}
	public void erase(int a) {
		if (a<this.coffeeName.length && a>=0) {
			System.out.println("deleted"+this.coffeeName[a]);
		} else {
			System.out.println("cannot add more");
		}
	}
	public String[] getName()
	{
		return coffeeName;
	}
	
	
	}

