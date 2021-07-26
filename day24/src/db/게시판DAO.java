package db;

import dto.게시판Bag;

public class 게시판DAO {
	public void create(게시판Bag bag) {
		System.out.println("글 번호: "+bag.getId());
		System.out.println("글 제목: "+bag.getTitle());
		System.out.println("글 내용: "+bag.getContent());
		System.out.println("글 작가: "+bag.getWriter());
	}
}
