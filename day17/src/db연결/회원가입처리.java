package db연결;

import javax.swing.JOptionPane;

public class 회원가입처리 {

	public static void main(String[] args) throws Exception {
		String id = JOptionPane.showInputDialog("아이디 입력");
		String pw = JOptionPane.showInputDialog("패스워드 입력");
		String name = JOptionPane.showInputDialog("이름 입력");
		String tel = JOptionPane.showInputDialog("전화번호 입력");

		MemberDAO db = new MemberDAO();
		db.create(id, pw, name, tel);

	}

}
