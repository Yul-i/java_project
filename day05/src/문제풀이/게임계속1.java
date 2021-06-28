package 문제풀이;

import javax.swing.JOptionPane;

public class 게임계속1 {

	public static void main(String[] args) {
		// 2. 게임을 계속하시겠습니까? (0:계속, 1:종료)
		// 무한루프 사용
		// 첫번째 사람 숫자를 입력 : 20
		// 두번째 사람 숫자를 입력 : 10
		// 첫번째 사람 승! //더 큰 숫자를 낸 사람이 승리

		while (true) {
			String first = JOptionPane.showInputDialog("첫번째 사람 숫자를 입력");
			String second = JOptionPane.showInputDialog("두번째 사람 숫자를 입력");

			int first1 = Integer.parseInt(first);
			int second2 = Integer.parseInt(second);

			if (first1 > second2) {
				JOptionPane.showMessageDialog(null, "첫번째 사람 승!");
			} else {
				JOptionPane.showMessageDialog(null, "두번째 사람 승!");
			}

			while (true) {
				String exitNum = JOptionPane.showInputDialog("게임을 계속 하시겠습니끼? (0:계속, 1:종료)");
				int exitNum2 = Integer.parseInt(exitNum);
				if (exitNum2 == 1) {
					JOptionPane.showMessageDialog(null, "게임을 Stop!");
					System.exit(0);
				} else if (exitNum2 == 0) {
					break;
				} else {
					JOptionPane.showMessageDialog(null, "(0:계속, 1:종료)을 눌러주세요");
				}
			}

		}
	}

}
