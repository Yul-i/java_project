package 복습;

import javax.swing.JOptionPane;

public class 순차문1 {

	public static void main(String[] args) {
		// 순차문은 입력->처리->출력의 순서
		// 1. 입력 - 지금까지 한거 JOptionPane랑 swing이 있지
		// import 깜박했당! 클릭+f2, 마지막 글자를 지우고 다시 자동완성
		// 모든 입력데이터는 컴퓨터는 스트링으로 읽어온다.
		// 숫자로 쓸지, 스트링 그대로 쓸지는 프로그래머가(사람) 결정한다.
		// String으로 숫자를 받을 수 있지만 연산 하려면 변환 처리를 해주어야 한다.
		// 변환하는 처리 기능을 가진 부품을 찾아서 쓰면 된다.		
		String today = JOptionPane.showInputDialog("오늘은 무슨 요일일까요?");
		String temp = JOptionPane.showInputDialog("오늘은 몇도 인가요?");
		// 2. 처리
		String result = today + "은 " + temp + "도";
		// 3. 출력, sysout + 컨트롤 + 스페이스바
		System.out.println(result);
		
		

	}// main

}// class
