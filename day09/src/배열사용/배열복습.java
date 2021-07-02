package 배열사용;

public class 배열복습 {

	public static void main(String[] args) {
		// 배열을 만들 때 값을 처음부터 알고 있는 경우
		int[] num = { 100, 200, 300 };
		// 변수가 5개 생김, num, 100, 200, 300, length
		// 64비트 = 8byte, 16+8 = 24 byte 잡혀있음
		num[1] = 500;
		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
		}
		for (int x : num) {//x변수는 1개, 3번 사용, foreach는 출력용으로 쓰자
			System.out.println(x);
		}

		// 값을 처음에 모르고 있다가 나중에 넣는 경우
		// 일단 공간 만들어넣고 값을 넣으면 되어서 이 방법을 많이 씀
		int[] num2 = new int[3];
		// 공간 5개 만들어짐 num2, { 0, 0, 0 }로 자동초기화, length=3
		num2[0] = 1000;
		num2[num2.length-1] = 1000;
		for (int x : num2) {
			System.out.println(x);
		}
	}

}
