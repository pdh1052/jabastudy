package com.naver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MemberDAO {
	
	private final String DRIVER_NAME = "oracle.jdbc.Oracleriver";
	private final String URL = "jdbc:oracle:thin:@localhost:1521:xe";
	private final String USER_NAME = "ezen";
	private final String USER_PASSWORD = "ezen";
	
	
	public MemberDAO() {
		try {
			Class.forName(DRIVER_NAME);
			System.out.println("드라이버 연결 성공");
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 연결 실패");
			e.printStackTrace();
		}
	}
	
	
	
	public void order(String oid, String menu, String mid) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql1 = "insert into oder values (?,?,?)";
		String sql2 = "update member10 set point = point +10 where mid = ?";
		ResultSet rs = null;
		boolean isOk = false;
		
		try {
			conn = DriverManager.getConnection(URL, USER_NAME, USER_PASSWORD);
			conn.setAutoCommit(false);
			pstmt = conn.prepareStatement(sql1);
			
			pstmt.setString(1, oid);
			pstmt.setString(2, menu);
			pstmt.setString(3, mid);
			
			pstmt.executeUpdate();
			
			if (pstmt != null) {
				pstmt.close();
			}
			
			pstmt = conn.prepareStatement(sql2);
			
			pstmt.setString(1, mid);
			
			pstmt.executeUpdate();
			
			
			isOk = true;
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if (isOk) {
					conn.commit();
				}else {
					conn.rollback();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				if (rs != null) {
					rs.close();
				}
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
