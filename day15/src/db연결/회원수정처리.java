package db연결;

import javax.swing.JOptionPane;

public class 회원수정처리 {

	public static void main(String[] args) throws Exception {
		//String sql = "update member set tel = ? where id = ?";
		String id = JOptionPane.showInputDialog("수정할 아이디 입력");
		String tel = JOptionPane.showInputDialog("변경할 전화번호 입력");

		MemberDB db = new MemberDB();
		db.update(id, tel);

	}

}
