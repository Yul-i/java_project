package 자바기본;

import java.util.Random;

public class 기본입출력8추가문제 {

	public static void main(String[] args) {
		Random r = new Random(100); //seed값, 씨앗값 
		int start = r.nextInt(10); //0~99 시작값
		int end = r.nextInt(10)+1000;//1000~1009 종료값
		int sum = 0;
		while(start<=end) {
			if (start%3==0) {
				sum += start;
				System.out.println(start+" : "+sum);
			}
			start++;
		}
		System.out.println("3의 배수 더한 값 : "+ sum);
	}
}
