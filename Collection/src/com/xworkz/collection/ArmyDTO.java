package com.xworkz.collection;

public class ArmyDTO {

	String name, symbol;
	boolean rules;
	int soliders;

	public ArmyDTO() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return 2;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj!=null) {
			if(obj instanceof ArmyDTO) {
				ArmyDTO ar= (ArmyDTO)obj;
				if(this.name.equals(ar.name)&& this.symbol.equals(ar.symbol)) {
					return true;
					
				}
			}
		}
		
		return false;
	}

	@Override
	public String toString() {
		return "ArmyDTO [name=" + name + ", symbol=" + symbol + ", rules=" + rules + ", soliders=" + soliders + "]";
	}

	public ArmyDTO(String name, String symbol, boolean rule, int soliders) {
		super();
		this.name = name;
		this.symbol = symbol;
		this.rules = rule;
		this.soliders = soliders;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSymbol() {
		return symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	public boolean getRule() {
		return rules;
	}

	public void setRule(boolean rule) {
		this.rules = rule;
	}

	public int getSoliders() {
		return soliders;
	}

	public void setSoliders(int soliders) {
		this.soliders = soliders;
	}

}
