package interfaceTest;

public class MemberDAO implements MemberDAOInterface {
	
	
	@Override
	public int insert(String id, String pw, String name, String tel) {
		//jdbc 4단계
		return 1;
	}
	
	@Override
	public int update(String id, String tel) {
		//jdbc 4단계
		return 1;
	}
	
	@Override
	public int delete(String id) {
		//jdbc 4단계
		return 1;
	}
	
	@Override
	public String read(String id) {
		//jdbc 4단계
		return "ok";
	}
}
