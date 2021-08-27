package com.mega.mvc07.test;

public class SingUser21 {

	public static void main(String[] args) {
		SingleObject2 single2 = SingleObject2.getInstance();
		System.out.println("주소1 : " + single2);
		System.out.println(SingleObject2.count+"개");
		System.out.println(SingleObject2.count*8+4);
	}

}
