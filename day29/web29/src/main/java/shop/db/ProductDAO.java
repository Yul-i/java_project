package shop.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import shop.dto.ProductDTO;


public class ProductDAO {
	public ProductDTO read(ProductDTO dto) {
		System.out.println("전달된 id는 "+dto.getId());
			
			ResultSet rs = null;
			ProductDTO dto2 = new ProductDTO();
			
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
			  String sql = "select * from product where id = ?";
			  PreparedStatement ps = con.prepareStatement(sql);
			  ps.setString(1, dto.getId());
			  System.out.println("3. sql문 생성 성공!!!");
			  
			  //4. sql문을 mysql로 전송한다.
			  rs = ps.executeQuery();
			  System.out.println("4. sql문 전송 전송");
			  if (rs.next()) {
				  System.out.println("검색 결과가 있음");
				  dto2.setId(rs.getString(1));;
				  dto2.setName(rs.getString(2));
				  dto2.setContent(rs.getString(3));
				  dto2.setPrice(rs.getString(4));
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
		   return dto2;
	}
	
	public ArrayList<ProductDTO> read() {
		
			//DTO를 넣을 컨테이너 역할을 하는 ArrayList를 만들어 주어야 한다.
			ArrayList<ProductDTO> list = new ArrayList<>();
			ResultSet rs = null;

			
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
			  String sql = "select * from product";
			  PreparedStatement ps = con.prepareStatement(sql);
			  System.out.println("3. sql문 생성 성공!!!");
			  
			  //4. sql문을 mysql로 전송한다.
			  rs = ps.executeQuery();
			  System.out.println("4. sql문 전송 전송");
			  while (rs.next()) {
				  ProductDTO dto2 = new ProductDTO();
				  System.out.println("검색 결과가 있음");
				  dto2.setId(rs.getString(1));;
				  dto2.setName(rs.getString(2));
				  dto2.setContent(rs.getString(3));
				  dto2.setPrice(rs.getString(4));
				  
				  list.add(dto2);
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
}
