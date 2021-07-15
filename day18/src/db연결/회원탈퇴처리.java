package db연결;

import javax.swing.JOptionPane;

public class 회원탈퇴처리 {

	public static void main(String[] args) throws Exception {
		String id = JOptionPane.showInputDialog("아이디 입력");

		MemberDAO db = new MemberDAO();
		db.delete(id);

	}

}
