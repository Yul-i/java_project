package ���ǹ�;

import javax.swing.JOptionPane;

public class ���ǹ�3 {

	public static void main(String[] args) {
			//++, -- : ���� ������, RAM�� �������� 1�� ����or���� �����ִ� ó��
			// for(���۰�; ���ǽ�; ������)
		for (int i = 0; i < 3; i++) {//0������ ����~ 3������~ 1�� �þ
			//for (int i = 0; i < 3; i=i+1) {
			// 1. �Է�
			// �Է��� �����ͷ� �޾Ƽ� ó���غ�����!
			String data = JOptionPane.showInputDialog("����� ������?");
			// String->int ��ȯ�ؼ�, jumsu�� �־��ָ� �ȴ�.
			int jumsu = Integer.parseInt(data);

			// 2. ó��
			String result = null;// ���� : ���� ������ �Ҵ�
			// ó���� ������ �Ҵ��� �� ������ ���� ����ִ� ������ �Ҵ��� ��.
			// �����Ⱚ�� ����Ʈ�� �ȵǰ�, ���굵 �Ұ���
			// ������ �����ϰ� ���� �۾��� ó���� �ʱ⿡ �صδ� ���� ����.
			// ������ �ʱ�ȭ(initialized)
//		System.out.println(result);

			if (jumsu > 90) {
				result = "A����";
			} else if (jumsu > 80) {
				result = "B����";
			} else if (jumsu > 70) {
				result = "C����";
			} else {
				result = "F����";
			}

			// 3. ���
			System.out.println("����� ������ " + result);

		} // for
	}// main

}// class
