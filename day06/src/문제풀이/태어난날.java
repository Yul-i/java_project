package 문제풀이;


import java.util.Date;

import javax.swing.JOptionPane;

public class 태어난날 {

	public static void main(String[] args) {
		// 나이를 입력 : 2
		// 태어난 연도는 2020년 (Date 이용)
		// 태어난 시각 : 10
		// 오전에 태어나셨군요(오전, 오후, 밤, 새벽...)
		
		String age = JOptionPane.showInputDialog("나이를 입력해주세요.");
		int age1 = Integer.parseInt(age);
		String time = JOptionPane.showInputDialog("태어난 시각을 입력해주세요");
		int time1 = Integer.parseInt(time);
	 
		Date date = new Date();
		int year = date.getYear()+1900;
		int birthYear = year-age1+1;
		System.out.println("태어난 연도는 "+birthYear+"년");
		
		if (time1>=1&&time1<=6) {
			System.out.println("새벽에 태어나셨군요.");
		}else if (time1>=7&&time1<=12) {
			System.out.println("오전에 태어나셨군요.");
		}else if (time1>=13&&time1<=18) {
			System.out.println("오후에 태어나셨군요.");
		}else if (time1>=19&&time1<=24){
			System.out.println("밤에 태어나셨군요.");
		}else {
			System.out.println("해당 시간이 없습니다.");
		}
	}

}
