package 새창데이터전달;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Main {

	public static void main(String[] args) {
		JFrame f = new JFrame("main....!!! 여기서 시작");
		f.setSize(350, 200);
		FlowLayout flow = new FlowLayout();
		f.getContentPane().setLayout(flow);
		Font font = new Font("궁서", Font.BOLD, 45);
		JButton b1 = new JButton("새창 열기-1");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				새창1 w1 = new 새창1();
				w1.open1("너무 더워서");
//				f.setVisible(false);
			}
		});
		JButton b2 = new JButton("새창 열기-2");
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				새창2 w2 = new 새창2();
				w2.open2("너무 습해서");
			}
		});
		f.getContentPane().add(b1);
		f.getContentPane().add(b2);
		b1.setFont(font);
		b2.setFont(font);
		b1.setBackground(Color.green);
		b2.setBackground(Color.yellow);
		
		f.setVisible(true);
	}

}
