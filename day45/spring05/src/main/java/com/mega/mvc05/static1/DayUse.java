package com.mega.mvc05.static1;


public class DayUse {

	public static void main(String[] args) {
		Day day1 = new Day("자바공부", 10, "강남");
		System.out.println(Day.count); //static 변수는 클래스 이름으로 써준다.
		Day day2 = new Day("여행", 15, "강원도");
		Day day3 = new Day("운동", 11, "피트니스");
		System.out.println(day1);
		System.out.println(day2);
		System.out.println(day3);
		System.out.println("전체 하는 일의 시간은 : "+Day.sum+"시간");
		System.out.println("평균 하는 일의 시간은 : "+Day.sum/Day.count+"시간");
		System.out.println("몇일 동안 했나요 : "+Day.count+"일");
		System.out.println(Day.gatAvg());
	}

}
