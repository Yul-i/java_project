package �ݺ���;

import javax.swing.JOptionPane;

public class �ݺ���3 {

	public static void main(String[] args) {
		// ���۰� : 3
		// ���ᰪ: 10
		// 3, 4, ~ , 10 ���� ����Ʈ
		String data1 = JOptionPane.showInputDialog("���۰�");
		String data2 = JOptionPane.showInputDialog("���ᰪ");
		
		int start = Integer.parseInt(data1);
		int end = Integer.parseInt(data2);
		
		int i = start; //���۰� 
		
		while (i <= end) { //���ǽ�
			System.out.println(i);
			i++; //������
		}
	}

}
