package com.mega.mvc07.test;

public class One2Main {

	public static void main(String[] args) {
		One2 o1 = One2.getInstance();
		One2 o2 = One2.getInstance();
		
		System.out.println("o1의 주소: "+o1);
		System.out.println("o2의 주소: "+o2);
	}

}
