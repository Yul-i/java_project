package 새창데이터전달;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class Main2 {
	private static JTextField t1;
	private static JTextField t2;
	private static JTextField t3;

	public static void main(String[] args) {
		JFrame f = new JFrame("main....!!! 여기서 시작");
		f.setSize(454, 600);
		Font font = new Font("궁서", Font.BOLD, 45);
		JButton b1 = new JButton("로그인처리");
		b1.setBounds(66, 235, 305, 61);
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				새창3 w3 = new 새창3();
				String id = t1.getText();
				String pw = t2.getText();
				
				w3.open3(id, pw);
//				f.setVisible(false);
			}
		});
		JButton b2 = new JButton("결정!!!");
		b2.setBounds(66, 462, 305, 61);
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				새창4 w4 = new 새창4();
				String num = t3.getText();
				int temp = Integer.parseInt(num);
				w4.open4(temp);
			}
		});
		f.getContentPane().setLayout(null);
		f.getContentPane().add(b1);
		f.getContentPane().add(b2);
		b1.setFont(font);
		b2.setFont(font);
		b1.setBackground(Color.green);
		b2.setBackground(Color.yellow);
		
		t1 = new JTextField();
		t1.setFont(new Font("굴림", Font.PLAIN, 30));
		t1.setBounds(95, 68, 305, 61);
		f.getContentPane().add(t1);
		t1.setColumns(10);
		
		t2 = new JTextField();
		t2.setFont(new Font("굴림", Font.PLAIN, 30));
		t2.setColumns(10);
		t2.setBounds(95, 138, 305, 61);
		f.getContentPane().add(t2);
		
		JLabel lblNewLabel = new JLabel("id");
		lblNewLabel.setFont(new Font("굴림", Font.PLAIN, 30));
		lblNewLabel.setBounds(37, 81, 44, 34);
		f.getContentPane().add(lblNewLabel);
		
		JLabel lblPw = new JLabel("pw");
		lblPw.setFont(new Font("굴림", Font.PLAIN, 30));
		lblPw.setBounds(37, 146, 44, 34);
		f.getContentPane().add(lblPw);
		
		t3 = new JTextField();
		t3.setFont(new Font("굴림", Font.PLAIN, 30));
		t3.setColumns(10);
		t3.setBounds(218, 377, 182, 61);
		f.getContentPane().add(t3);
		
		JLabel lblNewLabel_1 = new JLabel("오늘의 온도");
		lblNewLabel_1.setFont(new Font("굴림", Font.PLAIN, 30));
		lblNewLabel_1.setBounds(37, 390, 167, 34);
		f.getContentPane().add(lblNewLabel_1);
		
		f.setVisible(true);
	}
}
