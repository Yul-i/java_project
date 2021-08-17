package 자바기본;

import java.awt.print.Printable;
import java.util.Scanner;

public class 기본입출력3 {

	public static void main(String[] args) {
		Scanner	sc = new Scanner(System.in);
		int sum = 0;
		//int[] jumsu = { 0, 0, 0, 0, 0};
		int[] jumsu = new int[5]; //배열은 자동 초기화
		for (int i = 0; i < 5; i++) {
			System.out.print("오늘 온도는 몇도인가요? ");
			int temp = sc.nextInt(); //모든 외부 입력은 모두다 String
			if (temp >= 30) {
				System.out.println("너무 더워요.");
			} else {
				System.out.println("괜찮아요.");
			}
			jumsu[i] = temp;
			sum = sum + temp;
		}
		double avg = sum / 5.0;
		System.out.println("평균은"+avg);
		System.out.println("-----------------");
		for (int i = 0; i < jumsu.length; i++) {
			System.out.print(jumsu[i]+" ");
		}
		sc.close(); //입력스트림 닫는다.
	}

}
