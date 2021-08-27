package com.mega.mvc07.test;

public class SingleObject {
	static int count;
	
	public SingleObject() {
		System.out.println("SingleObject객체 생성됨");
		count++;
	}
}
