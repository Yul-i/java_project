package com.mega.mvc06;

public class ArrayError2Main {

	public static void main(String[] args) {
		ArrayError2 array2 = new ArrayError2();
		try {
			array2.array();
		} catch (Exception e) {
			System.out.println("호출된 곳에서 예외 처리");
		}
	}
}
