package travel;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class MemberDAO {

	public static int auth(String mem_id, String password) throws Exception {
		// JDBC 연결
		Class.forName("com.mysql.jdbc.Driver");

		// DB 연결
		String url = "jdbc:mysql://localhost:3306/travelDB";
		String db_id = "root";
		String db_pw = "1234";
		Connection con = DriverManager.getConnection(url, db_id, db_pw);

		// SQL 문
		String sql = "SELECT mem_id, password FROM member WHERE mem_id = ? and password = ?";
		//String sql = "SELECT mem_id, password FROM member";
		PreparedStatement pst = con.prepareStatement(sql);
		
		pst.setString(1,mem_id);
		pst.setString(2,password);
		
		ResultSet rs = pst.executeQuery();
	
		int result = 0; 
		if(rs.next()) { // 만약에 읽어올 레코드가 있다면
			System.out.println("로그인 성공");
			result++;
		}else {
			System.err.println("로그인 실패");
		}
		
		return result;
	}
	
	public int create(String id, String pw, String name, String date_birth, String gender, String email)
			throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. connector연결 성공!!!");

		String url = "jdbc:mysql://localhost:3306/travelDB";
		String username = "root";
		String password = "1234";
		Connection con = DriverManager.getConnection(url, username, password);
		System.out.println("2. travelDB db연결 성공!!!");

		String sql = "insert into member values (?, ?, ?, ?, ?, ?)";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, id);
		ps.setString(2, pw);
		ps.setString(3, name);
		ps.setString(4, date_birth);
		ps.setString(5, gender);
		ps.setString(6, email);
		System.out.println("3. sql문 생성 성공!!!");
		int result = ps.executeUpdate();
		System.out.println("4. sql문 전송 전송");
		System.out.println("SQL문 수행 개수 " + result + "개");
		return result;

	}// create end
		// update start

	public int update(String id, String pw, String name, String date_birth, String gender, String email)
			throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. connector연결 성공!!!");

		String url = "jdbc:mysql://localhost:3306/travelDB";
		String username = "root";
		String password1 = "1234";
		Connection con = DriverManager.getConnection(url, username, password1);
		System.out.println("2. travelDB db연결 성공!!!");

		String sql = "update member set password = ?, name =?, date_birth =?, gender =?, email =? where mem_id= ?";
		// PrepareStatment : sql을 나타내는 부품.
		// 부품을 램에 넣어놓은 주소만 잇으면 됨.
		// ps부품을 2단계에서 획득한 con부품이 만들어서 return.!
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, pw);
		ps.setString(2, name);
		ps.setString(3, date_birth);
		ps.setString(4, gender);
		ps.setString(5, email);
		ps.setString(6, id);
		
		
		
		System.out.println("3. sql문 생성 성공!!!");

		int result = ps.executeUpdate();
		System.out.println("4. sql문 전송 전송");
		System.out.println(result);
		return result;
		
		

	}// update end
		// delete start

	public int delete(String id) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. connector연결 성공!!!");

		String url = "jdbc:mysql://localhost:3306/travelDB";
		String username = "root";
		String password = "1234";
		Connection con = DriverManager.getConnection(url, username, password);
		System.out.println("2. travelDB db연결 성공!!!");

		String sql = "delete from member where mem_id = ?"; // 1
		// PrepareStatment : sql을 나타내는 부품.
		// 부품을 램에 넣어놓은 주소만 잇으면 됨.
		// ps부품을 2단계에서 획득한 con부품이 만들어서 return.!
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, id);
		System.out.println("3. sql문 생성 성공!!!");
//		String url = "http://www.naver.com";
//		URL u = new URL(url);
//		String file = "c:/temp/test.txt";
//		File file2 = new File(file);

		// 4. sql문을 mysql로 전송한다.
		int result = ps.executeUpdate();
		System.out.println("4. sql문 전송 전송");
		System.out.println(result);
		return result;

	}// create end
		// read start

	public String[] read(String mem_id) throws Exception {
		// 자바와 db연결하는 프로그램(JDBC) 순서
		// 1. jdbc connector설정
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. connector연결 성공!!!");

		// 2. java에서 db로 연결:
		// 연결할 주소url(ip, port, db명), username, password
		String url = "jdbc:mysql://localhost:3306/travelDB";
		String username = "root";
		String password = "1234";
		Connection con = DriverManager.getConnection(url, username, password);
		System.out.println("2. travelDB db연결 성공!!!");

		// 3. sql문을 만든다.
		String sql = "select * from member where mem_id = ?"; // 1
		// PrepareStatment : sql을 나타내는 부품.
		// 부품을 램에 넣어놓은 주소만 잇으면 됨.
		// ps부품을 2단계에서 획득한 con부품이 만들어서 return.!
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, mem_id);
		System.out.println("3. sql문 생성 성공!!!");
//		String url = "http://www.naver.com";
//		URL u = new URL(url);
//		String file = "c:/temp/test.txt";
//		File file2 = new File(file);

		// 4. sql문을 mysql로 전송한다.
		ResultSet rs = ps.executeQuery(); // executeupdate()하면 무조건 int임
											// read는 resultset, executequery를 사용
		System.out.println("4. sql문 전송 전송");
		// System.out.println(rs.next());
		String[] result = new String[6];
		// {"apple","apple","apple","pineapple"}이 리턴된다.
		if (rs.next()) {
			// 테이블에 검색 결과가 있다라는 얘기
			String mem_id2 = rs.getString(1);
			String pw = rs.getString(2);
			String name = rs.getString(3);
			String date_birth = rs.getString(4);
			String gender = rs.getString(5);
			String email = rs.getString(6);

			System.out.println(
					mem_id2 + " " + pw + " " + name + " " + name + " " + date_birth + " " + gender + " " + email);
			result[0] = mem_id2;
			result[1] = pw;
			result[2] = name;
			result[3] = date_birth;
			result[4] = gender;
			result[5] = email;
		}
		return result;

	}// read end
}
