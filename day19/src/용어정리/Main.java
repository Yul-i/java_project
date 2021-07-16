package 용어정리;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("당신의 이름은?>>> ");
		String name = sc.next();
		System.out.print("당신의 나이는?>>>");
		int age = sc.nextInt();
		System.out.println();

		Call1 call1 = new Call1();
		call1.call1(name);
		
		Call2 call2 = new Call2();
		String msg = call2.call2(name, age);
		System.out.println(msg);

		System.out.println();
	}

}
