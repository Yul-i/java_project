package 배열사용;

import java.util.Scanner;

public class 인기투표100 {

	public static void main(String[] args) {

		String[] name = { "아이유", "유재석", "BTS" };//인기투표를 할 대상은 정해져있으니까 선언과 동시에 값을 넣는다.
		int[] tv = new int[3];// 투표 수 { 0, 0, 0 } 으로 자동 초기화

		Scanner sc = new Scanner(System.in);
		// 사용자가 사용할 수 있도록 화면을 만들어 보자. Scanner 유틸을 이용한다.

		while (true) {//뱅글뱅글 계속 무한루프를 하자.
			System.out.println("인기투표 0)아이유, 1)유재석, 2)BTS, 3)종료");
			System.out.print("선택번호>> ");
			int num = sc.nextInt();//콘솔에서 int값으로 받는다.
			//계속 출력될 화면들
			if (num == 3) {//while 무한루프시엔 if에는 종료되는 조건부터 먼저 넣어준다.
				System.out.println("투표를 종료합니다.");
				for (int i = 0; i < tv.length; i++) {//같은 말 반복해야하니 배열의 크기만큼 효율적으로 for문을 돌려준다.
					System.out.println(i+")" + name[i] + ": " + tv[i] + "표");
				};
				System.out.println("총 "+(tv[0]+tv[1]+tv[2]) + "표");//괄호에 잘 보이도록 int들을 넣어준다.
				System.exit(0);//실행을 종료한다.
			} else {
				tv[num]++;//해당 자리에 1씩 더해준다.
				System.out.println(name[num]+"가 한표를 획득!");
			}
		}
		
	}

}
