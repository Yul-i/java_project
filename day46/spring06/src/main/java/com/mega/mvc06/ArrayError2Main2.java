package com.mega.mvc06;

import javax.swing.JOptionPane;

public class ArrayError2Main2 {

	public static void main(String[] args) {
		ArrayError2 array2 = new ArrayError2();
		try {
			array2.array();
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "에러 발생");
		}
	}
}
