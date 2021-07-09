package 클래스사용;

import javax.swing.JOptionPane;

public class 회원탈퇴처리 {

	public static void main(String[] args) {
		MemberDB db = new MemberDB();
		
		String id = JOptionPane.showInputDialog("회원 탈퇴하실 id를 입력해주세요.");
		db.delete(id);
		

	}

}
