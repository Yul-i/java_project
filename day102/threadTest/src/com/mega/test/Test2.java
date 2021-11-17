package com.mega.test;

public class Test2 extends Thread {
	@Override
	public void run() {
		super.run();
		for (int i = 100; i >= 0; i--) {
			System.out.println("또 하나의 스레드>>"+i);
		}
	}
}
