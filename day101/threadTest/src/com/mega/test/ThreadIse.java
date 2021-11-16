package com.mega.test;

public class ThreadIse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread my = new MyThread("my1");
		my.start();
		MyThread my2 = new MyThread("my2");
		my2.start();
		
		for (int i = 0; i < 100; i++) {
			System.out.println("main>>" + i );
		}
	}

}
