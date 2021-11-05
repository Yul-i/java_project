package com.mega.myModule;

public class BasicCal {
	//멤버변수
	public String color;
	
	//기본 생성자(default constructor)
	//다른 생성자가 하나도 없으면 묵시적으로 만들어진다.
	//다른 생성자가 있으면 기본 생성자는 자동으로
	//만들어지지 않아서 명적으로 만들어줘야 한다.
	
	public BasicCal() {
		super();//부모의 생성자를 무조건 자동호출하게 되어있음
		//super()를 생략 가능하다
		//object();
	}
	
	public BasicCal(String color) {
		super();//부모의 기본 생성자를 호출!!, 반드시 첫줄에 써야한다.
		this.color = color;
	}
	
	//멤버 메서드
	public int add(int num1, int num2) {
		return num1 + num2;
	}
	
	public int minus(int num1, int num2) {
		return num1 - num2;
	}


	@Override
	public String toString() {
		return "BasicCal [color=" + color + "]";
	}
	
	
}
