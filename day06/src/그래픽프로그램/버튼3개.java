package 그래픽프로그램;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;

public class 버튼3개 {

	public static void main(String[] args) {
		JFrame f = new JFrame("나의 버튼 5개");//제목 넣기
		f.getContentPane().setBackground(Color.GREEN);
		f.setSize(500, 500);
		f.getContentPane().setLayout(null);//레이아웃 지정하지 않으면 내가 넣고 싶은 자리에 넣을 수 있다. = absolute
		
		JButton btnNewButton = new JButton("별 10개");
		btnNewButton.setFont(new Font("굴림", Font.PLAIN, 30));
		btnNewButton.setBackground(Color.PINK);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for (int i = 0; i < 10; i++) {
					System.out.print("*");
				}
				System.out.println();
			}
		});
		btnNewButton.setBounds(119, 60, 240, 60);
		f.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("커피* 5번");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for (int i = 0; i < 5; i++) {
					System.out.print("커피*");
				}
				System.out.println();
			}
		});
		btnNewButton_1.setFont(new Font("굴림", Font.PLAIN, 30));
		btnNewButton_1.setBackground(Color.PINK);
		btnNewButton_1.setBounds(119, 148, 240, 60);
		f.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("커피*우유 3번");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for (int i = 0; i < 3; i++) {
					System.out.println("커피*우유");
				}
				System.out.println();
			}
		});
		btnNewButton_2.setFont(new Font("굴림", Font.PLAIN, 30));
		btnNewButton_2.setBackground(Color.PINK);
		btnNewButton_2.setBounds(119, 240, 240, 60);
		f.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_2_1 = new JButton("1.짱");
		btnNewButton_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for (int i = 1; i <= 3; i++) {
					System.out.println(i+": 짱!");
				}
				System.out.println();
			}
		});
		btnNewButton_2_1.setFont(new Font("굴림", Font.PLAIN, 30));
		btnNewButton_2_1.setBackground(Color.PINK);
		btnNewButton_2_1.setBounds(119, 334, 240, 60);
		f.getContentPane().add(btnNewButton_2_1);
		
		f.setVisible(true);
	}
}
