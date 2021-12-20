package com.xworkz.implimentProgram.Scanner;

import com.xworkz.implimentProgram.PincodeDAO;

public class PincodeScanner {

	public static void main(String[] args) {
		
		PincodeDAO pincodeDAO = new PincodeDAO();
		
		pincodeDAO.save(583101);
		pincodeDAO.save(483102);
		pincodeDAO.save(688310);
		pincodeDAO.save(493102);
		pincodeDAO.save(283105);
		pincodeDAO.save(583101);
		pincodeDAO.save(583101);
		
		boolean p= pincodeDAO.endWith(01);
		System.out.println(p);
		
		boolean q= pincodeDAO.startwith(01);
		System.out.println(q);
		
		boolean r= pincodeDAO.contain(01);
		System.out.println(r);
		
	}

}
