package com.xworkz.implimentProgram.Scanner;

import com.xworkz.implimentProgram.ClothBrandDAO;

public class ClothBrandScammer {

	public static void main(String[] args) {
		
		ClothBrandDAO cloth= new ClothBrandDAO();
		cloth.save("zara");
		cloth.save("rymonds");
		cloth.save("levis");
		cloth.save("peterEngland");
		cloth.save("netplay");
		cloth.save("panAmerica");
		cloth.save("Wrong");
		
		boolean b=cloth.contain("LEVIS");
		System.out.println(b);
		
		boolean e= cloth.endsWith("ra");
		System.out.println(e);
		
		boolean f=cloth.findCaseSensitive("WRONG");
		System.out.println(f);
		
		boolean k=cloth.startWith("le");
		System.out.println(k);
		
		
	}

}
