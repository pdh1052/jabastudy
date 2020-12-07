package com.naver;

import java.util.Scanner;
import java.util.regex.Pattern;

public class InsertEmployeeCommand implements Command{
	
	// ��� ����ϴ� Ŭ�����Դϴ�.

	@Override
	public void execute(Scanner sc) {
		
			System.out.println("��� ����� �����մϴ�.");
			String id;
			
			
			while (true) {
				System.out.println("���ID�� �Է��ϼ���");
				id = sc.nextLine();
				
				// ��� ID�� ������ ���ڷθ� �Է¹��� �� �ְ� �߾��
				String p = "^[a-zA-Z0-9]*$";
				// ����, ���ڸ� ���ٸ� true, �ƴ϶�� false ��ȯ�մϴ�.
				boolean i = Pattern.matches(p, id);
				
				if (id.length() != 8) {
					System.out.println("��� ID�� 8�ڸ��Դϴ�.");
				} else if(i == false) {
					System.out.println("��� ID�� ������ ���ڷθ� �Է��Ͽ� �ּ���.");
				} else {
					break;
				}
			}
			
			
			System.out.println("��� �̸��� �Է��ϼ���.");
			String name = sc.nextLine();
			
			System.out.println("������ �Է��ϼ���.");
			String position = sc.nextLine();
			
			EmployeeDTO dto = new EmployeeDTO(id, name, position);
			EmployeeDAO dao = new EmployeeDAO();
			System.out.println("��� ����� �Ϸ�Ǿ����ϴ�.");
			dao.insert(dto);
			
			
	
		}
		
	

	@Override
	public String toString() {
		return "��� ���";
	}
	
	
	

}
