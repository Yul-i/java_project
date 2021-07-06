package 그래픽;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class 그래픽메인 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(1000, 500);

		
		JButton b1 = new JButton("나는 왼쪽");
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Left left = new Left();
				left.left();
				
			}
		});
		JButton b2 = new JButton("나는 오른쪽");
		b2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Right right = new Right();
				right.Right();
			}
		});
		JButton b3 = new JButton("나는 가운데");
		b3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Center center = new Center();
				center.Center();
				
			}
		});
		JButton b4 = new JButton("나는 아랫쪽");
		b4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Down down = new Down();
				down.down();
				
			}
		});
		JButton b5 = new JButton("나는 윗쪽");
		b5.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// b1을 눌렀을 때 처리하는 내용을 쓴다.
				Up up = new Up();
				up.up();//함수 호출 call  
			}
		});
		f.add(b1, BorderLayout.WEST);
		f.add(b2, BorderLayout.EAST);
		f.add(b3, BorderLayout.CENTER);
		f.add(b4, BorderLayout.SOUTH);
		f.add(b5, BorderLayout.NORTH);
		
		b1.setBackground(Color.yellow);
		b2.setBackground(Color.pink);
		b3.setBackground(Color.lightGray);
		b4.setBackground(Color.green);
		b5.setBackground(Color.orange);
		
		Font font = new Font("궁서", Font.BOLD, 30);
		b1.setFont(font);
		b2.setFont(font);
		b3.setFont(font);
		b4.setFont(font);
		b5.setFont(font);
		
		f.setVisible(true);
	}

}
