package com.naver;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Calendar;

public class Test {
	
	private final String DRIVER_NAME = "oracle.jdbc.OracleDriver";
	private final String USER_NAME = "ezen";
	private final String USER_PASSWORD = "ezen";
	private final String USER_URL = "jdbc:oracle:thin:@localhost:1521:xe";

	public Test() {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			System.out.println("드라이버 로딩 성공");
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 로딩 실패");
			e.printStackTrace();
		}
	}
	
	public void me1() {
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = "insert into member (mid, name, job, birth) values (?, ?, ?, ?)";
		
		
		try {
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "ezen", "ezen");
			System.out.println("커넥션 연결 성공");		
			
			pstmt = conn.prepareStatement(sql);
			System.out.println("preparedStatement 생성 성공");
			
			
			pstmt.setString(1, "m003");
			pstmt.setString(2, "lee");
			pstmt.setString(3, "a");
			pstmt.setDate(4, new Date(Calendar.getInstance().getTimeInMillis()));
			pstmt.execute();
			
					
		} catch (Exception e) {
			System.out.println("preparedStatement 생성 실패");
			e.printStackTrace();
		}finally {
			try {
				if (pstmt != null) {
					pstmt.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
}
