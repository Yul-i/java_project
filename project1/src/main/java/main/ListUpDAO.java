package main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;


public class ListUpDAO {
	Connection con;
	
	public ListUpDAO() {
		super();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("1.connector 연결 성공!!");

			String url = "jdbc:mysql://localhost:3306/Makgeolli?useUnicode=true&characterEncoding=utf8";
			String username = "root";
			String password = "1234";
			con = DriverManager.getConnection(url, username, password);
			System.out.println("2.book db연결 성공!!!");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	
	public ArrayList<ListUpDTO> newProduct(){
		
		ArrayList<ListUpDTO> arr = new ArrayList<ListUpDTO>();
		ResultSet rs = null; 
		try {
			String sql = "select * from listUp order by productnum desc limit 8";	
			PreparedStatement ps = con.prepareStatement(sql);
			System.out.println("3.sql 생성  성공!!!!");

			rs = ps.executeQuery();
			System.out.println("4.SQL문 전송 성공!!!!!");

			while(rs.next()) {
				ListUpDTO dto2 = new ListUpDTO();
				dto2.setProductNum(rs.getString(1));
				dto2.setProductPic(rs.getString(2));
				dto2.setProductName(rs.getString(3));
				dto2.setProductPrice(rs.getInt(4));
				dto2.setProductWeight(rs.getString(5));
				dto2.setProductOrigin(rs.getString(6));
				
				arr.add(dto2);
			}
		} catch (SQLException e) {
			System.out.println("3-4번 에러>> DB관련 처리하다 에러 발생함!!!");
			e.printStackTrace();
		}
		return arr;
	}
	
	public ArrayList<ListUpDTO> read(String id){

		ArrayList<ListUpDTO> arr = new ArrayList<ListUpDTO>();
		ResultSet rs = null;
		try {
			String sql = "select * from listup where productNum like ?";	
			PreparedStatement ps = con.prepareStatement(sql);
			String ids = id+"%";
			ps.setString(1,	ids);
			System.out.println("3.sql 생성  성공!!!!");
			
			rs = ps.executeQuery();
			System.out.println("4.SQL문 전송 성공!!!!!");

			while(rs.next()) {
				ListUpDTO dto2 = new ListUpDTO();
				dto2.setProductNum(rs.getString(1));
				dto2.setProductPic(rs.getString(2));
				dto2.setProductName(rs.getString(3));
				dto2.setProductPrice(rs.getInt(4));
				dto2.setProductWeight(rs.getString(5));
				dto2.setProductOrigin(rs.getString(6));

				arr.add(dto2);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return arr;

	}
	
	public ArrayList<ListUpDTO> search(String word){

		ArrayList<ListUpDTO> arr = new ArrayList<ListUpDTO>();
		ResultSet rs = null;
		try {
			String sql = "select * from listup where productName like ?";	
			PreparedStatement ps = con.prepareStatement(sql);
			String words = "%"+word+"%";
			ps.setString(1,	words);
			System.out.println("3.sql 생성  성공!!!!");
			
			
			rs = ps.executeQuery();
			System.out.println("4.SQL문 전송 성공!!!!!");

			while(rs.next()) {
				ListUpDTO dto2 = new ListUpDTO();
				dto2.setProductNum(rs.getString(1));
				dto2.setProductPic(rs.getString(2));
				dto2.setProductName(rs.getString(3));
				dto2.setProductPrice(rs.getInt(4));
				dto2.setProductWeight(rs.getString(5));
				dto2.setProductOrigin(rs.getString(6));
				
				arr.add(dto2);
				System.out.println(dto2);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return arr;

	}
	
	public ArrayList<ListUpDTO> best(){

		ArrayList<ListUpDTO> arr = new ArrayList<ListUpDTO>();
		ArrayList<String> arr2 = new ArrayList<String>();
		ResultSet rs = null;
		try {
			String sql = "select productid, sum(amount) from basket b "
						+ "group by productid "
						+ "order by sum(amount) desc limit 8";	
			PreparedStatement ps = con.prepareStatement(sql);
			System.out.println("3.sql 생성  성공!!!!");
			
			rs = ps.executeQuery();
			System.out.println("4.SQL문 전송 성공!!!!!");
			
			while(rs.next()) {
				arr2.add(rs.getString(1));
			}
						
			try {
				for (int j = 0; j < arr2.size(); j++) {
					String sql2 = "select * from listup where productnum = ? ";
					PreparedStatement ps2 = con.prepareStatement(sql2);
					ps2.setString(1,arr2.get(j));	
					rs = ps2.executeQuery();
					System.out.println("3.sql 생성  성공!!!!");
					System.out.println("4.SQL문 전송 성공!!!!!");
					
					while(rs.next()) {
						ListUpDTO dto2 = new ListUpDTO();
						dto2.setProductNum(rs.getString(1));
						dto2.setProductPic(rs.getString(2));
						dto2.setProductName(rs.getString(3));
						dto2.setProductPrice(rs.getInt(4));
						dto2.setProductWeight(rs.getString(5));
						dto2.setProductOrigin(rs.getString(6));
						arr.add(dto2);
					}
				}
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return arr;

	}
	
}
