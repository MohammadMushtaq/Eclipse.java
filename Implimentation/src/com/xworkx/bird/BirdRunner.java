package com.xworkx.bird;

public class BirdRunner {

	public static void main(String[] args) {
		
				
				BirdDTO ref1= new BirdDTO("AadharCard", "tisen", 1, "mysore", true);
				BirdInterface ref2= new BirdImplimentation();
				BirdAssociation ref3 =new BirdAssociation(ref2);
				ref3.saveBird(ref1);
				ref3.getBirdage(ref1);
				ref3.displayDetails();

			}


	}

