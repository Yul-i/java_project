package ����Ǯ��;

import java.util.Random;

import javax.swing.JOptionPane;

public class �������� {

	public static void main(String[] args) {
		//1.��������
		//������ ���ڸ� 2�� �߻����Ѽ�
		// ù��° ������ ���ڰ� �� ũ�� ù��°�� �� Ŀ��!
		// �ι�° ������ ���ڰ� �� ũ�� �ι�°�� �� Ŀ��!
		
		Random r = new Random(); //Random ����� ram�� r�� �����Ѵ�.
		
		int first = r.nextInt(100); //random�� ��ǰ �� ������ int���� �ҷ��ִ� nextInt()�� ����ؼ� int Ÿ�� ������ ��´�.
		int second = r.nextInt(100); //(n)���� ���ڴ� 0~n���ȿ��� ���ڰ� �ߵ��� ������ �д�.
		
		if (first>second) {//first�� second�� ũ�� �����ض� 
			JOptionPane.showMessageDialog(null, "ù��° ����: "+first+" �ι�° ����: "+second+" ù��°�� �� Ŀ��");
			//�޽��� ���
		} else {
			JOptionPane.showMessageDialog(null, "ù��° ����: "+first+" �ι�° ����: "+second+" �ι�°�� �� Ŀ��");
			//�޽��� ���
		}

	}

}
