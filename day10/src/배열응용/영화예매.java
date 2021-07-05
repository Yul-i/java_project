package 배열응용;

import java.util.Scanner;

public class 영화예매 {

	public static void main(String[] args) {
		int[] seat = new int[10];
		// { 0,0,0,0,0,0,0,0,0,0}
		// 좌석 갯수 누적 시킬 변수 선언
		int count = 0;
		final int MONEY = 10000;// 변경 불가능 숫자, 보기 좋게 대문자로 써준다.
		// 항상 똑같은 수가 들어가는 변수(상수)
		// final은 상수를 나타냄, 변경불가능 !
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("---------------------");
			for (int i = 0; i < 10; i++) {
				System.out.print((i) + " ");
			}
			System.out.println();
			System.out.println("---------------------");

			for (int i : seat) {
				System.out.print(i + " ");
			}
			System.out.println();
			System.out.print("원하시는 좌석번호를 입력해주세요.(종료는 -1): ");
			int no = sc.nextInt();

			// 종료 하기
			if (no == -1) {
				System.out.println("예약이 종료됩니다.");
				System.out.println(count + "자리, 당신의 지불 금액은 " + count * MONEY + "원 입니다.");
				break;
			}

			// 예약처리하기 전에 이미 그 자리가 예약된 자리인지 확인! 해야함
			// 확인방법을 정해봅시다.
			// 0번을 입력했으면 배열의 0번 자리를 1로 변경해서
			// 예약되었다라는 것을 저장해두자.

			// 예외 처리
			if (no >= seat.length || no < -1) {
				System.out.println("없는 좌석입니다.");
			}else {
					
				if (seat[no] != 1) {
					seat[no] = 1;
					System.out.println(no + "번 좌석이 예약 완료.");
					// 누적
					count++;
					// 출력
					System.out.println("현재 예약된 좌석 : " + count + "개");
				} else {
					System.out.println("이미 예약된 자리입니다.");
					System.out.println("현재 예약된 좌석 : " + count + "개");
				}
				System.out.println();
			}

		}//while
		sc.close();// System.exit(0); 대신 break;

		// 예약된 자리를 배열에 1이 들어간 개수를 세어도 구할 수 있음.
		// 1. 지금까지 배열에 저장된 값 들 중 1이 몇개인지 세어보시오.
		int count2 = 0;
		for (int i = 0; i < seat.length; i++) {
			if (seat[i] == 1) {
				count2++;
			}
		}
		System.out.println("예약 좌석은 총 " + count2 + "개");

		// 2. 1로 예약된 자리가 어디인지 프린트.
		String sum = "";
		for (int i = 0; i < seat.length; i++) {
			if (seat[i] == 1) {
//				System.out.println("예약 좌석은 " + i + "번 입니다.");
				sum = sum + i + "번 "; 
			}
		}System.out.println("예약된 자리 목록: "+sum);


	}

}
