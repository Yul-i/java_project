package 반복문;

import javax.swing.JOptionPane;

public class 반복문3 {

	public static void main(String[] args) {
		// 시작값 : 3
		// 종료값: 10
		// 3, 4, ~ , 10 까지 프린트
		String data1 = JOptionPane.showInputDialog("시작값");
		String data2 = JOptionPane.showInputDialog("종료값");
		
		int start = Integer.parseInt(data1);
		int end = Integer.parseInt(data2);
		
		int i = start; //시작값 
		
		while (i <= end) { //조건식
			System.out.println(i);
			i++; //증감식
		}
	}

}
