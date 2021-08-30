package com.mega.mvc08.box;

public class 볼펜 extends 학용품 {

	double Thickness;
	
	public void write() {
		System.out.println("볼펜으로 글을 쓰다.");
	}

	@Override
	public String toString() {
		return "볼펜 [Thickness=" + Thickness + ", cost=" + cost + ", company=" + company + ", toString()="
				+ super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
	
	
}
