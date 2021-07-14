package db연결;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class ProductDAO {
	public int create(String reserve_id, String reserve_adult, String reserve_child, String total_cost) throws Exception {

		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1.connector 연결 성공!!");

		String url = "jdbc:mysql://localhost:3306/travelDB";
		String username = "root";
		String password = "1234";

		Connection con = DriverManager.getConnection(url, username, password);
		System.out.println("2.travelDB db연결 성공!!!");

		String sql = "insert into reservation values (?,?,?,?)";

		PreparedStatement ps = con.prepareStatement(sql);

		ps.setString(1, reserve_id);
		ps.setString(2, reserve_adult);
		ps.setString(3, reserve_child);
		ps.setString(4, total_cost);
		System.out.println("3.sql 생성  성공!!!!");

		int result = ps.executeUpdate();
		System.out.println("4.SQL문 전송 성공!!!!!");
		System.out.println("sql문 수행 개수 " + result + "개");

		return result;

	}// create end}
}
