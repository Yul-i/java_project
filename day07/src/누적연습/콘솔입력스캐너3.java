package 누적연습;

import java.util.Scanner;

public class 콘솔입력스캐너3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		
		System.out.print("나이 입력>> ");
		int age = sc.nextInt();
		System.out.println("내년 나이는 "+(age+1)+"세");
		System.out.print("키를 입력>>");
		double height = sc.nextDouble();
		System.out.println("내년 키는 "+(height+10));
		System.out.print("저녁을 먹었는지 입력(true/false)>> ");
		boolean night = sc.nextBoolean();
		if (night) {//if는 true면? 이라서  true=1, false=0
			System.out.println("배가 부르시겠군요!");
		}else {
			System.out.println("배가 고프시겠군요!");
		}
		sc.nextLine();//앞의 엔터 인식하니까 하나 더 넣어줘야 한다.
		System.out.print("올해의 목표는>> ");
		String say = sc.nextLine();
		System.out.println("올해의 목표는 "+say+" !!!");

	}

}
