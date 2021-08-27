package com.mega.mvc07.test;

public class One2 {
	static int count;
	static One2 object;
	
	private One2() {
		count++;
		System.out.println("one1 객체 생성함");
	}
	
	public static One2 getInstance() {
		if (object==null) {
			object = new One2();
		}
		return object;
	}
}
