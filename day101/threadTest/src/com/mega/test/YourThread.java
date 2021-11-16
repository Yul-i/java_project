package com.mega.test;

public class YourThread implements Runnable {
	String who;

	public YourThread(String who) {
		super();
		this.who = who;
	}
	
	@Override
	public void run() {
		for (int i = 100; i > 0; i--) {
			System.out.println(who+ ">>" + i );
		}
	}

}
