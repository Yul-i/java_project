package 배열사용;

import java.util.Scanner;

public class 인기투표100_1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String[] name = {"아이유", "프로미스나인", "스테이씨"};
		int[] num = new int[3];
		
		
		while (true) {
			System.out.println("인기투표 1)아이유, 2)프로미스나인, 3)스테이씨, 4)종료");
			System.out.println("몇번인가요>> ");
			int vote = sc.nextInt();
			if (vote == 4) {
				System.out.println("프로그램을 종료합니다.");
				for (int i = 0; i < num.length; i++) {
					System.out.println((i+1) + ")" + name[i] + " : " + num[i] + "표");
				}
				System.exit(0);				
			} else {
				num[vote-1]++;
				System.out.println(name[vote-1] + "에게 한표!");
			} 
		}
	}

}
