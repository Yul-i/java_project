package 복습;

public class 정수5개입력 {

	public static void main(String[] args) {
		// 정수 5개 크기의 배열을 만들어서
		// 10, 20, 30, 40, 50 을 순서대로 넣는다.
		// 첫번째값과 세번째값을 더해서 프린트.
		
		int[] num = new int[5];
		for (int i = 0; i < num.length; i++) {
			num[i] = (i+1)*10;
		}
//		num[0] = 10;
//		num[1] = 20;
//		num[2] = 30;
//		num[3] = 40;
//		num[4] = 50;
		for (int i : num) {
			System.out.println(i);
		}
		System.out.println(num[0]+num[2]);
		
		//몇 바이트일까요? 24+8(참조형은 8byte) = 32byte
	
	}

}
