package com.naver;

import java.util.Scanner;

public class Employee2DeleteCommand implements Command {

	@Override
	public void execute(Scanner sc) {
		System.out.println("������ �����ȣ�� �Է��ϼ���.");
		String id = sc.nextLine();
		
		Employee2DTO dto = new Employee2DTO(id, null, null);
		Employee2DAO dao = new Employee2DAO();
		dao.delete(dto);
	}
	
	@Override
	public String toString() {
		return "�������";
	}

	
}
