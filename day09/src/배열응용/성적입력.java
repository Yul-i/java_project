package 배열응용;

import java.util.Scanner;

public class 성적입력 {

	public static void main(String[] args) {
		int[] student = new int[5];
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		
		for (int i = 0; i < student.length; i++) {
			System.out.println((i+1)+"번째 학생 성적 입력>>");
			student[i] = sc.nextInt();//ㅇ0ㅇ
			sum = sum+student[i];
		}
		System.out.println(sum);
		
		int avg = sum/student.length;
		System.out.println("합계 :"+sum+"점, 평균 : "+avg+"점");

	}

}
