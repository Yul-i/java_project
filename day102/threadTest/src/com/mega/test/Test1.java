package com.mega.test;

public class Test1 extends Thread {
	@Override
	public void run() {
		super.run();
		for (int i = 1; i <= 100; i++) {
			System.out.println("하나의 스레드>>"+i);
		}
	}
}
