package 이차원배열;

import java.util.Random;

public class 정리문제 {

	public static void main(String[] args) {
//		랜덤한 값을 1~100
//		4*5 2차원 배열에 넣으세요.
//		전체를 프린트
		int arr[][] = new int[4][5];
		Random r = new Random();
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = r.nextInt(100)+1;
				System.out.print(arr[i][j]+" ");
			}System.out.println();
		}
		

	}

}
