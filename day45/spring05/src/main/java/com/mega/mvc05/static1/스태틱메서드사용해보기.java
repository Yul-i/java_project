package com.mega.mvc05.static1;

import javax.swing.JOptionPane;

public class 스태틱메서드사용해보기 {

	public static void main(String[] args) {
		String age = JOptionPane.showInputDialog("age입력");
		int age2 = Integer.parseInt(age);
		JOptionPane.showMessageDialog(null, (age2+1)+"세");
		
		System.exit(1);
	}

}
