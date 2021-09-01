package com.mega.mvc10;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class DBCPTest1 {

	public static void main(String[] args) {
		
		//10개의 커넥션을 만들어서 백터에 챱챱챱 넣는다.
		DBConnectionMgr dbcp = DBConnectionMgr.getInstance();
		try {
			//1,2단계를 해줌. 드라이버 설정, db연결까지 dbcp가 해주었음.
			//만든 커넥션 중 하나 줘봐
			Connection con = dbcp.getConnection();
			//dbcp에서 연결해 놓은 것 중 하나의 연결을 꺼내와서 3,4단계를 구현하면 됨.
			String sql = "insert into member values ('sun','sun','sun','sun')";
			PreparedStatement ps = con.prepareStatement(sql);
			
			ps.executeUpdate();
			
			//10개 중에서 하나 꺼내썼던 con(참조형주소)를 다시 되돌려주는 것
			//다시 백터에 되돌려줄게 DB연결 작업은 무겁고 까다로우니 ps는 종료시켜줄게, rs도 날려줌
			dbcp.freeConnection(con, ps);//자원반납
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
