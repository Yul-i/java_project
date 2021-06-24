package 순차문;

import javax.swing.JOptionPane;

public class 입력연습 {

	public static void main(String[] args) {
		String name = JOptionPane.showInputDialog("당신의 이름을 입력하세요.");
		System.out.println(name+"님 안녕히가세요.");
		JOptionPane.showMessageDialog(null, name+"님 안녕히가세요.");
		
	}
	


}
