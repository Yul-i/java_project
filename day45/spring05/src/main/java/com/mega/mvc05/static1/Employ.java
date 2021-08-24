package com.mega.mvc05.static1;

public class Employ {

	public static void main(String[] args) {
		Employee 직원1 = new Employee("홍길동", "남", 25);
		Employee 직원2 = new Employee("김길동", "여", 26);
		Employee 직원3 = new Employee("송길동", "남", 27);
		
		System.out.println("모든 직원의 정보");
		System.out.println(직원1);
		System.out.println(직원2);
		System.out.println(직원3);
		System.out.println("직원의 수 : "+Employee.count+"명");
		System.out.println("나이 평균 : "+Employee.avg+"세");
	}

}
