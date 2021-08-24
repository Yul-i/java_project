package com.mega.mvc05.static1;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 음식주문프로그램 {
	private static JTextField count;
	//전역변수도 스테틱이여야 한다. 객체 생성하지 않아도 접근 가능
	//힙영역은 객체 생성해야만 접근 가능하므로 static 붙여줌
	//main이 static이므로, 객체 생성하지 않아도 접근이 가능한 변수여야 한다.
	//main안에서 사용하는 전역변수는 반드시 static으로 만들어주어야 한다.
	static int sum;
	final static int price = 5000;//상수

	public static void main(String[] args) {
		//main이 static인 이유는
		//객체생성하지 않아도 main부터 시작하기 때문...
		JFrame f = new JFrame();
		f.getContentPane().setBackground(Color.GREEN);
		f.getContentPane().setLayout(null);
		
		JLabel l1 = new JLabel("개수");
		l1.setFont(new Font("나눔고딕", Font.PLAIN, 28));
		l1.setBounds(492, 24, 53, 63);
		f.getContentPane().add(l1);
		
		count = new JTextField();
		count.setBackground(Color.YELLOW);
		count.setFont(new Font("나눔고딕", Font.PLAIN, 24));
		count.setBounds(559, 24, 150, 56);
		f.getContentPane().add(count);
		count.setColumns(10);
		
		JLabel img = new JLabel("");
		img.setIcon(new ImageIcon("photo1.jpg"));
		img.setBounds(70, 107, 638, 265);
		f.getContentPane().add(img);
		
		JLabel l2 = new JLabel("결제금액");
		l2.setForeground(Color.RED);
		l2.setFont(new Font("나눔고딕", Font.BOLD, 28));
		l2.setBounds(70, 395, 116, 42);
		f.getContentPane().add(l2);
		
		JLabel result = new JLabel("");
		result.setForeground(Color.RED);
		result.setFont(new Font("나눔고딕", Font.BOLD, 28));
		result.setBounds(198, 395, 347, 42);
		f.getContentPane().add(result);
		f.setSize(800, 500);
		
		JButton b1 = new JButton("짬뽕");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sum++;
				count.setText(sum+"개");
				result.setText(Integer.toString(price*sum)+"원");
				ImageIcon icon = new ImageIcon("photo2.jpg");
				img.setIcon(icon);
			}
		});
		b1.setFont(new Font("나눔고딕", Font.PLAIN, 28));
		b1.setBounds(70, 34, 91, 42);
		f.getContentPane().add(b1);
		
		JButton b2 = new JButton("우동");
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sum++;
				count.setText(sum+"개");
				result.setText(Integer.toString(price*sum)+"원");
				ImageIcon icon = new ImageIcon("photo3.jpg");
				img.setIcon(icon);
			}
		});
		b2.setFont(new Font("나눔고딕", Font.PLAIN, 28));
		b2.setBounds(173, 34, 91, 42);
		f.getContentPane().add(b2);
		
		JButton b3 = new JButton("짜장");
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sum++;
				count.setText(sum+"개");
				result.setText(Integer.toString(price*sum)+"원");
				ImageIcon icon = new ImageIcon("photo1.jpg");
				img.setIcon(icon);
			}
		});
		b3.setFont(new Font("나눔고딕", Font.PLAIN, 28));
		b3.setBounds(276, 34, 91, 42);
		f.getContentPane().add(b3);
		
		
		
		
		f.setVisible(true);
	}
}
