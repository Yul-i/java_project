package 메서드반환값;

import java.util.Scanner;

public class 리턴값확인 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//sc를 ram에 가져다 놓은 것.
		System.out.println(sc);//sc가 제공하는 기능을 쓸 수 있음.
		String data = sc.next();
		System.out.println(data);
		int data2 = sc.nextInt();
		System.out.println(data2);

	}

}
