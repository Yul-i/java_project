package �ݺ���;

import java.util.Random;

import javax.swing.JOptionPane;

public class ���ڸ��߱���� {

	public static void main(String[] args) {
		Random r = new Random(4);
		int target = r.nextInt(100);
		while (true) {
			// 1. �Է��� �޾ƶ�.
			String num = JOptionPane.showInputDialog("���ڸ� ���ּ���.");
			// 2. ���ڷ� ��ȯó�� �ض�.
			int num2 = Integer.parseInt(num);
			// 3. �������� Ȯ��.
			if (num2==target) {
				JOptionPane.showMessageDialog(null, "�����Դϴ�!");
			// 4. �����̸�, ���α׷� ����.
			//	   ������ �ƴϸ�, 1�� ����!
				//break;//while �ݺ��� ����! swich�� break�� ����
				System.exit(0);//0�� ���� �����ϰ� �; ���� case, �ٸ� ���ڴ� �������� //break�� ���� ����x
			}else {
				System.out.println("Ʋ�Ƚ��ϴ�.");
				if (num2>target) {
					System.out.println("�ʹ� Ů�ϴ�.");					
				} else {
					System.out.println("�ʹ� �۽��ϴ�.");					
				}
			}
		}//while
		
		//System.out.println("������ ��� ����Ǿ����ϴ�.");

	}//main

}//class
