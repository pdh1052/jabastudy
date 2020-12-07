package com.naver;

import java.nio.file.attribute.AclEntry;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AccountDAO {
	private final String DRIVER_NAME = "oracle.jdbc.OracleDriver";
	private final String URL = "jdbc:oracle:thin:@localhost:1521:xe";
	private final String USER_NAME = "ezen";
	private final String USER_PASSWORD = "ezen";
	
	public AccountDAO() {
		try {
			Class.forName(DRIVER_NAME);
			System.out.println("드라이버 연결 성공");
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 연결 실패");
			e.printStackTrace();
		}
	}
	
	public void transter(String fromId , String toId , int howmuch) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = "update account set balance = balance + ? where id = ? ";
		String sql2 = "update account set balance = balance - ? where id = ?";
		ResultSet rs = null;
		boolean isOk = false;
		
		try {
			conn = DriverManager.getConnection(URL, USER_NAME, USER_PASSWORD);
			conn.setAutoCommit(false);;
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setInt(1, howmuch);
			pstmt.setString(2, toId);
			pstmt.executeUpdate();
			
			if (pstmt != null) {
				pstmt.close();
			}
			
			pstmt = conn.prepareStatement(sql2);
			
			System.out.println("곧 전원이 나갑니다");
			System.out.println(4/0);
			
			
			pstmt.setInt(1, howmuch);
			pstmt.setString(2, fromId);
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
				if (conn!= null) {
					conn.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
	
		
		
	}
	
	
	
}
