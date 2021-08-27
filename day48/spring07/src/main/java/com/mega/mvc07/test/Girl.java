package com.mega.mvc07.test;

public class Girl {
	String name;
	int age;
	static int count;
	static int ageSum;
	
	public Girl(String name, int age) {
		this.name = name;
		this.age = age;
		count++;
		ageSum += age;
	}
}
