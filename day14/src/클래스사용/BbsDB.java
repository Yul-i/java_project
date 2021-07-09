package 클래스사용;

public class BbsDB {
	public void create(String title, String contents) {
		System.out.println("제목 : "+title);
		System.out.println("내용 : "+contents);
	}
	
	public void delete(String title) {
		System.out.println(title+" 글이 삭제 되었습니다.");
	}
}
