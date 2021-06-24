package 문제풀이;

import javax.swing.JOptionPane;

public class 문제풀이 {

	public static void main(String[] args) {
//		1. 변수에 저장 : 커피개수 5잔, 커피값 5000원
//		총 커피값을 계산하고 출력
//		커피값이 20000을 넘으면 "할인해드릴게요." 프린트
//				넘지 않으면 "총 커피값을 내세요." 프린트

		int coffee = 5;
		int cost = 5000;
		int total = coffee*cost;
		
		JOptionPane.showMessageDialog(null,total);

	
		if (total>20000) {
			System.out.println("할인해드릴게요.");
		} else {			
			System.out.println("총 커피값을 내세요.");
		}
		
		
//		2. 내 현재 나이를 변수에 저장 100
//		내 내년나이를 계산하고 출력
//		내 내년 나이가 100세를 넘으면 "이제 부터 시작", 
//				아니면 "아직 젊어요."
		
		int age = 100;
		int nearAge = age+1;
		
		JOptionPane.showMessageDialog(null,"내 내년나이 : "+nearAge+"세");
		
		if (nearAge>100) {
			JOptionPane.showMessageDialog(null,"이제 부터 시작");
		} else {
			JOptionPane.showMessageDialog(null,"아직 젊어요.");
		}
		
//		3.생수값 1000, 생수구매개수 2,
//		  마스크값 2000, 마스크구매개수 3
//		  내가 지불해야 할
//		  1) 마스크값 금액은 얼마?
//		  2) 마스크값 금액은 얼마?
//	      3) 총 지불금액은 얼마?
		
		int water = 1000;
		int waterBuy = 2;
		int totalWater = water*waterBuy;
		
		int mask = 2000;
		int maskBuy = 3;
		int totalMask = mask*maskBuy; 
		
		int BuyTotal = totalWater+totalMask;
		
		System.out.println("1) 생수값 금액은 얼마?"+totalWater+"원");
		System.out.println("2) 마스크값 금액은 얼마?"+totalMask+"원");
		System.out.println("3) 총 지불 금액은 얼마?"+BuyTotal+"원");
		
//		4."나는 짱"을 1000번 프린트
		
		for (int i = 0; i < 1000; i++) {
			System.out.println("나는 짱");
		}
	    		  
//		5. 국어점수 75, 수학점수 50을 변수에 저장
//		국어점수와 수학점수의 총합을 구해서 프린트
//		평균을 구해서 프린트
	   
		int korean = 75;
		int math = 50;
		
		int subjectSum = korean+math;
		int subjectAvg = subjectSum/2;
		
		System.out.println("국어점수, 수학점수의 총합:"+subjectSum+"점");
		System.out.println("국어점수, 수학점수의 평균:"+subjectAvg+"점");

	}

}
