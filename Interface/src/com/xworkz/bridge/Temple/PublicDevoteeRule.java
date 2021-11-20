package com.xworkz.bridge.Temple;

public class PublicDevoteeRule implements DevoteeRule {

	@Override
	public boolean slipperOff() {
		System.out.println("invoked slipperoff");
		return false;
	}

	@Override
	public boolean Maintainsilence() {
		System.out.println("invoked maintainslipper");
		return true;
	}

	@Override
	public boolean MaintainClean() {
		System.out.println("invoked maintainclean");
		return true;
	}

}
