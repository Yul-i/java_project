package 문제풀이;

import java.util.Random;

import javax.swing.JOptionPane;

public class 랜덤문제 {

	public static void main(String[] args) {
		//1.랜덤문제
		//랜덤한 숫자를 2개 발생시켜서
		// 첫번째 랜덤한 숫자가 더 크면 첫번째가 더 커요!
		// 두번째 랜덤한 숫자가 더 크면 두번째가 더 커요!
		
		Random r = new Random(); //Random 블록을 ram의 r에 저장한다.
		
		int first = r.nextInt(100); //random의 부품 중 랜덤한 int값을 불러주는 nextInt()를 사용해서 int 타입 변수에 담는다.
		int second = r.nextInt(100); //(n)안의 숫자는 0~n값안에서 숫자가 뜨도록 제한을 둔다.
		
		if (first>second) {//first가 second가 크면 실행해라 
			JOptionPane.showMessageDialog(null, "첫번째 숫자: "+first+" 두번째 숫자: "+second+" 첫번째가 더 커요");
			//메시지 출력
		} else {
			JOptionPane.showMessageDialog(null, "첫번째 숫자: "+first+" 두번째 숫자: "+second+" 두번째가 더 커요");
			//메시지 출력
		}

	}

}
