package com.mega.mvc08.casting;

import java.util.ArrayList;

public class CastingTest {

	public static void main(String[] args) {
		System.out.println("나에 대한 데이터를 모아보세요.");
		ArrayList list = new ArrayList();
		
		list.add(1000);
		list.add(189.1);
		list.add(false);
		list.add('남');
		
		System.out.println("---------------------------------");
		//1. 전체목록을 프린트
		System.out.println(list);
		
		//2. 돈 1000을 꺼내서 2000을 더해 프린트
		int money = (int) list.get(0);
		System.out.println(money+2000);
		
		//3. 키 189.1를 꺼내서 10을 더해 프린트
		double height = (double) list.get(1);
		System.out.println(height+10);
		
		//4. 아침여부 false를 꺼내서 아침을 먹었으면 배불러요. 아니면 배고파요
		boolean food = (boolean) list.get(2);
		if (food) {
			System.out.println("배물러요");
		}else {
			System.out.println("배고파요.");
		}
		
		//5. 성별 남 꺼내서 남이면 주민번호는 1,3이예요 출력.
		char gender = (char) list.get(3);
		if (gender=='남') {
			System.out.println("주민번호는 1,3이예요.");
		}else if(gender=='여') {
			System.out.println("주민번호는 2,4예요");
		}
		
		//6. 2~3에서 형변환(업캐스팅, 다운캐스팅), 오토박싱, 오토언박싱 과정을 순서대로 작성해주세요.
		//	2. Object--다운캐스팅-->Integer--오토언박싱-->int
		//	3. Object--다운캐스팅-->Double--오토언박싱-->double 
	}	

}
