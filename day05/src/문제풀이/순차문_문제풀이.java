package ����Ǯ��;

import javax.swing.JOptionPane;

public class ������_����Ǯ�� {

	public static void main(String[] args) {
		// �簢���� ���̸� ������
		// ���� ũ�� : 33.3
		// ���� ũ�� : 22.2
		// �簢���� ���̴� ****�Դϴ�.
		
		String width = JOptionPane.showInputDialog("�簢���� ���� ũ��");
		String height = JOptionPane.showInputDialog("�簢���� ���� ũ��");
		
		double width2 = Double.parseDouble(width);
		double height2 = Double.parseDouble(height);
		
		double area = width2*height2;
		
		JOptionPane.showMessageDialog(null, "�簢���� ���� : " + area);
		
	}

}
