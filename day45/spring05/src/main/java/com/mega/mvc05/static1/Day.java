package com.mega.mvc05.static1;

public class Day {
	
	//멤버변수, 전역변수, 자동초기화
	String doing;//null
	int time;//0
	String location;//null
	static int count;//0
	static int sum;
	
	public Day(String doing, int time, String location) {
		super();
		this.doing = doing;
		this.time = time;
		this.location = location;
		count++;
		sum = sum+time;
	}
	
	//static 메서드는 객체생성하지 않아도 아무때나 클래스이름으로
	//접근해서 그 기능을 처리하게 할 수 있다
	//자주쓰는 기능은 static 메서드로 만들어놓으면 아무때나 쓸 수 있어서 편하다.
//	public static int getAvg() {
		//static메서드 안에는 static 변수만 사용 가능. instance 변수는 사용 불가능
		//instance 변수는 객체 생성 후 접근 가능하기 때문
		//static 메서드는 객체 생성하지 않아도 접근해서 처리 해야함.
//		return doing;
//	}
		
	public static int gatAvg() {
		return sum/count;
	}

	@Override
	public String toString() {
		return "Day [doing=" + doing + ", time=" + time + ", location=" + location + "]";
	}
	
	
}
