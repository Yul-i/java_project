package ����Ǯ��;

import javax.swing.JOptionPane;

public class ���Ӱ��_������ {

	public static void main(String[] args) {
		// 2. ������ ����Ͻðڽ��ϱ�? (0:���, 1:����)
		// ���ѷ��� ���
		// ù��° ��� ���ڸ� �Է� : 20
		// �ι�° ��� ���ڸ� �Է� : 10
		// ù��° ��� ��! //�� ū ���ڸ� �� ����� �¸�

		while(true) {
			String data = JOptionPane.showInputDialog("��� �ϽǷ���?");
			int data2 = Integer.parseInt(data);
			if (data2==1) {
				JOptionPane.showMessageDialog(null, "������ �����մϴ�.");
				break;
			} else {
				JOptionPane.showMessageDialog(null, "������ ��� �մϴ�.");
				//���� �������ּ���.
				String n1 = JOptionPane.showInputDialog("ù��° ��� ����");
				String n2 = JOptionPane.showInputDialog("�ι�° ��� ����");
				
				int n11 = Integer.parseInt(n1);
				int n22 = Integer.parseInt(n2);
				if (n11>n22) {
					JOptionPane.showMessageDialog(null, "ù��° ��� �¸�!");					
				}else if (n11<n22) {
					JOptionPane.showMessageDialog(null, "�ι�° ��� �¸�!");					
				}else {
					JOptionPane.showMessageDialog(null, "���º�");
					
				}
			}
		}

		
		
	}

}
