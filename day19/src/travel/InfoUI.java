package travel;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class InfoUI {

	public void show() throws Exception {
		/**
		 * @wbp.parser.entryPoint
		 */
		
		JFrame f = new JFrame();
		f.setSize(1200, 800);
		f.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("뚱이.png"));
		lblNewLabel.setBounds(-73, 0, 526, 761);
		f.getContentPane().add(lblNewLabel);

		JLabel l1 = new JLabel("아이디");
		l1.setFont(new Font("굴림", Font.PLAIN, 30));
		l1.setBounds(455, 139, 177, 55);
		f.getContentPane().add(l1);

		JLabel l2 = new JLabel("비밀번호");
		l2.setFont(new Font("굴림", Font.PLAIN, 30));
		l2.setBounds(455, 204, 177, 55);
		f.getContentPane().add(l2);

		JLabel l3 = new JLabel("이름");
		l3.setFont(new Font("굴림", Font.PLAIN, 30));
		l3.setBounds(455, 269, 177, 55);
		f.getContentPane().add(l3);

		JLabel l4 = new JLabel("생년월일");
		l4.setFont(new Font("굴림", Font.PLAIN, 30));
		l4.setBounds(455, 334, 177, 55);
		f.getContentPane().add(l4);

		JLabel l5 = new JLabel("성별");
		l5.setFont(new Font("굴림", Font.PLAIN, 30));
		l5.setBounds(455, 399, 177, 55);
		f.getContentPane().add(l5);

		JLabel l6 = new JLabel("이메일");
		l6.setFont(new Font("굴림", Font.PLAIN, 30));
		l6.setBounds(455, 464, 177, 55);
		f.getContentPane().add(l6);

		JLabel lblNewLabel_1 = new JLabel("회원정보 페이지");
		lblNewLabel_1.setFont(new Font("굴림", Font.PLAIN, 40));
		lblNewLabel_1.setBounds(613, 32, 489, 62);
		f.getContentPane().add(lblNewLabel_1);

		JLabel l7 = new JLabel("");
		l7.setFont(new Font("굴림", Font.PLAIN, 25));
		l7.setBounds(660, 139, 311, 55);
		f.getContentPane().add(l7);
	
		String id = JOptionPane.showInputDialog("검색할 아이디 입력");
		MemberDAO db = new MemberDAO();
		String[] result = db.read(id);
		
		
		l7.setText(id);
		
		JLabel l8 = new JLabel("");
		l8.setFont(new Font("굴림", Font.PLAIN, 25));
		l8.setBounds(660, 204, 311, 55);
		f.getContentPane().add(l8);
		
		String pw =result[1];
		l8.setText(pw);
		
		JLabel l9 = new JLabel("");
		l9.setFont(new Font("굴림", Font.PLAIN, 25));
		l9.setBounds(660, 269, 311, 55);
		f.getContentPane().add(l9);
		String name =result[2];
		l9.setText(name);
		
		JLabel l10 = new JLabel("");
		l10.setFont(new Font("굴림", Font.PLAIN, 25));
		l10.setBounds(660, 334, 311, 55);
		f.getContentPane().add(l10);
		String date_birth =result[3];
		l10.setText(date_birth);

		JLabel l11 = new JLabel("");
		l11.setFont(new Font("굴림", Font.PLAIN, 25));
		l11.setBounds(660, 399, 311, 55);
		f.getContentPane().add(l11);
		String gender =result[4];
		l11.setText(gender);

		JLabel l12 = new JLabel("");
		l12.setFont(new Font("굴림", Font.PLAIN, 25));
		l12.setBounds(660, 464, 311, 55);
		f.getContentPane().add(l12);
		String email =result[5];
		l12.setText(email);

		JButton b1 = new JButton("수정");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String id = JOptionPane.showInputDialog("아이디를 입력하세요");
				String pw = JOptionPane.showInputDialog("수정하고 싶은 비밀번호를 입력하세요");
				String name = JOptionPane.showInputDialog("수정하고 싶은 이름을 입력하세요");
				String date_birth = JOptionPane.showInputDialog("수정하고 싶은 생년월일을 입력하세요");
				String gender = JOptionPane.showInputDialog("수정하고 싶은 성별을 입력하세요");
				String email = JOptionPane.showInputDialog("수정하고 싶은 이메일을 입력하세요");

				MemberDAO db = new MemberDAO();
				try {
					int result = db.update(id, pw, name, date_birth, gender, email);
					if (result == 1) {
						db.read(id);
						JOptionPane.showMessageDialog(f, "수정 성공");
						l7.setText(id);
						l8.setText(pw);
						l9.setText(name);
						l10.setText(date_birth);
						l11.setText(gender);
						l12.setText(email);
					} else {
						JOptionPane.showMessageDialog(f, "수정 실패");
					}

				} catch (Exception e1) {
					e1.printStackTrace();

				}
			f.setVisible(true);}
			
			
		});
		b1.setFont(new Font("굴림", Font.PLAIN, 50));
		b1.setBounds(455, 621, 339, 82);
		f.getContentPane().add(b1);

		JButton b2 = new JButton("회원탈퇴");
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id = JOptionPane.showInputDialog("탈퇴할 아이디 입력");

				MemberDAO db = new MemberDAO();

				try {
					int result = db.delete(id); // 1
					if (result == 1) {
						JOptionPane.showMessageDialog(f, "탈퇴 성공");
					} else {
						JOptionPane.showMessageDialog(f, "탈퇴실패");
					}
				} catch (Exception e2) {
					e2.printStackTrace();
				}

			}
		});
		b2.setFont(new Font("굴림", Font.PLAIN, 50));
		b2.setBounds(815, 621, 357, 82);
		f.getContentPane().add(b2);

		f.setVisible(true);

	}
}
