package db연결;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;

import com.mysql.fabric.xmlrpc.base.Member;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MemberUI {
	private static JTextField t1;
	private static JTextField t2;
	private static JTextField t3;
	private static JTextField t4;

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.getContentPane().setBackground(Color.LIGHT_GRAY);
		f.setSize(500, 500);
		f.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("회원 가입");
		lblNewLabel.setFont(new Font("돋움", Font.PLAIN, 30));
		lblNewLabel.setBounds(159, 25, 130, 35);
		f.getContentPane().add(lblNewLabel);

		JLabel m1 = new JLabel("아이디");
		m1.setForeground(Color.BLUE);
		m1.setFont(new Font("돋움", Font.PLAIN, 24));
		m1.setBounds(52, 88, 83, 35);
		f.getContentPane().add(m1);

		t1 = new JTextField();
		t1.setFont(new Font("굴림", Font.PLAIN, 24));
		t1.setBounds(165, 82, 225, 48);
		f.getContentPane().add(t1);
		t1.setColumns(10);

		JLabel m1_1 = new JLabel("패스워드");
		m1_1.setForeground(Color.BLUE);
		m1_1.setFont(new Font("돋움", Font.PLAIN, 24));
		m1_1.setBounds(52, 148, 104, 35);
		f.getContentPane().add(m1_1);

		t2 = new JTextField();
		t2.setFont(new Font("굴림", Font.PLAIN, 24));
		t2.setColumns(10);
		t2.setBounds(165, 142, 225, 48);
		f.getContentPane().add(t2);

		JLabel m1_2 = new JLabel("이름");
		m1_2.setForeground(Color.BLUE);
		m1_2.setFont(new Font("돋움", Font.PLAIN, 24));
		m1_2.setBounds(52, 208, 83, 35);
		f.getContentPane().add(m1_2);

		t3 = new JTextField();
		t3.setFont(new Font("굴림", Font.PLAIN, 24));
		t3.setColumns(10);
		t3.setBounds(165, 202, 225, 48);
		f.getContentPane().add(t3);

		JLabel m1_3 = new JLabel("전화번호");
		m1_3.setForeground(Color.BLUE);
		m1_3.setFont(new Font("돋움", Font.PLAIN, 24));
		m1_3.setBounds(52, 268, 104, 35);
		f.getContentPane().add(m1_3);

		t4 = new JTextField();
		t4.setFont(new Font("굴림", Font.PLAIN, 24));
		t4.setColumns(10);
		t4.setBounds(165, 262, 225, 48);
		f.getContentPane().add(t4);

		JButton b1 = new JButton("가입");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// T1~t4ㅇ 입력된 값 가지고 와야 함.
				String id = t1.getText();
				String pw = t2.getText();
				String name = t3.getText();
				String tel = t4.getText();
				// member 테이블에 저장하려고 함.
				// ==> 해결책 : 우리가 원하는 기능을 가진 메소드를 가지고 있는
				// 부품을 찾아야 함.
				// 램에 가져다 놓음
				MemberDAO db = new MemberDAO();
				try {
					int result = db.create(id, pw, name, tel);// 1
					if (result == 1) {
						JOptionPane.showMessageDialog(f, "회원가입 성공");
					} else {
						JOptionPane.showMessageDialog(f, "회원가입 실패");
					}
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				// 입력한거 지워버리자.
				t1.setText("");
				t2.setText("");
				t3.setText("");
				t4.setText("");
			}
		});
		b1.setBackground(Color.YELLOW);
		b1.setFont(new Font("굴림", Font.PLAIN, 24));
		b1.setBounds(52, 355, 104, 48);
		f.getContentPane().add(b1);

		JButton b2 = new JButton("탈퇴");
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// id를 입력 받아야 함
				String id = JOptionPane.showInputDialog(f, "탈퇴할 id입력");
				// db처리해야 함
				MemberDAO db = new MemberDAO();
				try {
					int result = db.delete(id);
					if (result == 1) {
						JOptionPane.showMessageDialog(f, "회원탈퇴 성공@@@");
					} else {
						JOptionPane.showMessageDialog(f, "없는 ID입니다.");
					}
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		b2.setFont(new Font("굴림", Font.PLAIN, 24));
		b2.setBackground(Color.ORANGE);
		b2.setBounds(185, 355, 104, 48);
		f.getContentPane().add(b2);

		JButton b3 = new JButton("수정");
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// id 입력 받기
				String id = JOptionPane.showInputDialog(f, "수정할 id입력");
				// tel 입력 받기
				String tel = JOptionPane.showInputDialog(f, "수정할 전화번호");
				// db 처리
				MemberDAO db = new MemberDAO();
				try {
					int result = db.update(id, tel);
					if (result==1) {
						JOptionPane.showMessageDialog(f, "전화번호 수정완료@@@");
					}else {
						JOptionPane.showMessageDialog(f, "없는 ID입니다.");
					}
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		b3.setFont(new Font("굴림", Font.PLAIN, 24));
		b3.setBackground(Color.CYAN);
		b3.setBounds(315, 355, 104, 48);
		f.getContentPane().add(b3);
		f.setVisible(true);
	}
}
