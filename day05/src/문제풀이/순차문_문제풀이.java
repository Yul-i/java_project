package 문제풀이;

import javax.swing.JOptionPane;

public class 순차문_문제풀이 {

	public static void main(String[] args) {
		// 사각형의 넓이를 구하자
		// 가로 크기 : 33.3
		// 세로 크기 : 22.2
		// 사각형의 넓이는 ****입니다.
		
		String width = JOptionPane.showInputDialog("사각형의 가로 크기");
		String height = JOptionPane.showInputDialog("사각형의 세로 크기");
		
		double width2 = Double.parseDouble(width);
		double height2 = Double.parseDouble(height);
		
		double area = width2*height2;
		
		JOptionPane.showMessageDialog(null, "사각형의 넓이 : " + area);
		
	}

}
