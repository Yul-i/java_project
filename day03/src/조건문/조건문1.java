package 조건문;

import javax.swing.JOptionPane;

public class 조건문1 {

	public static void main(String[] args) {
		int temp = 25;
		if (temp > 27) { //()안에는 비교 연산자가 들어감
			//조건이 true 이면 실행 시키고 싶은 코드 작성
			JOptionPane.showMessageDialog(null, "에어컨ON");
		}else {
			//조건이 false 이면 실행 시키고 싶은 코드 작성
			JOptionPane.showMessageDialog(null, "에어컨OFF");
		}
		
	}

}
