package 순차문;

import javax.swing.JOptionPane;

public class 순차문2 {

	public static void main(String[] args) {
		String today = JOptionPane.showInputDialog("오늘은 무슨 요일일까요?");
		String temp = JOptionPane.showInputDialog("오늘은 몇도 인가요?");

		// 2. 처리, 27을 입력
		int yes = 28; // 어제 온도
		//int temp2 = Integer.parseInt(temp);//정수
		// 27도라고 쓰면 인식 못함ㅠㅁ ㅠ(글자 못읽음)
		double temp3 = Double.parseDouble(temp);//실수
		//int result = yes - temp2;
		double result2 = yes - temp3;
		
		//캐스팅은 기본 데이터만 가능하당.
		
		// 3. 출력, sysout + 컨트롤 + 스페이스바
		//System.out.println(result + "도 차이가 나요.");
		System.out.println(result2 + "도 차이가 나요.");
		

	}// main

}// class
