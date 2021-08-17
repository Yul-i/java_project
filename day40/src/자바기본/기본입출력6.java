package 자바기본;

import java.util.Scanner;

public class 기본입출력6 {

	public static void main(String[] args) {
		Scanner	sc = new Scanner(System.in);
		//시작은 100부터 값 500이 되기 전까지 전체를 더해보세요!
		
		int sum = 0;
		int i2 = 100;//초기값
		while (i2<500) {//반복할 조건
			sum += i2;
			i2++;
			System.out.println(sum);
		}
		sc.close(); //입력스트림 닫는다.
	}

}
