package com.mega.test;

import java.awt.Color;
//익명클래스를 사용하는 방법
//액션처리하는 메서드를 ui바로 아래에 정의할 수 있음

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Swing3 extends JFrame implements ActionListener{

	
	JButton b; //전역변수, 클래스 안에서 아무데나 쓸 수 있음.
	//변수의 사용 영역(scope)는 선언된 위치에 따라 결정.
	
	public Swing3() {
		setTitle("나는 스윙");
		setSize(300, 300);
		b = new JButton("나를 꼭 눌러줘@@@");
		add(b);
		b.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				b.setText("진짜 변하네");
				b.setBackground(Color.yellow);
			}
		});
		setVisible(true);
	}

	public static void main(String[] args) {
		new Swing3();
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
	}
	
}
