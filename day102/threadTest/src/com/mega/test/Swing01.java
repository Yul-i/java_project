package com.mega.test;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Swing01 extends JFrame{

	//private : 외부 클래스에서 객체 생성 막고 싶을 때 사용
	//default : 다른 패키지에서 객체 생성을 막고 싶을 때
	
	public Swing01() {
		setTitle("나는 스윙");
		setSize(300, 300);
		JButton b = new JButton("나를 꼭 눌러줘@@@");
		add(b);
		b.addActionListener(new Action1());
		
		setVisible(true);
	}

	public static void main(String[] args) {
		new Swing01();
		
	}

}
