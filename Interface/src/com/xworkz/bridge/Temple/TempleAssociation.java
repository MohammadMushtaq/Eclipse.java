package com.xworkz.bridge.Temple;

public class TempleAssociation {

	private DevoteeRule devoteeRule;
	private String Name;

	public TempleAssociation() {
		System.out.println("invoked templeassocation");
	}

	public TempleAssociation(DevoteeRule devoteeRule, String name) {
		super();
		this.devoteeRule = devoteeRule;
		Name = name;
	}

	public void allowDevotee() {
		System.out.println("invoked allowdevtee method");
		if(this.devoteeRule!=null) {
			boolean slip= this.devoteeRule.slipperOff();
			if(slip) {
				boolean ref=this.devoteeRule.Maintainsilence();
				boolean ref1=this.devoteeRule.MaintainClean();
			if( ref && ref1)	{
				System.out.println("good devotte");
			}else {
				System.err.println("bad devotee");
			}
		
		}else {
			System.err.println("leave slipper bro");
		}
		
	}else {
		System.err.println("passing wrong");
	}

}
}