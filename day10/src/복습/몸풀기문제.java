package 복습;

import java.util.Scanner;

public class 몸풀기문제 {

	public static void main(String[] args) {
		// 정수 5개 크기의 배열을 만들어서
		// 10, 20, 30, 40, 50 을 순서대로 넣는다.
		// 첫번째값과 세번째값을 더해서 프린트.
		
		int[] num = new int[5];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < num.length; i++) {
			System.out.print("배열에 넣을 숫자 넣기 >> ");
			num[i] = sc.nextInt();
		}
		
		System.out.println(num[0]+num[2]);
		sc.close();//scanner 스트림(연결 통로)를 닫아라.
		
		//몇 바이트일까요? 24+8 = 32byte
		
		// 스트링 3개 크기의 배열을 만들어서
		// 자바, 스프링, JSP를 순서대로 넣는다.
		// -> "자바 보다는 스프링"으로 출력
		
		String[] subject = new String[3];
		subject[0] = "자바";
		subject[1] = "스프링";
		subject[2] = "JSP";
		
		System.out.println(subject[0]+"보다는 "+subject[1]);
		
		//몇바이트 일까요? 24+4+8 = 36?
		
	}

}
