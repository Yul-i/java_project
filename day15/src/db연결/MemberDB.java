package db연결;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class MemberDB {
	// 자바에서 db 처리할 때는 DML 중심으로 클래스를 만든다.
	// DB연결 할 때는 DB를 단위로 연결한다.
	// DB연결하여 데이터 처리를 하는 클래스를 만들 때는 테이블 단위로 만든다.
	// 테이블(entity, 개체)
	// create(insert~into values)
	public void create(String id, String pw, String name, String tel) throws Exception {
		// 자바와 DB연결하는 프로그램(JDBC) 순서
		// 1. jdbc connector 설정
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1.connector 연결 성공!!");

		// 2. java에서 db로 연결 :
		// 연결할 주소 url (ip, port, db명), username, password
		String url = "jdbc:mysql://localhost:3306/shoes";
		String username = "root";
		String password = "1234";
		//부품을 리턴 해줌. (connection)을 리턴
		Connection con = DriverManager.getConnection(url, username, password);
		System.out.println("2.shoes db연결 성공!!!");

		// 3. SQL문을 만든다.
		String sql = "insert into member values (?,?,?,?)";
		//										('apple,'apple','apple','apple')
		// PrepareStatement : sql을 나타내는 부품.
		// 부품을 램에 넣어놓은 주소만 있으면 됨.
		// ps부품을 2단계에서 획득한 con부품이 만들어서 return.
		// sql의 객체이다.
		PreparedStatement ps = con.prepareStatement(sql);
		//?에 String으로 이 순서대로 넣어줘라.
		ps.setString(1, id);
		ps.setString(2, pw);
		ps.setString(3, name);
		ps.setString(4, tel);
		System.out.println("3.sql 생성  성공!!!!");

//		url이나 file은 new 선언해줘야 함. sql은 안해도 됨 ㅇ0ㅇ 신기방스
//		String url = "http://www.naver.com";
//		URL u = new URL(url);
//		String file = "c:/temp/test.text";
//		File file = new File();

		// 4. SQL문을 mysql로 전송한다.
		int result = ps.executeUpdate();
		System.out.println("4.SQL문 전송 성공!!!!!");
		System.out.println(result);//성공시 1 실패시 0 

	}// create end

	public void update(String id, String tel) throws Exception {
		// 자바와 DB연결하는 프로그램(JDBC) 순서
		// 1. jdbc connector 설정
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1.connector 연결 성공!!");

		// 2. java에서 db로 연결 :
		String url = "jdbc:mysql://localhost:3306/shoes";
		String username = "root";
		String password = "1234";
		Connection con = DriverManager.getConnection(url, username, password);
		System.out.println("2.shoes db연결 성공!!!");

		// 3. SQL문을 만든다.
		String sql = "update member set tel = ? where id = ?";		
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1,	tel);
		ps.setString(2,	id);
		System.out.println("3.sql 생성  성공!!!!");

		// 4. SQL문을 mysql로 전송한다.
		int result = ps.executeUpdate();
		System.out.println("4.SQL문 전송 성공!!!!!");
		System.out.println(result);

	}// update end

	public void delete(String id) throws Exception {
		// 자바와 DB연결하는 프로그램(JDBC) 순서
		// 1. jdbc connector 설정
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1.connector 연결 성공!!");

		// 2. java에서 db로 연결 :
		String url = "jdbc:mysql://localhost:3306/shoes";
		String username = "root";
		String password = "1234";
		Connection con = DriverManager.getConnection(url, username, password);
		System.out.println("2.shoes db연결 성공!!!");

		// 3. SQL문을 만든다.
		String sql = "delete from member where id = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, id);
		System.out.println("3.sql 생성  성공!!!!");

		// 4. SQL문을 mysql로 전송한다.
		int result = ps.executeUpdate();
		System.out.println("4.SQL문 전송 성공!!!!!");
		System.out.println(result);

	}// delete end

}// class end
