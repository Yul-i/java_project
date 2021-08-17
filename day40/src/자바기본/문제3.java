package 자바기본;

import java.util.ArrayList;
import java.util.Random;

public class 문제3 {

	public static void main(String[] args) {
		//지옥의 3의 배수만 짝짝짝을 친다.
		//1부터 시작해서 종료(랜덤)값까지 하는데
		//박수친 횟수를 구하고,
		//박수친 숫자의 합계를 구하고,
		//박수친 숫자의 평균값을 구하고
		//어느 번호에서 박수를 쳤는지 목록을 만들어라.
		
		Random r = new Random();
		
		int start = 1;
		int end = r.nextInt(1000);
		int sum = 0;
		int avg = 0;
		ArrayList list = new ArrayList();
		
		System.out.println("종료 값 : "+end);
		while(start<=end) {
			if(start%3==0) {
				list.add(start);
			}
			start++;
		}
		
		for (int i = 0; i < list.size(); i++) {
			sum+=(int)list.get(i);
		}
		avg = sum/list.size();
		
		System.out.println("박수 친 횟수 : "+list.size());
		System.out.println("박수친 숫자의 합 : "+sum);
		System.out.println("박수친 숫자의 평균 : "+avg);
		System.out.println("박수친 숫자 목록 : "+list);
	}

}
