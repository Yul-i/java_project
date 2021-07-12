package 메서드반환값;

import java.util.Date;

public class 다양한리턴 {
	public int add1() { //double, float, long
		return 100;
	}
	
	public double add2() {//float, double
		return 11.11;
	}

	public char add3() {
		return 'a';
	}
	
	public boolean add4() {
		boolean result = true;
		return result;
	}
	
	public String add5() {
		return "OK";
	}
	
	public Date add6() {//값이냐 주소냐 - 참조형(주소) 가 반환된다.
		Date date = new Date();
		return date;
	}
	
	public int[] add7() {//int배열 주소
		int[] num = {1,2,3};
		return num;
	}
	
	public 계산기 add8() {//타입인 클래스
		계산기 cal = new 계산기();
		return cal;
	}
	
}
