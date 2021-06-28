package 문제풀이;

import javax.swing.JOptionPane;

public class 게임계속2 {

	public static void main(String[] args) {

		while (true) {// 무한루프
			String exitNum = JOptionPane.showInputDialog("게임을 계속 하시겠습니끼? (0:계속, 1:종료)");
			// 입력-값을 Dialog창에 strong타입의 exitNum에 변수로 받음
			int exitNum2 = Integer.parseInt(exitNum);
			// Strong으로 받은 exitNum을 int로 변환해서 exitNum2 변수에 새로 담음
			if (exitNum2 == 1) {// 입력-값이 1이면 실행해라.
				JOptionPane.showMessageDialog(null, "게임을 Stop!");// 메세지를 띄워준다.
				System.exit(0);// 무한루프를 종료한다.
			} else if (exitNum2 == 0) {// 입력-값이 0이면 실행해라.

				String first = JOptionPane.showInputDialog("첫번째 사람 숫자를 입력");
				// 입력-값을 Dialog창에 strong타입의 first에 변수로 받음
				String second = JOptionPane.showInputDialog("두번째 사람 숫자를 입력");
				// 입력-값을 Dialog창에 strong타입의 second에 변수로 받음	
				int first1 = Integer.parseInt(first);
				// Strong으로 받은 first을 int로 변환해서 first1 변수에 새로 담음
				int second2 = Integer.parseInt(second);
				// Strong으로 받은 second을 int로 변환해서 second2 변수에 새로 담음
				
				
				if (first1 > second2) {//first1가 second2보다 크면 실행해라.
					JOptionPane.showMessageDialog(null, "첫번째 사람 승!");// 메세지를 띄워준다.
				} else {
					JOptionPane.showMessageDialog(null, "두번째 사람 승!");// 메세지를 띄워준다.
				}

			} else {// 맨 위 exitNum에서 값이 0과 1이 아닌 그 외의 숫자일때 실행해라.
				JOptionPane.showMessageDialog(null, "(0:계속, 1:종료)을 눌러주세요");
				//메세지를 띄워준다.
			}
		}

	}

}
