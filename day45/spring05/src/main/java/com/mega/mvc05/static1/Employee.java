package com.mega.mvc05.static1;

public class Employee {
	String name;
	String gender;
	int age;
	static int count;
	static int sum;
	static int avg;
	
	public Employee(String name, String gender, int age) {
		super();
		this.name = name;
		this.gender = gender;
		this.age = age;
		count++;
		sum = sum+age;
		avg = sum/count;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", gender=" + gender + ", age=" + age + "]";
	}

}
