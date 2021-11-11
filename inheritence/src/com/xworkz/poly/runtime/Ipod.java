package com.xworkz.poly.runtime;

public class Ipod {
	
	private String modelNo;
	private int memorySize;
	
	public Ipod() {
		System.out.println("invoked ipod no arg const");
	}
	@Override
	public String toString() {
		System.out.println("invoked tostring method");
		return super.toString();
		}
	@Override
	public int hashCode() {
		System.out.println("invoked hashcode method");
		return 4555;	
	}
	
	@Override
	public boolean equals(Object obj) {
		System.out.println("invoked equal method");
		if(obj==null) {
			System.out.println("you have passed a null value");
			return false;
		}
		if(obj instanceof Ipod) {
			Ipod ref= (Ipod)obj;
			System.out.println("ipod casted");
			String store = ref.modelNo;
			if(this.modelNo.equals(store)) {
				System.out.println("model num has matched");
				return true;
			}else {
				System.out.println("not matched");
			}
		}
		 
		
		return false;	
	}
	
	
	public String getModelNo() {
		return modelNo;
	}
	public void setModelNo(String modelNo) {
		this.modelNo = modelNo;
	}
	public int getMemorySize() {
		return memorySize;
	}
	public void setMemorySize(int memorySize) {
		this.memorySize = memorySize;
	}	
}
