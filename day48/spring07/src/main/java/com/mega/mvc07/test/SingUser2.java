package com.mega.mvc07.test;

public class SingUser2 {

	public static void main(String[] args) {
		for (int i = 0; i < 1000; i++) {
			//SingleObject2 single2 = new SingleObject2();
			SingleObject2 single2 = SingleObject2.getInstance();
			
		}
		System.out.println(SingleObject2.count+"개");
		System.out.println(SingleObject2.count*8+4);
	}

}
