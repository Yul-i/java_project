package 클래스사용;

import javax.swing.JOptionPane;

public class 게시물삭제 {

	public static void main(String[] args) {
		BbsDB db = new BbsDB();
		String title = JOptionPane.showInputDialog("삭제할 글 제목을 입력해주세요.");
		db.delete(title);

	}

}
