package com.mega.test;

public class Student {
	String name;
	int age;
	
	public Student(String name, int age) {
		//super(); 자바에서는 생략 가능하다.
		this.name = name;
		this.age = age;
	}
	
	public void study() {
		System.out.println("공부하다");
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}
}
