package db연결;

public class DBMain {
	public static void main(String[] args) throws Exception {
		MemberDAO db = new MemberDAO();
		db.create();
	}
}
