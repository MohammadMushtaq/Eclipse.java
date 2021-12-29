package com.xworkz.crud;

import com.xworkz.crud.crudoperator.BeachOperator;

public class BeachStarter {

	public static void main(String[] args) {
		BeachOperator beachOperator=new BeachOperator();
		String cname=beachOperator.getCountry();
		System.out.println(cname);
		
		beachOperator.beachName("kalangud beach");
		beachOperator.displayBeachNames();
		
		beachOperator.beachName("baga beach");
		beachOperator.displayBeachNames();
		beachOperator.beachName("rk beach");
		beachOperator.beachName("minamarbeach");
		beachOperator.beachName("karwarbeach");
		beachOperator.beachName("niik beach");
		
		

	}

}
