package mega;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class MemberDAO {
   public int create(String id, String pw, String name, String tel) throws Exception {
      //++자바와 DB연결하는 프로그램(=JDBC) 순서
      //1.JDBC Connector 설정
      Class.forName("com.mysql.jdbc.Driver");
      System.out.println("1. connector 연결성공!!");
    
      //2.java에서 DB로 연결 : 연결할 주소 URL(ip, port, DB명), user name, password
      String url = "jdbc:mysql://localhost:3306/shop";
      String user = "root";
      String password = "1234";
      Connection con = DriverManager.getConnection(url, user, password);
      //import java.sql.Connection;경로확인
      System.out.println("2. db 연결성공!");
      
      //3.sql문을 만든다.
      String sql = "insert into member values (?, ?, ?, ?)";
//      PreparedStatement => sql문 객체, 컵에 sql을 담았을때 컵과 같은 의미
      PreparedStatement ps = con.prepareStatement(sql);//con이 가져와줌
      ps.setString(1, id);
      ps.setString(2, pw);
      ps.setString(3, name);
      ps.setString(4, tel);
      System.out.println("3. SQL문 연결성공!!");
      
      //4.sql문을 mysql로 전송한다.
      int result = ps.executeUpdate();
      System.out.println("4. SQL문 전송 성공!");
      System.out.println("SQL문 수행개수 " + result);
      return result; 
   }//create end
   
   //==필요에따라 ()이부분만 수정해서 사용하면됨
   public int update(String id, String tel) throws Exception {
      Class.forName("com.mysql.jdbc.Driver");
      System.out.println("1. connector 연결성공!!");
      //==필요에따라 DB명 수정해서 사용하면됨
      String url = "jdbc:mysql://localhost:3306/shop";
      String user = "root";
      String password = "1234";
      Connection con = DriverManager.getConnection(url, user, password);
      System.out.println("2. db 연결성공!");
      //==필요에따라 이부분만 수정해서 사용하면됨
      String sql = "update member set tel= ? where id = ?";
      PreparedStatement ps = con.prepareStatement(sql);
      //==수정 String sql = "update member set tel= ? where id = ?"; 여기 물음표 순서랑 맞추기
      ps.setString(1, tel);
      ps.setString(2, id);
      System.out.println("3. SQL문 연결성공!!");
      int result = ps.executeUpdate();
      System.out.println("4. SQL문 전송 성공!");
      System.out.println("SQL문 수행개수 " + result);
      return result;
   }//update end

   
   //==필요에따라 ()이부분만 수정해서 사용하면됨
   public int delete(String id) throws Exception {
      Class.forName("com.mysql.jdbc.Driver");
      System.out.println("1. connector 연결성공!!");
      String url = "jdbc:mysql://localhost:3306/shop";
      String user = "root";
      String password = "1234";
      Connection con = DriverManager.getConnection(url, user, password);
      System.out.println("2. db 연결성공!");
      //==필요에따라 이부분만 수정해서 사용하면됨
      String sql = "delete from member where id = ?";
      PreparedStatement ps = con.prepareStatement(sql);
      //==필요에따라 이부분만 수정해서 사용하면됨
      ps.setString(1, id);
      System.out.println("3. SQL문 연결성공!!");
      int result = ps.executeUpdate();
      System.out.println("4. SQL문 전송 성공!");
      System.out.println("SQL문 수행개수 " + result);
      return result; 
   }//delete end

}