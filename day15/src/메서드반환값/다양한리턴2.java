package 메서드반환값;

import java.util.Random;

public class 다양한리턴2 {
	public int get(int a) {
		return a*2;
	}
	
	public double get() {
		return 11.11;
	}
	
	public int[] get2() {
		//int[] 배열을 만든 후,
		//배열의 주소를 리턴
		int[] num = {10,20,30,40,50};
		return num;
	}
	
	public Random get3() {
		//초기화 시켜주지 않으면 쓰레기 값;
		//r 변수에 그냥 null 넣은거(부품이 안만들어진거)
//		Random r = null
		//부품 생성하고 null 기본값으로 넣은거
		Random r = new Random();
		return r;
	}
}
