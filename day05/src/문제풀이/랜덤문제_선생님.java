package ����Ǯ��;

import java.util.Random;

import javax.swing.JOptionPane;

public class ��������_������ {

	public static void main(String[] args) {
		//1.��������
		//������ ���ڸ� 2�� �߻����Ѽ�
		// ù��° ������ ���ڰ� �� ũ�� ù��°�� �� Ŀ��!
		// �ι�° ������ ���ڰ� �� ũ�� �ι�°�� �� Ŀ��!
		
		Random r = new Random();
		
		int n1 = r.nextInt(100);
		int n2 = r.nextInt(100);
		
		if (n1>n2) {
			JOptionPane.showMessageDialog(null, "ù��° ����: "+n1+" �ι�° ����: "+n2+" ù��°�� �� Ŀ��");
		}else if(n1<n2) {
			JOptionPane.showMessageDialog(null, "ù��° ����: "+n1+" �ι�° ����: "+n2+" �ι�°�� �� Ŀ��");
		}

	}

}
