package ����.������;

import javax.swing.JOptionPane;

public class �Է�ó����� {

	// main + ��Ʈ�� + �����̽� ��
	public static void main(String[] args) {
		// 1. �Է� - String�� 4byte ��0�� �̰� �̵��� Ȯ�� �غ��߰ڴ�(String�� �ּҸ� ��µ� ���⿡ 4byte�� ��)
		String hobby = JOptionPane.showInputDialog("����� ��̴�?");
		String when = JOptionPane.showInputDialog("�����Ͻó���?");
		String time = JOptionPane.showInputDialog("��ð��̳� �ϼ̳���?");
		// 2. ó��
		String result = when + "�� " + hobby + "�� �Ͻô±���.";
		// String->int�� ��ȯ���ִ� ó��
		int time2 = Integer.parseInt(time);
		if (time2 >= 3) { //�� �������� ����� �׻� boolean(�������� - true/false) �̴�.
			//������ true�� �� ���� �Ǵ� �κ�
			JOptionPane.showMessageDialog(null, "���� ���� �ϼ̱���.");
		} else {
			//������ false�� �� ����Ǵ� �κ�
			JOptionPane.showMessageDialog(null, "�������� �ϼ̱���.");
		}

		// 3. ���
		JOptionPane.showMessageDialog(null, result);// void = ����?
	}
}
