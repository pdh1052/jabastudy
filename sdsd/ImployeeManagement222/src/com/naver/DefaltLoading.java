package com.naver;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DefaltLoading {
	
	// �ߺ��Ǵ� ���� Ŭ������ ��Ƽ� friendlyó�� (���� ��Ű�� �������� ��밡��)
	String DRIVER = "oracle.jdbc.OracleDriver";
	String URL = "jdbc:oracle:thin:@localhost:1521:xe";
	String USER_NAME = "ezen";
	String PASSWORD = "ezen";

	public DefaltLoading() {
		// ����̹� �ε�
		// ���� ������
		try {
			Class.forName(DRIVER);
			System.out.println("����̹� �ε� ����");
		} catch (ClassNotFoundException e) {
			System.out.println("����̹� �ε� ����");
			e.printStackTrace();
		}

	}

	public void closeAll(ResultSet rs, PreparedStatement pstmt, Connection conn) {
		// �ߺ��Ǵ� close�޼��� ó��
		// ���� ������
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
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
