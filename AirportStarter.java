package com.xworkz.crud;

import com.xworkz.crud.crudoperator.AirportOperator;

public class AirportStarter {

	public static void main(String[] args) {
		AirportOperator airport= new AirportOperator();
		airport.airportname("chatrapati 1");
		airport.airportname("chatrapati 2");
		airport.airportname("chatrapati 3");
		airport.airportname("chatrapati 4");
		airport.airportname("chatrapati 5");
		airport.airportname("chatrapati ");
		airport.airportname("chatr ");
		airport.delete(0);
		airport.airportname("new Airpot");
		airport.delete(1);
		airport.delete(2);
		airport.delete(3);
		airport.delete(4);
		airport.delete(5);
		airport.delete(-1);
		


		

	}

}
