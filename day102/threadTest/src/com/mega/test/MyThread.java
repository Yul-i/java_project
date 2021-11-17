package com.mega.test;

import java.util.Iterator;

public class MyThread extends Thread {
	String who;
		
	public MyThread(String who) {
		super();
		this.who = who;
	}

	@Override
	public void run() {
		//super.run();//thread가 여러개면 run을 실행하며 동시에 달린다~
		
		for (int i = 0; i < 100; i++) {
			System.out.println(who+">> " + i);
		}
	}
}
