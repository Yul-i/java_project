package interfaceTest;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyWindow3{
	JLabel result;
	
	
	public MyWindow3() {
		JFrame f = new JFrame("이벤트 처리 화면");
		f.setSize(300,300);
		
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		
		 JButton b1 = new JButton("나를 눌러요");
		 f.add(b1);
		 
		 JButton b2 = new JButton("버튼 입니다");
		 f.add(b2);

		 JButton b3 = new JButton("세번째==============");
		 f.add(b3);
		 
		 //ClickClass click = new ClickClass(); 
		b1.addActionListener(new ActionListener() {//인터페이스(ActionListener)==> 익명클래스
			
			@Override
			public void actionPerformed(ActionEvent e) {
				result.setText("b1버튼을 클릭했음!!");
			}
		});
		b2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				result.setText("b2 버튼을 클릭했음!!");
			}
		});
		b3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				result.setText("b3버튼을 클릭했음!!");
			}
		});
		
		result = new JLabel("결과 보여줌.");
		result.setFont(new Font("궁서", Font.BOLD, 20));
		result.setForeground(Color.red);
		f.add(result);
		
		
		f.setVisible(true);
		
	}
	
	
	public static void main(String[] args) {
		new MyWindow3();
		
	}

}
