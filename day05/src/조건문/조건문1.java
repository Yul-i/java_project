package ���ǹ�;

public class ���ǹ�1 {

	public static void main(String[] args) {

		// 1. �Է�

		int jumsu = 66;

		// 2. ó��
		String result = null;// ���� : ���� ������ �Ҵ�
		//ó���� ������ �Ҵ��� �� ������ ���� ����ִ� ������ �Ҵ��� ��.
		//�����Ⱚ�� ����Ʈ�� �ȵǰ�, ���굵 �Ұ���
		//������ �����ϰ� ���� �۾��� ó���� �ʱ⿡ �صδ� ���� ����.
		//������ �ʱ�ȭ(initialized)
//		System.out.println(result);

		if (jumsu > 90) {
			result = "A����";
		}else if (jumsu > 80) {
			result = "B����";
		}else if (jumsu > 70) {
			result = "C����";
		}else {
			result = "F����";			
		}
		
		// 3. ���
		System.out.println("����� ������ "+result);
	}

}
