package com.xworkz.bridge.hospital;

public class Hospital {

	private String stateName;
	private String location;
	private boolean gove;
	private HospitalAdmitRule hospitalAdmitRule;
	private HospitalDischargeRule hospitalDischargeRule;

	public Hospital() {
		System.out.println("invoked Hospital");
	}

	public Hospital(String stateName, String location, boolean gove, HospitalAdmitRule hospitalAdmitRule,
			HospitalDischargeRule hospitalDischargeRule) {
		super();
		this.stateName = stateName;
		this.location = location;
		this.gove = gove;
		this.hospitalAdmitRule = hospitalAdmitRule;
		this.hospitalDischargeRule = hospitalDischargeRule;
	}

	public void admitPatient() {
		System.out.println("invoked admitPatient method");

		if (this.hospitalAdmitRule != null) {

			String reg = this.hospitalAdmitRule.register();
			double payadvance = this.hospitalAdmitRule.payAdvance();
			boolean insurance = this.hospitalAdmitRule.insurance();

			if (reg != null) {
				System.out.println("patient name is registered " + this.hospitalAdmitRule.register());

				if (insurance) {
					System.out.println("eligibale for Insurance");
				} else {
					System.err.println("if dont have Insurance need to pay advance");

					if (payadvance == 10000d) {
						System.out.println("advance paid" + this.hospitalAdmitRule.payAdvance());
					} else {
						System.err.println("have to pay advance of min 1000");
					}
				}
			} else {
				System.out.println("name is not reg");
			}
		} else {
			System.err.println("follow rules");
		}
	}

	public void dischargePatient() {
		System.out.println("invoked dischargePatient ");
		if (this.hospitalDischargeRule != null) {
			
			boolean payBill = this.hospitalDischargeRule.payBill();
			boolean dis = this.hospitalDischargeRule.discount();
			if (payBill) {
				System.out.println("bill payed"+this.hospitalDischargeRule.payBill());
				System.out.println("discount aplecable"+this.hospitalDischargeRule.discount());

			} else {
				System.out.println("please pay due bill payment");
			}
		} else {
			System.out.println("give discount rules");
		}
	}

}

