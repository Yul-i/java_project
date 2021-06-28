package 반복문;

public class 반복문1 {

	public static void main(String[] args) {
		// 반복문안에 들어가는 변수는 횟수를 카운트할 때도 사용하고
		// 변수에 들어있는 값을 가지고 처리할 때도 사용한다.
		// 1부터 5까지 반복해서 찍어보자.
		for (int i = 1; i <= 5; i++) {
			System.out.println(i);
		}

		// 1부터 10까지 중 2씩 점프해서 찍어보자.

		for (int j = 1; j <= 10; j = j + 2) {
			System.out.println(j);
		}
		// 1부터 100까지 중 5씩 점프해서 찍어보자.
		for (int k = 1; k <= 100; k = k + 5) {
			System.out.println(k);
		}

		// 100부터 1까지 1씩 점프해서 찍어보자.
		for (int l = 100; l >= 1; l--) {
			System.out.println(l);
		}

		// 1000부터 0까지 8씩 점프해서 찍어보자.
		for (int m = 1000; m >= 0; m = m - 8) {
			System.out.println(m);
		}
	}

}
