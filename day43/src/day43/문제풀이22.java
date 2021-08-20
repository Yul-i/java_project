package day43;

import java.util.Scanner;

public class 문제풀이22 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] num = new int[5]; // 수강신청 여부를 나타내줄 배열

		int confirm = 0;

		while (true) {
			System.out.println("");
			System.out.println("수강 신청을 진행합니다");
			System.out.println("원하는 과목을 신청 해주세요");
			System.out.println("--------------------------------");
			System.out.println("1)자바 2)스프링 3)안드로이드 4)파이썬 5)제이쿼리 ");
			System.out.println("--------------------------------");
			for (int i = 0; i < num.length; i++) {
				System.out.print(num[i] + "       ");
			}

			System.out.println();
			System.out.print("원하는 과목코드를 입력해주세요. (종료는 0) > > > ");
			int subject = sc.nextInt(); // 과목명 선택
			if (subject == 0) {
				System.out.println("시스템을 종료합니다. 안녕히 가세요.");
				break;
			}

			if (num[subject - 1] == 0) {
				System.out.println("수강 신청이 가능합니다.");
				System.out.print("수강 신청 하시겠습니까?  1)수강신청 2)취소 > > > ");
				int yes = sc.nextInt();

				if (yes == 1) {
					System.out.println("수강신청 완료");
					for (int i = 0; i < num.length; i++) {
						if (subject-1 == i) {
							if (num[subject-1] == 0) {
								num[subject-1] = 1;
							}
						}
					}
				} else {
					System.out.println("수강신청 취소");
				}
				
				

			} // while
		}

	} // main end

} // class end