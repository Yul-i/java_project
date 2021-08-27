package com.mega.mvc07.test;

public class Boy2 {
	static int count;
	static Boy2 object;
	
	private Boy2() {
		System.out.println("Boy2 객체가 생성됨");
		count++;
	}
	
	public static Boy2 getInstance() {
		if (object==null) {
			object = new Boy2();
		}
		return object;
	}
}
