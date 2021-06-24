package 조건문;

import javax.swing.JOptionPane;

public class 조건문2 {

	public static void main(String[] args) {
		int x = 111;
		int y = 222;
		// x>y 면 x가 더 커요.
		// 그게 아니라면, y가 더 크거나 같아요.

		if (x > y) {
			JOptionPane.showMessageDialog(null, "x가 더 커요.");
		} else {
			JOptionPane.showMessageDialog(null, "y가 더 크거나 같아요.");
		}
	}

}
