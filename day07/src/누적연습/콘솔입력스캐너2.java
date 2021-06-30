package 누적연습;

import java.util.Scanner;

public class 콘솔입력스캐너2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 1 입력>> ");
		int num1 = sc.nextInt();//String --> int
		System.out.print("숫자 2 입력>> ");
		int num2 = sc.nextInt();
		if (num1>num2) {
			System.out.println("앞 숫자가 크다.");
		}else if (num1<num2) {
			System.out.println("뒷 숫자가 크다.");
		}else {
			System.out.println("두 숫자가 같다.");
		}
		System.out.println("n1: "+ num1 );
		System.out.println("n2: "+ num2 );
		
		System.out.println("과목을 입력(자바, c++, python)>> ");
		String data = sc.next();
		if (data.equals("자바")) {
			System.out.println("JSP로 점프@@");
		}else if (data.equals("c++")) {
			System.out.println("ASP로 점프@@");
		}else {
			System.out.println("python로 점프@@");
		}
		
		switch (data) {
		case "자바":			
			System.out.println("JSP로 점프@@");
			break;
		case "c++":			
			System.out.println("JSP로 점프@@");
			break;
		default:
			System.out.println("python로 점프@@");
			break;
		}
		
		System.out.println("------------------------------------");
		
	
	}

}
