package 문제풀이;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 윈도우_문제풀이 {
	private static JTextField t1;
	private static JTextField t2;
	private static JTextField t3;
	private static JTextField t4;

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.getContentPane().setBackground(Color.GREEN);
		f.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("먹고 싶은 음식");
		lblNewLabel.setFont(new Font("돋움", Font.BOLD, 28));
		lblNewLabel.setBounds(30, 60, 208, 50);
		f.getContentPane().add(lblNewLabel);

		t1 = new JTextField();
		t1.setFont(new Font("돋움", Font.PLAIN, 28));
		t1.setBackground(Color.ORANGE);
		t1.setBounds(250, 60, 200, 50);
		f.getContentPane().add(t1);
		t1.setColumns(10);

		JLabel lblNewLabel_1 = new JLabel("당신의 나이는");
		lblNewLabel_1.setFont(new Font("돋움", Font.BOLD, 28));
		lblNewLabel_1.setBounds(30, 210, 200, 50);
		f.getContentPane().add(lblNewLabel_1);

		t2 = new JTextField();
		t2.setFont(new Font("돋움", Font.PLAIN, 28));
		t2.setBackground(Color.PINK);
		t2.setColumns(10);
		t2.setBounds(250, 210, 200, 50);
		f.getContentPane().add(t2);

		JLabel lblNewLabel_1_1 = new JLabel("국어 점수");
		lblNewLabel_1_1.setFont(new Font("돋움", Font.BOLD, 28));
		lblNewLabel_1_1.setBounds(30, 370, 200, 50);
		f.getContentPane().add(lblNewLabel_1_1);

		t3 = new JTextField();
		t3.setFont(new Font("돋움", Font.PLAIN, 28));
		t3.setBackground(Color.CYAN);
		t3.setColumns(10);
		t3.setBounds(250, 370, 200, 50);
		f.getContentPane().add(t3);

		JLabel lblNewLabel_1_1_1 = new JLabel("수학 점수");
		lblNewLabel_1_1_1.setFont(new Font("돋움", Font.BOLD, 28));
		lblNewLabel_1_1_1.setBounds(30, 440, 200, 50);
		f.getContentPane().add(lblNewLabel_1_1_1);

		t4 = new JTextField();
		t4.setFont(new Font("돋움", Font.PLAIN, 28));
		t4.setBackground(Color.CYAN);
		t4.setColumns(10);
		t4.setBounds(250, 440, 200, 50);
		f.getContentPane().add(t4);

		JButton btnNewButton = new JButton("어디로 갈까?");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {// 클릭했을때 실행하도록 하는 함수
				// 버튼을 클릭했을 때 자동으로 이 함수가 실행
				// 버튼을 클릭했을 때 처리내용을 넣으면 됨.
				String s1 = t1.getText();// 아메리카노
				String americano = "아메리카노";
				String coffee = "커피";
				String tea = "홍차";
				if (s1.equals(americano)||s1.equals(coffee)||s1.equals(tea)) {
					JOptionPane.showMessageDialog(null, "카페로 갑시다.");
				} else {
					JOptionPane.showMessageDialog(null, "식당으로 갑시다.");
				}
			}
		});
		btnNewButton.setFont(new Font("돋움", Font.PLAIN, 24));
		btnNewButton.setBounds(30, 130, 420, 50);
		f.getContentPane().add(btnNewButton);

		JButton btnNewButton_1 = new JButton("나의 내년 나이는?");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s2 = t2.getText();
				int s22 = Integer.parseInt(s2);
				int next = s22+1;
				JOptionPane.showMessageDialog(null, "내년에 "+next+"세 입니다.");
			}
		});
		btnNewButton_1.setFont(new Font("돋움", Font.PLAIN, 24));
		btnNewButton_1.setBounds(30, 290, 420, 50);
		f.getContentPane().add(btnNewButton_1);

		JButton btnNewButton_1_1 = new JButton("두 과목 점수의 평균은?");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s3 = t3.getText();
				String s4 = t4.getText();
				int s33 = Integer.parseInt(s3);
				int s44 = Integer.parseInt(s4);
				int sum = s33+s44;
				int avg = sum/2;
				JOptionPane.showMessageDialog(null, "평균은 "+avg+"점 입니다.");
			}
		});
		btnNewButton_1_1.setFont(new Font("돋움", Font.PLAIN, 24));
		btnNewButton_1_1.setBounds(30, 510, 420, 50);
		f.getContentPane().add(btnNewButton_1_1);
		f.setSize(500, 700);

		f.setVisible(true);

	}
}
