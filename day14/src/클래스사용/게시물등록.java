package 클래스사용;

import javax.swing.JOptionPane;

public class 게시물등록 {

	public static void main(String[] args) {
		BbsDB db = new BbsDB();
		String title = JOptionPane.showInputDialog("제목을 입력해주세요");
		String contents = JOptionPane.showInputDialog("내용을 입력해주세요.");
		
		db.create(title, contents);
	}

}
