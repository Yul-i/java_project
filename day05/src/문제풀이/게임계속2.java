package ����Ǯ��;

import javax.swing.JOptionPane;

public class ���Ӱ��2 {

	public static void main(String[] args) {

		while (true) {// ���ѷ���
			String exitNum = JOptionPane.showInputDialog("������ ��� �Ͻðڽ��ϳ�? (0:���, 1:����)");
			// �Է�-���� Dialogâ�� strongŸ���� exitNum�� ������ ����
			int exitNum2 = Integer.parseInt(exitNum);
			// Strong���� ���� exitNum�� int�� ��ȯ�ؼ� exitNum2 ������ ���� ����
			if (exitNum2 == 1) {// �Է�-���� 1�̸� �����ض�.
				JOptionPane.showMessageDialog(null, "������ Stop!");// �޼����� ����ش�.
				System.exit(0);// ���ѷ����� �����Ѵ�.
			} else if (exitNum2 == 0) {// �Է�-���� 0�̸� �����ض�.

				String first = JOptionPane.showInputDialog("ù��° ��� ���ڸ� �Է�");
				// �Է�-���� Dialogâ�� strongŸ���� first�� ������ ����
				String second = JOptionPane.showInputDialog("�ι�° ��� ���ڸ� �Է�");
				// �Է�-���� Dialogâ�� strongŸ���� second�� ������ ����	
				int first1 = Integer.parseInt(first);
				// Strong���� ���� first�� int�� ��ȯ�ؼ� first1 ������ ���� ����
				int second2 = Integer.parseInt(second);
				// Strong���� ���� second�� int�� ��ȯ�ؼ� second2 ������ ���� ����
				
				
				if (first1 > second2) {//first1�� second2���� ũ�� �����ض�.
					JOptionPane.showMessageDialog(null, "ù��° ��� ��!");// �޼����� ����ش�.
				} else {
					JOptionPane.showMessageDialog(null, "�ι�° ��� ��!");// �޼����� ����ش�.
				}

			} else {// �� �� exitNum���� ���� 0�� 1�� �ƴ� �� ���� �����϶� �����ض�.
				JOptionPane.showMessageDialog(null, "(0:���, 1:����)�� �����ּ���");
				//�޼����� ����ش�.
			}
		}

	}

}
