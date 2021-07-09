package 클래스사용;

import java.sql.DriverManager;

public class MemberDB {
	// DB작업
	// 1. DB, 테이블 생성
	// 2. 데이터 조작(CRUD : CREATE, READ, UPDATE, DELETE)

	String ip = "localhost";// 내 ip 자동으로 들어감 or ex) 127.0.0.1
	String port = "3306";
	String user = "root";
	String pass = "1234";

	public void login(String id, String pw) {
		// 회원가입시 사용한 id가 apple, pw는 1111
		if (id.equals("apple") && pw.equals("1111")) {
			System.out.println("로그인 성공!");
		} else {

			System.out.println("로그인 실패!");
		}
	}

	public void create(String id, String pw, String name, String tel) throws Exception {
		// DB연결해야 함
		// 1) 연결할 mysql server 정보가 필요
		// 2) 연결할 mysql server에 승인을 받아야 함. 필요한 정보 : id, pw

		System.out.println(ip + port + "에 연결 되었습니다.");
		System.out.println("회원가입 처리");
		System.out.println("도착한 id는 " + id);
		System.out.println("도착한 pw는 " + pw);
		System.out.println("도착한 name는 " + name);
		System.out.println("도착한 tel는 " + tel);
		// JAVA와 mysql과의 연결 순서 정해져있음.(JDBC 프로그래밍)
		// JAVA DB Connectivity
		// 1. connector 설정
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. 커넥터 설정 성공!!");
		// 2. mysql server의 db와 연결하고 승인을 받자
		// jdbc:mysql://localhost:3306/shoes
		String url = "jdbc:mysql://" + ip + ":" + port + "/shoes";
		DriverManager.getConnection(url, user, pass);
		System.out.println("2. mysql 서버 승인/연결 성공!!");
		// 3. sql을 만들자
		// 4. sql을 mysql server에게 전송
	}

	public void read(String id) {
		System.out.println("회원정보 검색 처리");
	}

	public void update() {
		System.out.println("회원정보 수정 처리");
	}

	public void delete(String id) {
		System.out.println("회원탈퇴 처리");
		System.out.println(id + "님의 탈퇴가 완료되었습니다.");
	}
}
