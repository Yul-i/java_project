package 순차문;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import java.awt.Color;

public class 윈도우3 {
	private static JTextField textField;
	private static JTextField textField_1;
	private static JTextField textField_2;

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.getContentPane().setBackground(new Color(255, 228, 181));
		f.setSize(500, 500);
		f.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("나의 일기장");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 40));
		lblNewLabel.setBounds(120, 40, 240, 60);
		f.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("<<<<<<<<<<오늘의 일기작성을 시작합니다>>>>>>>>>>");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(60, 110, 359, 15);
		f.getContentPane().add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(120, 148, 280, 30);
		f.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("번호");
		lblNewLabel_2.setFont(new Font("굴림", Font.PLAIN, 18));
		lblNewLabel_2.setBounds(74, 150, 36, 22);
		f.getContentPane().add(lblNewLabel_2);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(120, 188, 280, 30);
		f.getContentPane().add(textField_1);
		
		JLabel lblNewLabel_2_1 = new JLabel("날짜");
		lblNewLabel_2_1.setFont(new Font("굴림", Font.PLAIN, 18));
		lblNewLabel_2_1.setBounds(74, 190, 36, 22);
		f.getContentPane().add(lblNewLabel_2_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(120, 228, 280, 30);
		f.getContentPane().add(textField_2);
		
		JLabel lblNewLabel_2_2 = new JLabel("제목");
		lblNewLabel_2_2.setFont(new Font("굴림", Font.PLAIN, 18));
		lblNewLabel_2_2.setBounds(74, 230, 36, 22);
		f.getContentPane().add(lblNewLabel_2_2);
		
		JTextArea textArea = new JTextArea();
		textArea.setBackground(Color.PINK);
		textArea.setBounds(120, 268, 280, 120);
		f.getContentPane().add(textArea);
		
		JLabel lblNewLabel_2_2_1 = new JLabel("내용");
		lblNewLabel_2_2_1.setFont(new Font("굴림", Font.PLAIN, 18));
		lblNewLabel_2_2_1.setBounds(74, 273, 36, 22);
		f.getContentPane().add(lblNewLabel_2_2_1);
		
		JButton btnNewButton = new JButton("일기저장");
		btnNewButton.setBounds(120, 398, 80, 30);
		f.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("종료하기");
		btnNewButton_1.setBounds(320, 398, 80, 30);
		f.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("낙서장");
		btnNewButton_2.setBounds(222, 398, 80, 30);
		f.getContentPane().add(btnNewButton_2);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setBounds(60, 85, 328, -55);
		f.getContentPane().add(lblNewLabel_3);
		f.setVisible(true);
	}
}
