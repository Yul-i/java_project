package 문제풀이;

import javax.swing.JOptionPane;

public class 입력연습 {

	public static void main(String[] args) {
		
		// 당신이 있는 강의실 호수는?
		// 당신은 709호에 있습니다.
		
		String classNum = JOptionPane.showInputDialog("당신이 있는 강의실 호수는?");
		System.out.println("당신은 "+classNum+"호에 있습니다.");
		
		// 당신의 점심 메뉴는?
		// 당신은 자장면을 먹는 군요.
		
		String lunch = JOptionPane.showInputDialog("당신의 점심 메뉴는?");
		System.out.println("당신은 "+lunch+"을 먹는 군요.");
	
	}
	


}
