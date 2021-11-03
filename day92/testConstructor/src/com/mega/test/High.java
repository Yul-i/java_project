package com.mega.test;

public class High extends Student {
	
	//묵시적으로 인스턴스 변수 2개
	//일반 메서드 2개 가지고 있음
	int hour;
	String location;
	
	public High(String name, int age, int hour, String location) {
		super(name, age);
		//파라메터 있는 부모의 생성자 호출은 생략 불가
		//파라메터 있는 부모의 생성자 호출은 명시적으로 해야한다.
		this.hour = hour;
		this.location = location;
	}

	public void nightSelfStudy() {
		System.out.println("야간 자율 학습을 하다");
	}
	
	public void go(String location2) {
		System.out.println(location2 + "에 가다.");
	}
	
	@Override
	public void study() {
		System.out.println("입시 공부하다...");
	}
	
	@Override
	public String toString() {
		return "High [hour=" + hour + ", location=" + location + ", name=" + name + ", age=" + age + "]";
	}
	
	
}
