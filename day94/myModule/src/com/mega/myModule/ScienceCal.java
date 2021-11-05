package com.mega.myModule;

public class ScienceCal {
	
	public int num1;
	public int num2;
	

	public ScienceCal() {
		super();
	}

	public ScienceCal(int num1, int num2) {
		super();
		this.num1 = num1;
		this.num2 = num2;
	}

	public int add(int num1, int num2) {
		return num1 + num2;
	}
	
	public int minus(int num1, int num2) {
		return num1 - num2;
	}

	@Override
	public String toString() {
		return "ScienceCal [num1=" + num1 + ", num2=" + num2 + "]";
	}
	

}
