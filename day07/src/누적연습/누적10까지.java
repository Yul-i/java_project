package 누적연습;

public class 누적10까지 {

	public static void main(String[] args) {
		// 1-10까지 더해봅시다.
		int sum = 0; //초기값 넣어주기.
		for (int i = 1; i <= 10000; i++) {
			// 1+2+3+...
			sum = sum + i;//1=0+1
						  //3=1+2
						  //6=3+3
		}
		System.out.println(sum);
	}

}
