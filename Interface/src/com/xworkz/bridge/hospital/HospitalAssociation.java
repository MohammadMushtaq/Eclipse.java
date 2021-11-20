package com.xworkz.bridge.hospital;

public class HospitalAssociation implements HospitalAdmitRule, HospitalDischargeRule {

	@Override
	public boolean payBill() {
		System.out.println("invokes paybill");
		return true;
	}

	@Override
	public boolean discount() {
		System.out.println("invokes discount");
		return true;
	}

	@Override
	public String register() {
		System.out.println("invokes register");
		return "null";
	}

	@Override
	public double payAdvance() {
		System.out.println("invokes payadvance");
		return 100d;
	}

	@Override
	public boolean insurance() {
		System.out.println("invokes insurance");
		return false;
	}

}
