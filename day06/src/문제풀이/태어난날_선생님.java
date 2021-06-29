package 문제풀이;


import java.util.Date;

import javax.swing.JOptionPane;

public class 태어난날_선생님 {

	public static void main(String[] args) {
		// 나이를 입력 : 2
		// 태어난 연도는 2020년 (Date 이용)
		// 태어난 시각 : 10
		// 오전에 태어나셨군요(오전, 오후, 밤, 새벽...)
		
		String age = JOptionPane.showInputDialog("나이를 입력해주세요.");
		//태어난 연도는 올해년도 -나이 +1
		int age2 = Integer.parseInt(age);
		// 자동 import ctrl+shift+o(영문), f2
		Date date = new Date();
		
		int year = date.getYear()+1900;
		int result1 = year - age2 + 1;
		System.out.println(result1);
		
		String time = JOptionPane.showInputDialog("태어난 시각 입니다.");
		int time2 = Integer.parseInt(time);
		if (time2 < 12) {//높은숫자부터 위로 쓰면 안됨ㅠ_ㅠ 큰 숫자로 걸러짐
			System.out.println("오전에 태어나셨군요.");
		}else if(time2 < 20) {
			System.out.println("오후에 태어나셨군요.");
		}else if(time2 < 24) {
			System.out.println("밤에 태어나셨군요.");
		}else{
			System.out.println("새벽에 태어나셨군요.");
		}
		
	}

}
