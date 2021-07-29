package shop.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import shop.dto.게시판Bag;

public class 게시판DAO {
	public void create(게시판Bag bag) {
		System.out.println("글 번호: "+bag.getId());
		System.out.println("글 제목: "+bag.getTitle());
		System.out.println("글 내용: "+bag.getContent());
		System.out.println("글 작가: "+bag.getWriter());
		
		try {
			//자바와 db연결하는 프로그램(JDBC) 순서
			  //1. jdbc connector설정
			  Class.forName("com.mysql.jdbc.Driver");
			  System.out.println("1. connector연결 성공!!!");
			  
			  //2. java에서 db로 연결: 
			  //   연결할 주소url(ip, port, db명), username, password
			  String url = "jdbc:mysql://localhost:3306/shop";
			  String username = "root";
			  String password = "1234";
			  Connection con = DriverManager.getConnection(url, username, password);
			  System.out.println("2. shoes db연결 성공!!!");
			  
			  //3. sql문을 만든다.
			  String sql = "insert into board values (?, ?, ?, ?)";
			  PreparedStatement ps = con.prepareStatement(sql);
			  ps.setString(1, bag.getId());
			  ps.setString(2, bag.getTitle());
			  ps.setString(3, bag.getContent());
			  ps.setString(4, bag.getWriter());
			  System.out.println("3. sql문 생성 성공!!!");
			  
			  //4. sql문을 mysql로 전송한다.
			  int result = ps.executeUpdate();
			  System.out.println("4. sql문 전송 전송");
			  System.out.println(result);
		} catch (ClassNotFoundException e) { //1단계
			System.out.println("1번 에러>>드라이버 없음!!");
		} catch (SQLException e) {//2-4단계
			System.out.println("2-4번 에러>> DB관련 처리하다 에러 발생함!!!");
		}
	}
	
	
	public 게시판Bag read(게시판Bag bag) {
		System.out.println("전달된 id는 "+bag.getId());
			
			ResultSet rs = null;//참조형 초기화 null //메서드 안에서 선언된 변수는 모두 지역변수
			//지역변수는 초기화르 ㄹ해줘야 한다.
			게시판Bag bag2 = new 게시판Bag();
			
		   try {
			//자바와 db연결하는 프로그램(JDBC) 순서
			  //1. jdbc connector설정
			  Class.forName("com.mysql.jdbc.Driver");
			  System.out.println("1. connector연결 성공!!!");
			  
			  //2. java에서 db로 연결: 
			  //   연결할 주소url(ip, port, db명), username, password
			  String url = "jdbc:mysql://localhost:3306/shop";
			  String username = "root";
			  String password = "1234";
			  Connection con = DriverManager.getConnection(url, username, password);
			  System.out.println("2. shoes db연결 성공!!!");
			  
			  //3. sql문을 만든다.
			  String sql = "select * from board where id = ?";
			  PreparedStatement ps = con.prepareStatement(sql);
			  ps.setString(1, bag.getId());
			  System.out.println("3. sql문 생성 성공!!!");
			  
			  //4. sql문을 mysql로 전송한다.
//			  result = ps.executeUpdate();//cud일때만 씀
			  rs = ps.executeQuery();
			  System.out.println("4. sql문 전송 전송");
//			  System.out.println("검색 결과는 "+rs.next());//두번쓰면 안되서 주석
			  if (rs.next()) {
				  System.out.println("검색 결과가 있음");
				  String id = rs.getString(1); //rs.getString("컬럼명"); //sql은 인덱스 1부터
				  String title = rs.getString(2);
				  String content = rs.getString(3);
				  String writer = rs.getString(4);
				  System.out.println(id+ " " + title + " "+ content+ " "+writer);
				  bag2.setId(id);;
				  bag2.setTitle(title);
				  bag2.setContent(content);
				  bag2.setWriter(writer);
			  }else {
				  System.out.println("검색 결과가 없음");
			  }
		} catch (ClassNotFoundException e) { //1단계
			System.out.println("1번 에러>>드라이버 없음!!");
			e.printStackTrace();//에러 정보
		} catch (SQLException e) {//2-4단계
			System.out.println("2-4번 에러>> DB관련 처리하다 에러 발생함!!!");
			e.printStackTrace();
		}
		   return bag2;
	}
}
