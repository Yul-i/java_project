package com.mega.mvc06;

import java.io.FileWriter;
import java.io.IOException;

public class Problem06Main {

	public static void main(String[] args) {
		Problem06 error = new Problem06();
		try {
			error.call();
		} catch (Exception e) {
			System.out.println("호출한 곳에서 알아서 처리함...!");
		}//try/catch 뺐더니 걍 중단 된 모습이다.
		System.out.println("에러 발생후 실행될까요....!!!!s");
		System.out.println("에러 발생후 실행될까요....!!!!s");
		System.out.println("에러 발생후 실행될까요....!!!!s");
		System.out.println("에러 발생후 실행될까요....!!!!s");
		System.out.println("에러 발생후 실행될까요....!!!!s");
		System.out.println("에러 발생후 실행될까요....!!!!s");
		System.out.println("에러 발생후 실행될까요....!!!!s");
		System.out.println("에러 발생후 실행될까요....!!!!s");
		System.out.println("에러 발생후 실행될까요....!!!!s");
		System.out.println("에러 발생후 실행될까요....!!!!s");
	}

}
