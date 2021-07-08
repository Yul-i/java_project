package 클래스사용;

import java.util.Scanner;

import 클래스생성.Car;

public class 자동차공장 {
	public static void main(String[] args) {
		Car car1 = new Car();
		car1.run();
		car1.up();
		car1.color = "빨강";
		car1.count = 4;
		
		System.out.println(car1.color);
		System.out.println(car1.count);
		
//		Scanner sc = new Scanner();
//		public class Scanner() {
//			public int nextInt() {
////				입력을 스팅을 받아라.
////				Int로 변환해서 반환하라.
//				int result = 100;
//				return result;
//				}
//			}
//		}

		
	}
	
