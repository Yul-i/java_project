package 그래픽프로그램;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Iterator;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JTextPane;

public class christmax {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.getContentPane().setLayout(null);
		f.setSize(400, 700);
		
		ImageIcon tree = new ImageIcon("tree.png");
		
		JLabel star = new JLabel("");
		star.setFont(new Font("굴림", Font.PLAIN, 30));
		star.setForeground(Color.ORANGE);
		star.setBounds(187, 21, 30, 55);
		f.getContentPane().add(star);
		
		JButton b1 = new JButton("★");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String top = JOptionPane.showInputDialog("트리에 달고싶은 장식 모양은?");
				star.setText(top);
			}
		});
		b1.setBounds(28, 592, 97, 40);
		f.getContentPane().add(b1);
		
		JButton b2 = new JButton("==");
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for (int i = 0; i < 10; i++) {
					System.out.print("=");
				}System.out.println();
			}
		});
		b2.setBounds(144, 592, 97, 40);
		f.getContentPane().add(b2);
		
		JButton b3 = new JButton("■");
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String family = JOptionPane.showInputDialog("선물 주려는 가족의 수는 몇명입니까?");
				int family2 = Integer.parseInt(family);
				for (int i = 0; i < family2; i++) {
					System.out.println("■");
				}
			} 
		});
		b3.setBounds(256, 592, 97, 40);
		f.getContentPane().add(b3);
		
		JLabel m = new JLabel("");
		m.setBounds(0, 0, 384, 561);
		f.getContentPane().add(m);
		m.setIcon(tree);
		
		
		
		f.setVisible(true);

	}
}
