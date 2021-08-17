package 자바기본;

import java.util.Scanner;

public class 문제1 {

	public static void main(String[] args) {
		//오늘의 점심은 무엇을 먹는 것이 좋을까요?
		//1)한식 2)일식 3)중식 4)베트남식 5)양식
		//선택해서 고르게 하여 번호당 해당하는 각 문장 출력하기.
		//번호가 다를 시 다시 돌아가서 되물어보기.
		Scanner	sc = new Scanner(System.in);
		
		while (true) {//원하는 조건이 나올때까지(true) 계속 돌려줄 while문
			System.out.println("오늘의 점심은 뭐가 좋을까요?");
			System.out.println("1)한식 2)일식 3)중식 4)베트남식 5)양식");
			System.out.print("먹고싶은 번호를 써주세요>> ");
			int food = sc.nextInt();//변수를 String으로 받아 int로 변환하여 담는다.
			switch (food) {//위의 입력값을 변수로 받아와서 switch문을 돌린다.
			case 1://food 가 1일 경우 실행한다.
				System.out.println("오늘 점심은 순대국입니다!");
				sc.close();//스캐너 모듈을 멈춰준다.
				System.exit(food);//switch문과 while문을 둘다 종료한다.
			case 2:
				System.out.println("오늘 점심은 돈까스 세트 입니다!");
				sc.close();
				System.exit(food);
			case 3:
				System.out.println("오늘 점심은 짜장면 입니다!");
				sc.close();
				System.exit(food);
			case 4:
				System.out.println("오늘 점심은 하노이 볶음밥 입니다!");
				sc.close();
				System.exit(food);
			case 5:
				System.out.println("오늘 점심은 상하이 매운크림 파스타 입니다!");
				sc.close();
				System.exit(food);
			default:
				System.out.println("잘못된 번호입니다.");
				System.out.println("-------------");
			}
		}
	}

}
