package interfaceTest;

public class BbsDAO implements BbsDAOInterface {

	@Override
	public void create(int no, String title, String content) {
		System.out.println("bbs테이블에 jdbc 삽입 처리!!");
	}

	@Override
	public void delete(int no) {
		// TODO Auto-generated method stub
		
	}

	
}
