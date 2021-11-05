package com.mega.yourModule;

import com.mega.myModule.BasicCal;

public class OutModuleClass {
	public static void main(String[] args) {
		BasicCal cal5 = new BasicCal("회색");
		System.out.println(cal5);
		int sum = cal5.add(500, 500);
		System.out.println(sum);
	}
}
