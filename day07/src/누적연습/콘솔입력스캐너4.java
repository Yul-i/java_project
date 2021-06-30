package 누적연습;

import java.util.Scanner;

public class 콘솔입력스캐너4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
				
//		1. 입력
//		안정성점수, 속도 점수, 연비점수
		
		//안정성 점수
		System.out.print("안정성 점수>> ");
		int safe = sc.nextInt();
		System.out.print("안정섬 점수(30%): "+safe);
		System.out.println();
		
		//속도 점수
		System.out.print("속도 점수>> ");
		int speed = sc.nextInt();
		System.out.print("속도 점수(50%): "+speed);
		System.out.println();
		
		//연비 점수
		System.out.print("연비 점수>> ");
		int feul = sc.nextInt();
		System.out.println("연비 점수(20%): "+feul);
		System.out.println();
		
		
		double safe1 = safe * 0.3;
		double speed1 = speed * 0.5;
		double feul1 = feul * 0.2;

		//총점
		double total = safe1+speed1+feul1; 
		
		String grade = "미달";
		
		if (total >= 90) {
			grade = "최우수";
		}else if(total>=80){
			grade = "우수";
		}else if(total>=70){
			grade = "보통";
		}
		
		// 출력
		System.out.println("총점 : "+total+"  등급: "+grade);
		
	    
	}

}
