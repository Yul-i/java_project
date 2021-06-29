package 그래픽프로그램;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.BorderLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JLabel;

public class 버튼3개2 {

	public static void main(String[] args) {
		JFrame f = new JFrame("나의 버튼 5개");//제목 넣기
		f.getContentPane().setBackground(Color.GREEN);
		f.setSize(500, 500);
		f.getContentPane().setLayout(null);
		
		JButton b = new JButton("");
		b.setBounds(12, 10, 460, 205);//x,y좌표+크기
		f.getContentPane().add(b);//추가
		
		JLabel m = new JLabel("");
		m.setBounds(12, 220, 460, 231);
		f.getContentPane().add(m);
		
		
		ImageIcon racoon1 = new ImageIcon("racoon1.jpg");
		ImageIcon racoon2 = new ImageIcon("racoon2.jpg");
		b.setIcon(racoon2);
		m.setIcon(racoon1);
		
		f.setVisible(true);
	}
}
