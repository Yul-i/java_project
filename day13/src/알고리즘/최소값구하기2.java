package 알고리즘;

import java.util.Random;

public class 최소값구하기2 {

	public static void main(String[] args) {
		// 1~1000까지의 값을 랜덤하게 10000개 만들어서
		// 1. 최솟값을 찾아보세요
		// 2. 개수를 세어보세요
		// 3. 위치값을 찾아보세요

		Random r = new Random();
		int[] arr = new int[10000];
		String location = "";
		int save = 0;

		for (int i = 0; i < arr.length; i++) {
			arr[i] = r.nextInt(1000) + 1;
		}

		int min = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (min > arr[i]) {
				min = arr[i];
			}
		}

		System.out.println("최솟값 : " + min);

		for (int i = 0; i < arr.length; i++) {
			if (min == arr[i]) {
				save++;
				location += i + "번 ";
			}
		}
		System.out.println("min의 갯수: " + save);
		System.out.println("위치값: " + location);

	}

}
