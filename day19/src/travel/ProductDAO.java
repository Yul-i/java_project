package travel;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ProductDAO {
		public String[] read(String id) throws Exception {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("1.connector 연결 성공!!");
	
			String url = "jdbc:mysql://localhost:3306/travelDB";
			String username = "root";
			String password = "1234";
			Connection con = DriverManager.getConnection(url, username, password);
			System.out.println("2.product db연결 성공!!!");
	
	
			String sql = "select * from product where prod_id = ?";		
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1,	id);
			System.out.println("3.sql 생성  성공!!!!");
	
	
			ResultSet rs = ps.executeQuery();
			System.out.println("4.SQL문 전송 성공!!!!!");
			String[] result = new String[7];
			if (rs.next()) {
				String prod_id = rs.getString(1);
				String title = rs.getString(2);
				String during = rs.getString(3);
				String town = rs.getString(4);
				String adult_cost = rs.getString(5);
				String child_cost = rs.getString(6);
				String image = rs.getString(7);
				result[0] = prod_id;
				result[1] = title;
				result[2] = during;
				result[3] = town;
				result[4] = adult_cost;
				result[5] = child_cost;
				result[6] = image;
			}
			return result;
			
		}// read end
	}
	
	
