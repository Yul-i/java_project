package db연결;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class MemberDAO {
	
	public int create(String id, String pw, String name, String tel) throws Exception {

		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1.connector 연결 성공!!");

	
		String url = "jdbc:mysql://localhost:3306/book";
		String username = "root";
		String password = "1234";
		
		Connection con = DriverManager.getConnection(url, username, password);
		System.out.println("2.book db연결 성공!!!");

		
		String sql = "insert into member values (?,?,?,?)";
		
		PreparedStatement ps = con.prepareStatement(sql);//스트림을 부품으로 만듬 SQL문 객체
		
		ps.setString(1, id);
		ps.setString(2, pw);
		ps.setString(3, name);
		ps.setString(4, tel);
		System.out.println("3.sql 생성  성공!!!!");

		int result = ps.executeUpdate();//sql문의 결과 return 받아옴
		System.out.println("4.SQL문 전송 성공!!!!!");
		System.out.println("sql문 수행 개수 "+result+"개");
		
		return result;

	}// create end

	public int update(String id, String tel) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1.connector 연결 성공!!");

		String url = "jdbc:mysql://localhost:3306/book";
		String username = "root";
		String password = "1234";
		Connection con = DriverManager.getConnection(url, username, password);
		System.out.println("2.book db연결 성공!!!");


		String sql = "update member set tel = ? where id = ?";		
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1,	tel);
		ps.setString(2,	id);
		System.out.println("3.sql 생성  성공!!!!");


		int result = ps.executeUpdate();
		System.out.println("4.SQL문 전송 성공!!!!!");
		System.out.println(result);
		
		return result;

	}// update end

	public int delete(String id) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1.connector 연결 성공!!");

		String url = "jdbc:mysql://localhost:3306/book";
		String username = "root";
		String password = "1234";
		Connection con = DriverManager.getConnection(url, username, password);
		System.out.println("2.book db연결 성공!!!");

		String sql = "delete from member where id = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, id);
		System.out.println("3.sql 생성  성공!!!!");

		int result = ps.executeUpdate();
		System.out.println("4.SQL문 전송 성공!!!!!");
		System.out.println(result);
		
		return result;

	}// delete end

}// class end
