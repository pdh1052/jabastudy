package com.naver;

import java.util.Scanner;

public class EmployeeDeleteCommand implements Command {

	@Override
	public void execute(Scanner sc) {
		EmployeeDAO dao = new EmployeeDAO();
		
		System.out.println("������ ���ID�� �Է��ϼ���.");
		String id = sc.nextLine();
		
		EmployeeDTO dto = dao.selectById(id);
		
		if (dto != null) {
			EmployeeDTO edto = new EmployeeDTO(id, null, null);
			EmployeeDAO edao = new EmployeeDAO();
			edao.delete(edto);
			System.out.println("����ó���Ǿ����ϴ�.");
		}else {
			System.out.println("��ϵ������� ID�Դϴ� �ٽ� �õ����ּ���.");
		}
	}
	
	@Override
	public String toString() {
		return "�������";
	}

	
}