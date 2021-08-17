package 자바기본;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class 기본입출력8 {

	public static void main(String[] args) {
		Scanner	sc = new Scanner(System.in);
		//1. 시작할 값 입력, 종료할 값 입력
		//2. 5의 배수만 더해서 출력
		//3. 5의 배수의 개수
		//4. 5의 배수의 목록
		//5. 5의 배수의 평균 값
		System.out.print("시작할 값>>");
		int int1 = sc.nextInt();
		System.out.print("종료할 값>>");
		int int2 = sc.nextInt();
		
		int sum = 0;
		int count=0;
		ArrayList list = new ArrayList();
		
		while(int1<=int2) {
			if(int1%5==0) {				
				sum += int1;
				count++;
				list.add(int1);
			}
			int1++;
		}
		System.out.println("합계:"+sum);
		System.out.println("5의 배수 갯수:"+count);
		System.out.println("5의 배수 목록:"+list);
		
		int listSum = 0;
		for (int i = 0; i < list.size(); i++) {
			listSum += (int)list.get(i);
		}
		int listAvg = listSum/list.size();
		
		System.out.println("5의 배수의 평균값:"+listAvg);
	}

}
