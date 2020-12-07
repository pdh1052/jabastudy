package com.naver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

// ������, �������Ʈ ��ü��ȸ 2���� ����� ������ DAOŬ�����Դϴ�.

public class Employee2DAO {
	
	DefaltLoading loading = new DefaltLoading();

	
	public void delete(Employee2DTO dto) {
		// ������� ���� �� ������� ���� (���̺� ��Ӱ��� ������ �̷��� ó����)
		// ���� ������
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = "DELETE FROM attendee WHERE id = ?";
		String sql2 = "DELETE FROM employee2 WHERE id = ?";
		
		try {
			conn = DriverManager.getConnection(loading.URL, loading.USER_NAME, loading.PASSWORD);
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, dto.getId());
			pstmt.executeUpdate();
			
			if (pstmt != null) {
				pstmt.close();
			}
			
			pstmt = conn.prepareStatement(sql2);
			pstmt.setString(1, dto.getId());
			pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			loading.closeAll(null, pstmt, conn);
		}
		
	}
	
	public List<Employee2DTO> listEmployee() {
		// �������Ʈ ��ü��ȸ
		// ���� ������
		List<Employee2DTO> list = new ArrayList<Employee2DTO>();
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = "SELECT id �����ȣ, name �̸�, position ���� FROM employee2";
		ResultSet rs = null;

		try {
			conn = DriverManager.getConnection(loading.URL, loading.USER_NAME, loading.PASSWORD);
			pstmt = conn.prepareStatement(sql);

			rs = pstmt.executeQuery();

			System.out.println("================[��� ����Ʈ]================");
			while (rs.next()) {
				String id = rs.getString("�����ȣ");
				String name = rs.getString("�̸�");
				String position = rs.getString("����");

				Employee2DTO dto = new Employee2DTO(id, name, position);
				list.add(dto);
				System.out.println(dto);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			loading.closeAll(rs, pstmt, conn);
		}

		return list;

	}

	public void addemployee(Employee2DTO dto) {
		// ������� ���
		// ���� ������
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = "INSERT INTO employee2 VALUES (?, ?, ?)";

		try {
			conn = DriverManager.getConnection(loading.URL, loading.USER_NAME, loading.PASSWORD);
			pstmt = conn.prepareStatement(sql);

			pstmt.setString(1, dto.getId());
			pstmt.setString(2, dto.getName());
			pstmt.setString(3, dto.getPosition());

			pstmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			loading.closeAll(null, pstmt, conn);
		}
	}

}
