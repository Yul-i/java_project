package com.mega.test;

public class Main {

	public static void main(String[] args) {
		High h1 = new High("홍길동", 1000, 5, "학교 자습실");
		System.out.println(h1);
		h1.nightSelfStudy();
		h1.study();
		h1.go("전시회");
	}

}
