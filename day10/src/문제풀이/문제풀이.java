package 문제풀이;

import java.util.Scanner;

public class 문제풀이 {

	public static void main(String[] args) {
		/*
		 * ## 참고, 사과/ 바나나는 2000원씩, 포도/키위는 3000원씩 좋아하는 과일은? 1)사과 2)바나나 3)포도 4)키위 0)종료>> 1
		 * =========================== 사과가 선택되었습니다.
		 * 
		 * 좋아하는 과일은? 1)사과 2)바나나 3)포도 4)키위 0)종료>> 2 =========================== 바나나가
		 * 선택되었습니다.
		 * 
		 * 좋아하는 과일은? 1)사과 2)바나나 3)포도 4)키위 0)종료>> 0 =========================== 시스템이
		 * 종료됩니다. 사과 : 3개 바나나 : 2개 포도 : 1개 키위 : 2개
		 */

		Scanner sc = new Scanner(System.in);
		String[] fruit = { "사과", "바나나", "포도", "키위 " };
		int[] count = new int[4];
		final int APPLE = 2000;
		final int BANANA = 2000;
		final int GRAPE = 3000;
		final int KIWI = 3000;

		while (true) {
			System.out.println("====================");
			System.out.print("좋아하는 과일은? 1)사과 2)바나나 3)포도 4)키위 0)종료>> ");
			int num = sc.nextInt();
			System.out.println("====================");
			if (num == 0) {
				System.out.println("시스템이 종료됩니다.");
				for (int i = 0; i < count.length; i++) {
					System.out.println(fruit[i] + ": " + count[i] + "개");
				}
				int sum = (APPLE * count[0]) + (BANANA * count[1]) + (GRAPE * count[2]) + (KIWI * count[3]);
				System.out.println("구매하려면 전체 금액은 " + sum + "원 입니다.");
				break;
			} else {
				count[num - 1]++;
				System.out.println(fruit[num - 1] + "가 선택되었습니다.");
				System.out.println();
			}

		} // while
		sc.close();

	}

}
