package shop.ui;

import javax.swing.JOptionPane;

import shop.db.게시판DAO;
import shop.dto.게시판Bag;

public class 게시판UI {

	public static void main(String[] args) {
		//1. 게시판 정보 입력 받아서
		String id = JOptionPane.showInputDialog("글 번호");
		String title = JOptionPane.showInputDialog("글 제목");
		String content = JOptionPane.showInputDialog("글 내용");
		String writer = JOptionPane.showInputDialog("글 작가");
		
		//2. 가방을 만들어서, 입력 받은 데이터를 넣으세요.
		게시판Bag bag = new 게시판Bag();
		bag.setId(id);
		bag.setTitle(title);
		bag.setContent(content);
		bag.setWriter(writer);
		
		//3. DAO를 만들어서, dao에게 create 기능을 호출(가방을 전달)
		게시판DAO	dao = new 게시판DAO();
		dao.create(bag);

		//4. 전달 잘 되었나 확인
		System.out.println(bag);
	}

}
