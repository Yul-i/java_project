package com.mega.mvc07.test;

public class SingUser22 {

	public static void main(String[] args) {
		SingleObject2 single2 = SingleObject2.getInstance();
		System.out.println("주소2 : " + single2);
		System.out.println(SingleObject2.count+"개");
		System.out.println(SingleObject2.count*8+4);
	}

}
