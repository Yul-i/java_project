package 반복문;

import java.util.Random;

import javax.swing.JOptionPane;

public class 숫자맞추기게임 {

	public static void main(String[] args) {
		Random r = new Random(4);
		int target = r.nextInt(100);
		while (true) {
			// 1. 입력을 받아라.
			String num = JOptionPane.showInputDialog("숫자를 써주세요.");
			// 2. 숫자로 변환처리 해라.
			int num2 = Integer.parseInt(num);
			// 3. 정답인지 확인.
			if (num2==target) {
				JOptionPane.showMessageDialog(null, "정답입니다!");
			// 4. 정답이면, 프로그램 종료.
			//	   정답이 아니면, 1로 가라!
				//break;//while 반복문 멈춰! swich는 break가 엄서
				System.exit(0);//0은 내가 종료하고 싶어서 넣은 case, 다른 숫자는 강제종료 //break랑 동시 실행x
			}else {
				System.out.println("틀렸습니다.");
				if (num2>target) {
					System.out.println("너무 큽니다.");					
				} else {
					System.out.println("너무 작습니다.");					
				}
			}
		}//while
		
		//System.out.println("게임이 모두 종료되었습니다.");

	}//main

}//class
