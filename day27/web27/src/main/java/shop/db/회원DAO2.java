package shop.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import shop.dto.회원Bag;

public class 회원DAO2 {
	
	
	public int create(회원Bag bag) {//던져주면서 참조형 변수(주소 담은 값) 같이 던져준거라 선언 안해줘도 된다.
	      //매서드 안에서 만들어진 변수임.
	      //변수는 "타입 변수명;"만들어 짐.(선언!)
	      //선언의 위치가 변수의 생존범위를 결정함.
	      //파라메터는 지역변수이다. 이 지역을 벗어나서는 사용불가능.
	      //지역변수는 자동초기화x, 쓰레기값 들어있는 상태!
		System.out.println("전달된 id는 "+bag.getId());
		System.out.println("전달된 pw는 "+bag.getPw());
		System.out.println("전달된 name는 "+bag.getName());
		System.out.println("전달된 tel는 "+bag.getTel());
			
			int result = 0;
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
			  String sql = "insert into member values (?, ?, ?, ?)";
			  PreparedStatement ps = con.prepareStatement(sql);
			  ps.setString(1, bag.getId());
			  ps.setString(2, bag.getPw());
			  ps.setString(3, bag.getName());
			  ps.setString(4, bag.getTel());
			  System.out.println("3. sql문 생성 성공!!!");
			  
			  //4. sql문을 mysql로 전송한다.
			  result = ps.executeUpdate();
			  System.out.println("4. sql문 전송 전송");
			  System.out.println(result);
		} catch (ClassNotFoundException e) { //1단계
			System.out.println("1번 에러>>드라이버 없음!!");
		} catch (SQLException e) {//2-4단계
			System.out.println("2-4번 에러>> DB관련 처리하다 에러 발생함!!!");
		}
		   return result;
	}
	
	
	public 회원Bag read(회원Bag bag) {
		System.out.println("전달된 id는 "+bag.getId());
			
			ResultSet rs = null;//참조형 초기화 null //메서드 안에서 선언된 변수는 모두 지역변수
			//지역변수는 초기화르 ㄹ해줘야 한다.
			회원Bag bag2 = new 회원Bag();
			
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
			  String sql = "select * from member where id = ?";
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
				  String pw = rs.getString(2);
				  String name = rs.getString(3);
				  String tel = rs.getString(4);
				  System.out.println(id+ " " + pw + " "+ name+ " "+tel);
				  bag2.setId(id);
				  bag2.setPw(pw);
				  bag2.setName(name);
				  bag2.setTel(tel);
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
	
	public ArrayList<회원Bag> read() {
		
			ResultSet rs = null;//참조형 초기화 null //메서드 안에서 선언된 변수는 모두 지역변수
			//지역변수는 초기화르 ㄹ해줘야 한다.
			
			//가방을 넣어 줄 컨테이너를 하나 만들어주자.
			//java파일에서 자동 import : ctrl+shift+o(영문)
			ArrayList<회원Bag> list = new ArrayList<회원Bag>();
			
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
			  String sql = "select * from member";
			  PreparedStatement ps = con.prepareStatement(sql);
			  System.out.println("3. sql문 생성 성공!!!");
			  
			  //4. sql문을 mysql로 전송한다.
//			  result = ps.executeUpdate();//cud일때만 씀
			  rs = ps.executeQuery();
			  System.out.println("4. sql문 전송 전송");
//			  System.out.println("검색 결과는 "+rs.next());//두번쓰면 안되서 주석
			  while (rs.next()) {//row 개수만큼 반복하게 됨.
				  System.out.println("검색 결과가 있음");
				  //가방을 만들어서 table에서 하나의 row를 꺼내준다음 가방에 넣어야 한다.
				  회원Bag bag2 = new 회원Bag();
				  String id = rs.getString(1); //rs.getString("컬럼명"); //sql은 인덱스 1부터
				  String pw = rs.getString(2);
				  String name = rs.getString(3);
				  String tel = rs.getString(4);
				  System.out.println(id+ " " + pw + " "+ name+ " "+tel);
				  bag2.setId(id);
				  bag2.setPw(pw);
				  bag2.setName(name);
				  bag2.setTel(tel);
				  //만들어진 가방을 컨테이너에 넣어주어야 한다.
				  list.add(bag2);
			  }
		} catch (ClassNotFoundException e) { //1단계
			System.out.println("1번 에러>>드라이버 없음!!");
			e.printStackTrace();//에러 정보
		} catch (SQLException e) {//2-4단계
			System.out.println("2-4번 에러>> DB관련 처리하다 에러 발생함!!!");
			e.printStackTrace();
		}
		   return list;
	}
	
	public int update(회원Bag bag) {
		System.out.println("전달된 id는 "+bag.getId());
		System.out.println("전달된 name는 "+bag.getName());
		System.out.println("전달된 tel는 "+bag.getTel());
		int result = 0;
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
			  String sql = "update member set tel = ?, name = ? where id = ?";
			  PreparedStatement ps = con.prepareStatement(sql);
			  ps.setString(1, bag.getTel());
			  ps.setString(2, bag.getName());
			  ps.setString(3, bag.getId());
			  System.out.println("3. sql문 생성 성공!!!");
			  
			  //4. sql문을 mysql로 전송한다.
			  result = ps.executeUpdate();
			  System.out.println("4. sql문 전송 전송");
			  System.out.println(result);
		} catch (ClassNotFoundException e) { //1단계
			System.out.println("1번 에러>>드라이버 없음!!");
		} catch (SQLException e) {//2-4단계
			System.out.println("2-4번 에러>> DB관련 처리하다 에러 발생함!!!");
		}
		   
		   return result;
	}
	
	public int delete(회원Bag bag) {
		System.out.println("전달된 id는 "+bag.getId());
			int result = 0;
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
			  String sql = "delete from member where id = ?";
			  PreparedStatement ps = con.prepareStatement(sql);
			  ps.setString(1, bag.getId());
			  System.out.println("3. sql문 생성 성공!!!");
			  
			  //4. sql문을 mysql로 전송한다.
			  result = ps.executeUpdate();
			  System.out.println("4. sql문 전송 전송");
			  System.out.println(result);
		} catch (ClassNotFoundException e) { //1단계
			System.out.println("1번 에러>>드라이버 없음!!");
		} catch (SQLException e) {//2-4단계
			System.out.println("2-4번 에러>> DB관련 처리하다 에러 발생함!!!");
		}
		   	return result;
	}
	

}//class
