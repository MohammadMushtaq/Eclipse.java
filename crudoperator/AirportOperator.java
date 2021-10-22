package com.xworkz.crud.crudoperator;

public class AirportOperator {

	private String[] airport = new String[5];
	private int index;

	public void airportname(String name) {
		System.out.println("invoked  airport".concat(name));
		if (this.index < airport.length) {
			this.airport[this.index] = name;
			this.index++;
		} else {
			System.out.println("index is full");
		}
	}

	public void delete(int remove)
		{
			//index--;
			//System.out.println("deleted"+this.airport[index]);
			
			if (remove<this.airport.length && remove>=0) {
				System.out.println("deleted"+this.airport[remove]);
			} else {
				System.out.println("cannot add more");
			}
		}				


	public String[] getName() {
		
		return airport;
	}
}


