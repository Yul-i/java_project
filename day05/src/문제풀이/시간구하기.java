package ����Ǯ��;

import java.util.Date;

public class �ð����ϱ� {

	public static void main(String[] args) {
		// �ð��� ���غ�����
		Date date = new Date();
		//10�� ���̸� �¸��
		// 15�� ���̸� �� �����ʹ�
		// 20�� ���̸� �� �̺��
		// �������� �³���
		
		int hour = date.getHours();
		
		if(hour<10) {
			System.out.println("�� ���");
		}else if (hour<15) {
			System.out.println("�� �����ʹ�");
		}else if (hour<20) {
			System.out.println("�� �̺��");
		}else {
			System.out.println("�� ����");
		}
		
		//������ ��/���̸� �����.
		//������ �����̸� �޷���.
		
		int day = date.getDay();
		
		if (day==0||day==6) {
			System.out.println("�����");
		}else {
			System.out.println("�޷���.");
		}
		
		//���� 3-5�̸� ��
		//6-8�̸� ����
		//9-11 �̸� ����
		//�������� �ܿ�
		
		int month = date.getMonth()+1;
		
		switch (month) {
		case 3: case 4: case 5:
			System.out.println("��");
			break;
		case 6: case 7: case 8:
			System.out.println("����");
			break;
		case 9: case 10: case 11:
			System.out.println("����");
			break;
		default:
			System.out.println("�ܿ�");
			break;
		}

	}

}
