/*
 * 
 */

package 배열응용;

import java.util.Scanner;

public class 영화예매_클론 {

	public static void main(String[] args) {

		int[] seat = new int[10];
		int count = 0;
		int count2 = 0;
		final int COST = 12000;
		String sum = "";
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("--------------------");
			for (int i = 0; i < seat.length; i++) {
				System.out.print(i + " ");
			}
			System.out.println();
			System.out.println("--------------------");
			for (int i : seat) {
				System.out.print(i + " ");
			}
			System.out.println();
			System.out.print("예매할 좌석 번호>> ");
			int num = sc.nextInt();

			// 예약 종료
			if (num == -1) {
				System.out.println("예약 종료합니다.");
				for (int i = 0; i < seat.length; i++) {
					if (seat[i] == 1) {
						count2++;
						sum = sum + i + "번 좌석 ";
					}
				}
				System.out.println(sum);
				System.out.println("총 " + count2 * COST + "원 입니다.");
				break;
			}

			// 예약하기
			if (seat[num] != 1) {
				seat[num] = 1;
				count++;
				System.out.println(num + "번 좌석 예약 완료");
				System.out.println(count + "개 좌석 예약");
			} else {
				System.out.println("이미 예약된 좌석");
			}
			System.out.println();
		}
		sc.close();
	}

}
