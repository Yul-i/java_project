package �ݺ���;

import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class �ƹ��ų� {

	public static void main(String[] args) {
		// new : ����ó�� ����� �� ram�� ���Ӱ� �����ؼ� ��ǰ�� �����.
//		JFrame name = new JFrame();
//		JButton name = new JButton();
//		JTextField name = new JTextField();
//		JLabel name = new JLabel();

		Random r = new Random(4); //���� ������(42) ���� ����...()�� ����θ� ��� ������
		// ���Ѱ�(seed)

		int num = r.nextInt(100); // 0-99
		System.out.println(num);

		// 50���� ���� ������ �� ����
		// 5~49
		int num2 = r.nextInt(45)+5;
		System.out.println(num2);
		
		// 1000���� ���� ������ �� ����
		//100~999
		int num3 = r.nextInt(900)+100;//������ 100���ٴ� ŭ 
		System.out.println(num3);
		
		//3~22
		int num4 = r.nextInt(20)+3;
	}
	//void ȥ�� �ڱ� ���� ��

}
