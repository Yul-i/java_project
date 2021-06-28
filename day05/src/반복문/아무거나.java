package 반복문;

import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class 아무거나 {

	public static void main(String[] args) {
		// new : 벽돌처럼 사용할 때 ram에 새롭게 복사해서 부품을 사용함.
//		JFrame name = new JFrame();
//		JButton name = new JButton();
//		JTextField name = new JTextField();
//		JLabel name = new JLabel();

		Random r = new Random(4); //숫자 넣으면(42) 숫자 고정...()로 비워두면 계속 랜덤임
		// 씨앗값(seed)

		int num = r.nextInt(100); // 0-99
		System.out.println(num);

		// 50보다 작은 임의의 수 생성
		// 5~49
		int num2 = r.nextInt(45)+5;
		System.out.println(num2);
		
		// 1000보다 작은 임의의 수 생성
		//100~999
		int num3 = r.nextInt(900)+100;//무조건 100보다는 큼 
		System.out.println(num3);
		
		//3~22
		int num4 = r.nextInt(20)+3;
	}
	//void 혼자 자기 할일 함

}
