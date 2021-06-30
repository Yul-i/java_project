package 그래픽;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 로그인 {
	private static JTextField t1;
	private static JTextField t2;

	public static void main(String[] args) {
		
		String id = "root";
		String pw = "1111";
		
		
		JFrame f = new JFrame();
		f.getContentPane().setBackground(Color.PINK);
		f.getContentPane().setLayout(null);
		
		JLabel l1 = new JLabel("아이디 : ");
		l1.setFont(new Font("굴림", Font.PLAIN, 30));
		l1.setBounds(35, 135, 120, 57);
		f.getContentPane().add(l1);
		
		JLabel l2 = new JLabel("패스워드 :");
		l2.setFont(new Font("굴림", Font.PLAIN, 30));
		l2.setBounds(35, 220, 140, 57);
		f.getContentPane().add(l2);
		
		JLabel l3 = new JLabel("");
		l3.setForeground(Color.RED);
		l3.setFont(new Font("굴림", Font.PLAIN, 30));
		l3.setBounds(110, 431, 251, 57);
		f.getContentPane().add(l3);
		
		t1 = new JTextField();
		t1.setFont(new Font("굴림", Font.PLAIN, 24));
		t1.setBounds(192, 135, 241, 57);
		f.getContentPane().add(t1);
		t1.setColumns(10);
		
		t2 = new JTextField();
		t2.setFont(new Font("굴림", Font.PLAIN, 24));
		t2.setColumns(10);
		t2.setBounds(192, 220, 241, 57);
		f.getContentPane().add(t2);
		
		JButton b1 = new JButton("로그인 확인");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id1 = t1.getText();
				String pw1 = t2.getText();
				
				if (id.equals(id1)&&pw.equals(pw1)) {
					l3.setText("로그인 성공");
				}else {
					l3.setText("로그인 실패");
				}
			}
		});
		b1.setFont(new Font("굴림", Font.PLAIN, 24));
		b1.setBackground(Color.ORANGE);
		b1.setForeground(Color.BLACK);
		b1.setBounds(35, 346, 190, 63);
		f.getContentPane().add(b1);
		
		JButton b2 = new JButton("지우기");
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				t1.setText("");
				t2.setText("");
			}
		});
		b2.setForeground(Color.BLACK);
		b2.setFont(new Font("굴림", Font.PLAIN, 24));
		b2.setBackground(Color.ORANGE);
		b2.setBounds(243, 346, 190, 63);
		f.getContentPane().add(b2);
		f.setSize(500, 600);
		
		f.setVisible(true);
	}
}
