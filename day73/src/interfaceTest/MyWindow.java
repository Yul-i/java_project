package interfaceTest;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyWindow {
	public static void main(String[] args) {
		JFrame f = new JFrame("이벤트 처리 화면");
		f.setSize(300,300);
		
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		
		 JButton b1 = new JButton("나를 눌러요");
		 f.add(b1);
		 
		 JButton b2 = new JButton("버튼 입니다");
		 f.add(b2);

		 JButton b3 = new JButton();
		 f.add(b3);
		 
		 ClickClass click = new ClickClass(); 
		b1.addActionListener(click);
		b2.addActionListener(new ClickClass2());
		b3.addActionListener(click);
		
		
		f.setVisible(true);
		
	}
}
