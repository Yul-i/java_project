package travel;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class JoinUI {
	private static JTextField t1;
	private static JTextField t2;
	private static JTextField t3;
	private static JTextField t4;
	private static JTextField t5;
	private static JTextField t6;
	private static JTextField t7;

	public static void joins() {
		JFrame f = new JFrame();
		f.setSize(1200, 800);
		f.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("회원가입");
		lblNewLabel.setFont(new Font("굴림", Font.PLAIN, 40));
		lblNewLabel.setBounds(512, 20, 672, 55);
		f.getContentPane().add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("아이디*");
		lblNewLabel_1.setFont(new Font("굴림", Font.PLAIN, 30));
		lblNewLabel_1.setBounds(170, 121, 177, 55);
		f.getContentPane().add(lblNewLabel_1);

		JLabel lblNewLabel_1_1 = new JLabel("비밀번호*");
		lblNewLabel_1_1.setFont(new Font("굴림", Font.PLAIN, 30));
		lblNewLabel_1_1.setBounds(170, 186, 177, 55);
		f.getContentPane().add(lblNewLabel_1_1);

		JLabel lblNewLabel_1_2 = new JLabel("이름*");
		lblNewLabel_1_2.setFont(new Font("굴림", Font.PLAIN, 30));
		lblNewLabel_1_2.setBounds(170, 316, 177, 55);
		f.getContentPane().add(lblNewLabel_1_2);

		JLabel lblNewLabel_1_3 = new JLabel("생년월일");
		lblNewLabel_1_3.setFont(new Font("굴림", Font.PLAIN, 30));
		lblNewLabel_1_3.setBounds(170, 381, 177, 55);
		f.getContentPane().add(lblNewLabel_1_3);

		JLabel lblNewLabel_1_4 = new JLabel("성별");
		lblNewLabel_1_4.setFont(new Font("굴림", Font.PLAIN, 30));
		lblNewLabel_1_4.setBounds(170, 446, 177, 55);
		f.getContentPane().add(lblNewLabel_1_4);

		JLabel lblNewLabel_1_5 = new JLabel("이메일");
		lblNewLabel_1_5.setFont(new Font("굴림", Font.PLAIN, 30));
		lblNewLabel_1_5.setBounds(170, 511, 177, 55);
		f.getContentPane().add(lblNewLabel_1_5);

		t1 = new JTextField();
		t1.setFont(new Font("굴림", Font.PLAIN, 30));
		t1.setBounds(359, 121, 592, 55);
		f.getContentPane().add(t1);
		t1.setColumns(10);

		t2 = new JTextField();
		t2.setFont(new Font("굴림", Font.PLAIN, 30));
		t2.setColumns(10);
		t2.setBounds(359, 186, 592, 55);
		f.getContentPane().add(t2);

		t3 = new JTextField();
		t3.setFont(new Font("굴림", Font.PLAIN, 30));
		t3.setColumns(10);
		t3.setBounds(359, 316, 592, 55);
		f.getContentPane().add(t3);

		t4 = new JTextField();
		t4.setFont(new Font("굴림", Font.PLAIN, 30));
		t4.setColumns(10);
		t4.setBounds(359, 381, 592, 55);
		f.getContentPane().add(t4);

		t5 = new JTextField();
		t5.setFont(new Font("굴림", Font.PLAIN, 30));
		t5.setColumns(10);
		t5.setBounds(359, 446, 592, 55);
		f.getContentPane().add(t5);

		t6 = new JTextField();
		t6.setFont(new Font("굴림", Font.PLAIN, 30));
		t6.setColumns(10);
		t6.setBounds(359, 511, 592, 55);
		f.getContentPane().add(t6);

		JButton btnNewButton = new JButton("회원가입하기");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// t1~t6에 입력된 값을 가져온다.
				String id = t1.getText();
				String pw = t2.getText();
				String name = t3.getText();
				String dateBirth = t4.getText();
				String gender = t5.getText();
				String email = t6.getText();
				String confirm_pw = t7.getText();
				// 이것을 member테이블에 저장해야한다.

				MemberDAO db = new MemberDAO();

				if (pw.equals(confirm_pw)) {

					if (id.length() == 0) {
						JOptionPane.showMessageDialog(f, "아이디를 입력해주세요");
						t1.setText("");
						t2.setText("");
						t3.setText("");
						t7.setText("");

					} else if (pw.length() == 0) {
						JOptionPane.showMessageDialog(f, "비밀번호를 입력해주세요");
						t1.setText("");
						t2.setText("");
						t3.setText("");
						t7.setText("");
					} else if (confirm_pw.length() == 0) {
						JOptionPane.showMessageDialog(f, "비번확인을 입력해주세요");
						t1.setText("");
						t2.setText("");
						t3.setText("");
						t7.setText("");

					} else if (name.length() == 0) {
						JOptionPane.showMessageDialog(f, "이름을 입력해주세요");
						t1.setText("");
						t2.setText("");
						t3.setText("");
						t7.setText("");
					}

					else {

						try {
							int result = db.create(id, pw, name, dateBirth, gender, email);
							if (result == 1) {
								JOptionPane.showMessageDialog(f, "회원가입 성공");
								f.setVisible(false);
							} else {
								JOptionPane.showMessageDialog(f, "회원가입 실패");
							}
						} catch (Exception e2) {
							// TODO: handle exception
							e2.printStackTrace();

						}

					}
				} else {
					JOptionPane.showMessageDialog(f, "비밀번호가 일치하지 않습니다.");
				};
				// 입력한 텍스트값을 공백으로 지워버리기.
				t1.setText("");
				t2.setText("");
				t3.setText("");
				t4.setText("");
				t5.setText("");
				t6.setText("");
				t7.setText("");

			}
		});
		btnNewButton.setFont(new Font("굴림", Font.PLAIN, 30));
		btnNewButton.setBounds(359, 593, 592, 92);
		f.getContentPane().add(btnNewButton);

		JLabel lblNewLabel_2 = new JLabel("* : 필수입력사항");
		lblNewLabel_2.setFont(new Font("굴림", Font.PLAIN, 20));
		lblNewLabel_2.setBounds(170, 576, 152, 40);
		f.getContentPane().add(lblNewLabel_2);

		t7 = new JTextField();
		t7.setFont(new Font("굴림", Font.PLAIN, 30));
		t7.setColumns(10);
		t7.setBounds(359, 251, 592, 55);
		f.getContentPane().add(t7);

		JLabel lblNewLabel_1_1_1 = new JLabel("비번확인*");
		lblNewLabel_1_1_1.setFont(new Font("굴림", Font.PLAIN, 30));
		lblNewLabel_1_1_1.setBounds(170, 251, 177, 55);
		f.getContentPane().add(lblNewLabel_1_1_1);

		f.setVisible(true);
	}
}
