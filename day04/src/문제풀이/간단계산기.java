package 문제풀이;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 간단계산기 {
	private static JTextField t1;
	private static JTextField t2;

	public static void main(String[] args) {
		JFrame f =new JFrame();
		f.setSize(400,500);
		f.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("계산기");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("돋움", Font.BOLD, 28));
		lblNewLabel.setBounds(96, 40, 183, 56);
		f.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("숫자1");
		lblNewLabel_1.setForeground(Color.BLUE);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("돋움", Font.BOLD, 24));
		lblNewLabel_1.setBounds(34, 131, 106, 56);
		f.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("숫자2");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setForeground(Color.BLUE);
		lblNewLabel_1_1.setFont(new Font("돋움", Font.BOLD, 24));
		lblNewLabel_1_1.setBounds(34, 220, 106, 56);
		f.getContentPane().add(lblNewLabel_1_1);
		
		t1 = new JTextField();
		t1.setForeground(Color.RED);
		t1.setBackground(Color.ORANGE);
		t1.setFont(new Font("굴림", Font.PLAIN, 28));
		t1.setBounds(141, 131, 183, 56);
		f.getContentPane().add(t1);
		t1.setColumns(10);
		
		t2 = new JTextField();
		t2.setForeground(Color.RED);
		t2.setFont(new Font("굴림", Font.PLAIN, 28));
		t2.setColumns(10);
		t2.setBackground(Color.ORANGE);
		t2.setBounds(141, 220, 183, 56);
		f.getContentPane().add(t2);
		
		JButton btnNewButton = new JButton("더하기");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s1 = t1.getText();
				String s2 = t2.getText();
				int s11 = Integer.parseInt(s1);
				int s22 = Integer.parseInt(s2);
				
				int sum = s11+s22;
				JOptionPane.showMessageDialog(null, s11+"+"+s22+"="+sum+" 입니다.");
			}
		});
		btnNewButton.setFont(new Font("돋움", Font.PLAIN, 24));
		btnNewButton.setBounds(57, 322, 120, 56);
		f.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("빼기");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s1 = t1.getText();
				String s2 = t2.getText();
				int s11 = Integer.parseInt(s1);
				int s22 = Integer.parseInt(s2);
				
				int minus = s11-s22;
				JOptionPane.showMessageDialog(null, s11+"-"+s22+"="+minus+" 입니다.");
			}
		});
		btnNewButton_1.setFont(new Font("돋움", Font.PLAIN, 24));
		btnNewButton_1.setBounds(204, 322, 120, 56);
		f.getContentPane().add(btnNewButton_1);
		
		f.setVisible(true);

	}

}
