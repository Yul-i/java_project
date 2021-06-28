package 문제풀이;

import javax.swing.JOptionPane;

public class 게임계속_선생님 {

	public static void main(String[] args) {
		// 2. 게임을 계속하시겠습니까? (0:계속, 1:종료)
		// 무한루프 사용
		// 첫번째 사람 숫자를 입력 : 20
		// 두번째 사람 숫자를 입력 : 10
		// 첫번째 사람 승! //더 큰 숫자를 낸 사람이 승리

		while(true) {
			String data = JOptionPane.showInputDialog("계속 하실래요?");
			int data2 = Integer.parseInt(data);
			if (data2==1) {
				JOptionPane.showMessageDialog(null, "게임을 중지합니다.");
				break;
			} else {
				JOptionPane.showMessageDialog(null, "게임을 계속 합니다.");
				//게임 구현해주세요.
				String n1 = JOptionPane.showInputDialog("첫번째 사람 숫자");
				String n2 = JOptionPane.showInputDialog("두번째 사람 숫자");
				
				int n11 = Integer.parseInt(n1);
				int n22 = Integer.parseInt(n2);
				if (n11>n22) {
					JOptionPane.showMessageDialog(null, "첫번째 사람 승리!");					
				}else if (n11<n22) {
					JOptionPane.showMessageDialog(null, "두번째 사람 승리!");					
				}else {
					JOptionPane.showMessageDialog(null, "무승부");
					
				}
			}
		}

		
		
	}

}
