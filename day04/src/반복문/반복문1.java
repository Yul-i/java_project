package 반복문;

import javax.swing.JOptionPane;

public class 반복문1 {

	public static void main(String[] args) {
		//반복 - 무한으로 할것인가, 유한적으로 횟수를 정해서 할 것인가
		//유한루프 - 시작값, 종료, 증가 쓰면 while문으로 만들 수 있음
		while (true) {//true면 무한루프 
			System.out.println("나는 계속 돌아요..!!");
			String q = JOptionPane.showInputDialog("중단하실래요x");
			if (q.equals("x")) {
				//break;//반복문을 여기서 끝내랑
				System.exit(0);//그만행, 둘중 하나만 쓰기
			}
		}
	}

}
