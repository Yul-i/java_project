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

public class 버튼다섯개 {

	public static void main(String[] args) {
		JFrame f = new JFrame("나의 버튼 5개");//제목 넣기
		f.setSize(500, 500);
		f.getContentPane().setLayout(new BorderLayout(0, 0));
		
		JButton btnNewButton = new JButton("북쪽");
		btnNewButton.setBackground(Color.ORANGE);
		btnNewButton.setFont(new Font("굴림", Font.BOLD, 35));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(f, "북쪽입니다.");
			}
		});
		f.getContentPane().add(btnNewButton, BorderLayout.NORTH);
		
		JButton btnNewButton_1 = new JButton("가운데");
		btnNewButton_1.setBackground(Color.PINK);
		btnNewButton_1.setForeground(Color.BLACK);
		btnNewButton_1.setFont(new Font("굴림", Font.BOLD, 35));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		f.getContentPane().add(btnNewButton_1, BorderLayout.CENTER);
		
		JButton btnNewButton_2 = new JButton("서쪽");
		btnNewButton_2.setBackground(Color.YELLOW);
		btnNewButton_2.setForeground(Color.BLACK);
		btnNewButton_2.setFont(new Font("굴림", Font.BOLD, 35));
		f.getContentPane().add(btnNewButton_2, BorderLayout.WEST);
		
		JButton btnNewButton_3 = new JButton("동쪽");
		btnNewButton_3.setBackground(Color.MAGENTA);
		btnNewButton_3.setForeground(Color.BLACK);
		btnNewButton_3.setFont(new Font("굴림", Font.BOLD, 35));
		f.getContentPane().add(btnNewButton_3, BorderLayout.EAST);
		
		JButton btnNewButton_4 = new JButton("남쪽");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(f, "남쪽입니다.");
			}
		});
		btnNewButton_4.setBackground(Color.ORANGE);
		btnNewButton_4.setFont(new Font("굴림", Font.BOLD, 35));
		f.getContentPane().add(btnNewButton_4, BorderLayout.SOUTH);
		
		f.setVisible(true);
	}
}
