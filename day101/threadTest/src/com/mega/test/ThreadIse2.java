package com.mega.test;

public class ThreadIse2 {

	public static void main(String[] args) {
		Thread you1 = new Thread(new YourThread("you1"));
		Thread you2 = new Thread(new YourThread("you2"));
		
		you1.start();
		you2.start();
		
		for (int i = 0; i < 100; i++) {
			System.out.println("main>>" + i );
		}
	}

}
