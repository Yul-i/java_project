package ����Ǯ��;

import javax.swing.JOptionPane;

public class ���Ӱ��1 {

	public static void main(String[] args) {
		// 2. ������ ����Ͻðڽ��ϱ�? (0:���, 1:����)
		// ���ѷ��� ���
		// ù��° ��� ���ڸ� �Է� : 20
		// �ι�° ��� ���ڸ� �Է� : 10
		// ù��° ��� ��! //�� ū ���ڸ� �� ����� �¸�

		while (true) {
			String first = JOptionPane.showInputDialog("ù��° ��� ���ڸ� �Է�");
			String second = JOptionPane.showInputDialog("�ι�° ��� ���ڸ� �Է�");

			int first1 = Integer.parseInt(first);
			int second2 = Integer.parseInt(second);

			if (first1 > second2) {
				JOptionPane.showMessageDialog(null, "ù��° ��� ��!");
			} else {
				JOptionPane.showMessageDialog(null, "�ι�° ��� ��!");
			}

			while (true) {
				String exitNum = JOptionPane.showInputDialog("������ ��� �Ͻðڽ��ϳ�? (0:���, 1:����)");
				int exitNum2 = Integer.parseInt(exitNum);
				if (exitNum2 == 1) {
					JOptionPane.showMessageDialog(null, "������ Stop!");
					System.exit(0);
				} else if (exitNum2 == 0) {
					break;
				} else {
					JOptionPane.showMessageDialog(null, "(0:���, 1:����)�� �����ּ���");
				}
			}

		}
	}

}
