package travel;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ReservationDAO {

	// 예약정보 입력 & 예약 확정
	public int createCard(String reserveID, String reserveAdult, String reserveChild, String day) throws Exception {
																					//,String totalCoast
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. connector 연결 성공!");
		
		String url = "jdbc:mysql://localhost:3306/travelDB?useSSL=false";
		String username = "root";
		String password = "1234";
		Connection con = DriverManager.getConnection(url, username, password);
		System.out.println("2. Travel db연결 성공!!!");
		
		
		String sql = "insert into reservation values (?, ?, ?, ?, ?)";    

		//adult = 27900
		//child = 10900
		int totalCoast1 = Integer.parseInt(reserveAdult);
		int totalCoast2 = Integer.parseInt(reserveChild);
		int totalCoast3 = (totalCoast1 * 27900) + (totalCoast2 * 10900);
		// 총금액 계산 되는것. 
		
		
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, reserveID);
		ps.setString(2, reserveAdult);
		ps.setString(3, reserveChild);
//		ps.setString(4, totalCoast);
		ps.setString(4, day);
		ps.setInt(5, totalCoast3);
		System.out.println("3. sql문 생성 성공!!!");
		
		//4. sql문을 mysql로 전송한다. 
	int result = ps.executeUpdate();
		System.out.println("4. sql문 전송 성공!!!");
		System.out.println("SQL 문 수행 개수 " + result + "개");
		return result;
		
		
	}//create end
	
	//예약취소 
	public int delete(String id) throws Exception {
		
		//1. jdbc connector 설정
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. connector 연결 성공!");
		
		String url = "jdbc:mysql://localhost:3306/travelDB?useSSL=false";
		String username = "root";
		String password = "1234";
		Connection con = DriverManager.getConnection(url, username, password);
		System.out.println("2. Travel db연결 성공!!!");

		String sql = "delete from reservation where reserve_id = ?";		
		
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, id);
		System.out.println("3. sql문 생성 성공!!!");
		
		int result = ps.executeUpdate();
		System.out.println("4. sql문 전송 성공!!!");
		System.out.println(result);
		return result;
	}//create end
	
	
	
	// 예약정보 수정 
	public int update(String ID, String Adult, String Child, String day) throws Exception {
		
		//1. jdbc connector 설정
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. connector 연결 성공!");
		
		String url = "jdbc:mysql://localhost:3306/travelDB?useSSL=false";
		String username = "root";
		String password = "1234";
		Connection con = DriverManager.getConnection(url, username, password);
		System.out.println("2. Travel db연결 성공!!!");
		
		
		//3.sql 문을 만든다.			
		String sql = "update reservation set reserve_Adult = ?, reserve_Child = ?, reserve_day = ?, total_CostF = ? where reserve_ID = ?";
		
		
		int totalCoast1 = Integer.parseInt(Adult);
		int totalCoast2 = Integer.parseInt(Child);
		int totalCoast3 = (totalCoast1 * 27900) + (totalCoast2 * 10900);
		// 총금액 계산 되는것. 
		// 예약 정보 수정
		PreparedStatement ps = con.prepareStatement(sql);
		
		ps.setString(1, Adult);
		ps.setString(2, Child);
		ps.setString(3, day);
		ps.setInt(4, totalCoast3);
		ps.setString(5, ID);
		
		System.out.println("3. sql문 생성 성공!!!");
		
		//4. sql문을 mysql로 전송한다. 
		
		int result = ps.executeUpdate();
		
		System.out.println("4. sql문 전송 성공!!!");
		System.out.println(result);
		return result;
	}//create end
	
	
	//---------------------------------------------------------
		public String[] read(String id) throws Exception {
		
		//1. jdbc connector 설정
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. connector 연결 성공!");
		
		String url = "jdbc:mysql://localhost:3306/travelDB?useSSL=false";
		String username = "root";
		String password = "1234";
		Connection con = DriverManager.getConnection(url, username, password);
		System.out.println("2. Travel db연결 성공!!!");

		String sql = "select * from reservation where reserve_ID = ?";		
		
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, id);
		System.out.println("3. sql문 생성 성공!!!");
		
		ResultSet rs = ps.executeQuery();
		System.out.println("4. sql문 전송 성공!!!");
//		System.out.println(rs.next());
		String[] result = new String[5];
		if (rs.next()) {
			// 테이블에 검색 결과가 있다라는 얘기!
			String number = rs.getString(1);
			String adult = rs.getString(2);
			String child = rs.getString(3);
			String day = rs.getString(4);
			String total = rs.getString(5);
//			System.out.println(id2 + " " + pw + " " + " " + name + " " + tel);
			result[0] = "예약번호는 : "+ number + "     ";
			result[1] = "대인 : "+ adult + " 명   ";
			result[2] = "소인 : "+ child + " 명   ";
			result[3] = "날짜 : " + day + "     ";
			result[4] = "총금액 : "+ total + " 원입니다   ";
		}
		
		return result;
		
		
	}//read end
	

} // class end 
