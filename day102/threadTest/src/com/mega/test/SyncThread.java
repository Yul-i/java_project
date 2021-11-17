package com.mega.test;

class One{
	int val;//0, 동시성 제어할 필요가 있다
	public synchronized void sum() {
		val++;
		System.out.println("더하기>> "+ val);
	}
}

class OneThread implements Runnable{
	
	One one;
	
	public OneThread(One one) {
		super();
		this.one = one;
	}

	@Override
	public void run() {
		one.sum();
	}
}

public class SyncThread {

	public static void main(String[] args) {
		//객체 하나 만들어서
		One one = new One();
		
		//객체 안에 있는 메서드를 스레드로 돌리려고 한다.
		//One.java
		//sum()
		
		for (int i = 0; i < 10; i++) {
			new Thread(new OneThread(one)).start();
		}
	}

}
