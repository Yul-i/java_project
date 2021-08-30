package com.mega.mvc08.box;

public class 학용품 extends Object {
	int cost;
	String company;

	
	public void buy() {
		System.out.println("학용품을 구매하다");
	}

	@Override
	public String toString() {
		return "학용품 [cost=" + cost + ", company=" + company + "]";
	}

}
