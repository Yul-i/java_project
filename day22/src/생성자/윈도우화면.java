package 생성자;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;

public class 윈도우화면 {
	public static void main(String[] args) {
		JFrame f = new JFrame("생성자 테스트");
		f.setSize(300, 300);
		
		JButton b = new JButton("나는 버튼");
		f.add(b);
		
		JButton b2 = new JButton("나는 버튼");
		f.add(b2);
		
		Font font = new Font("궁서", Font.BOLD, 50);//다중 사용시 좋다
		b.setFont(font);
		b2.setFont(font);

		b.setFont(new Font("궁서", Font.BOLD, 50));
		
		f.setVisible(true);
		
	}
}
