package interfaceTest;

public interface MemberDAOInterface {
	
	//불완전한 메서드 => 추상메서드만!
	//규칙만 정의한 문서역할
	
	public abstract int insert(String id, String pw, String name, String tel);

	abstract int update(String id, String tel);

	public int delete(String id);

	String read(String id);

}