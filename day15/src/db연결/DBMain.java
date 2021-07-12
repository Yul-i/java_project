package db연결;

public class DBMain {
	public static void main(String[] args) throws Exception {
		MemberDB db = new MemberDB();
		db.create();
	}
}
