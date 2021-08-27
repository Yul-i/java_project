package com.mega.mvc07.test;

public class SingUser {

	public static void main(String[] args) {
		for (int i = 0; i < 1000; i++) {
			SingleObject single1 = new SingleObject();
			
		}
		System.out.println(SingleObject.count+"개");
		System.out.println(SingleObject.count*8+4);
	}

}
