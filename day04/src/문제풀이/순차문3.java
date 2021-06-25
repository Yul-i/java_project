package 문제풀이;

import javax.swing.JOptionPane;

public class 순차문3 {

	public static void main(String[] args) {
		// 숫자1 입력 : 333
		String num1 = JOptionPane.showInputDialog("첫번째 숫자를 입력해주세요.");
		// 숫자2 입력 : 222
		String num2 = JOptionPane.showInputDialog("두번째 숫자를 입력해주세요.");
		// 두 숫자를 정수로 변환해서
		int num11 = Integer.parseInt(num1);
		int num22 = Integer.parseInt(num2);
		// 더하기의 결과 출력
		int sum = num11 + num22;
		System.out.println("두 숫자를 더하면 " + sum);
		// 빼기의 결과 출력
		int minus = num11 - num22;
		System.out.println("두 숫자를 빼면 " + minus);
	}// main

}// class
