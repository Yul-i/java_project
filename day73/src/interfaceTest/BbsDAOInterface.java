package interfaceTest;

public interface BbsDAOInterface {
	
	//추상 메서드
	public void create(int no, String title, String content);
	public void delete(int no);
	
}
