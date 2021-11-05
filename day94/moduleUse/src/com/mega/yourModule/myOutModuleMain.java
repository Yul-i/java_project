package com.mega.yourModule;

import com.mega.test01.Mycal;

public class myOutModuleMain {
	public static void main(String[] args) {
		
		Mycal cal6 = new Mycal("분홍색", 35000);
		System.out.println(cal6);
		
		int mul = cal6.mul(100, 3);
		int div = cal6.div(100, 5);
		System.out.println(mul);
		System.out.println(div);
	}
}
