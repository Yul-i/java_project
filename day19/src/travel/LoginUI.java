package travel;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class LoginUI {
	private static JTextField t1;
	private static JTextField t2;
	
	/**
	 * @wbp.parser.entryPoint
	 */
	public static void show() {
		JFrame f = new JFrame();
		
		f.setSize(1200, 800);
		f.getContentPane().setLayout(null);
	
		JLabel lblNewLabel = new JLabel("로그인");
		lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 60));
		lblNewLabel.setBounds(168, 150, 270, 98);
		f.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("패스워드");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1.setFont(new Font("Lucida Grande", Font.PLAIN, 60));
		lblNewLabel_1.setBounds(168, 320, 288, 98);
		f.getContentPane().add(lblNewLabel_1);
		
		t1 = new JTextField();
		t1.setFont(new Font("Lucida Grande", Font.PLAIN, 60));
		t1.setBounds(486, 150, 545, 98);
		f.getContentPane().add(t1);
		t1.setColumns(10);
		
		t2 = new JTextField();
		t2.setFont(new Font("Lucida Grande", Font.PLAIN, 60));
		t2.setColumns(10);
		t2.setBounds(486, 320, 545, 98);
		f.getContentPane().add(t2);
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton btnNewButton = new JButton("로그인");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int id_auth = 0; // 1: 계정 인증 성공, 2: 계정 인증 실패
				String mem_id = t1.getText();
				String password = t2.getText();
				
				try {
					id_auth = MemberDAO.auth(mem_id, password);
					if (id_auth == 1) { // 계정 인증이 성공하게 되면
						JOptionPane.showMessageDialog(f, "로그인 성공");
						MainPageUI.show(); // 메인페이지 호출
						f.setVisible(false); // 로그인 프레임 숨기기
					} else { 
						JOptionPane.showMessageDialog(f, "로그인 실패");
					}
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		btnNewButton.setFont(new Font("Lucida Grande", Font.PLAIN, 60));
		btnNewButton.setBounds(168, 513, 391, 138);
		f.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("회원가입");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//회원가입 페이지로 이동
				JoinUI.joins();
				//f.setVisible(false);
			}
		});
		btnNewButton_1.setFont(new Font("Lucida Grande", Font.PLAIN, 60));
		btnNewButton_1.setBounds(621, 513, 391, 138);
		f.getContentPane().add(btnNewButton_1);
		

		f.setVisible(true);

	}

}
