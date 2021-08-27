package com.mega.mvc07.test;

public class MyGirlsMain {

	public static void main(String[] args) {
		Girl girl1 = new Girl("길순", 13);
		Girl girl2 = new Girl("길숙", 10);
		
		System.out.println("총 인원 : "+Girl.count+"명");
		System.out.println("합계나이 : "+Girl.ageSum+"세");
		System.out.println("소녀 나이 평균 : "+(Girl.ageSum/Girl.count)+"세");
	}

}
