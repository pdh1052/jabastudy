package com.naver;

import java.util.List;
import java.util.Scanner;

public class AttendeeSelectCommand implements Command {

	@Override
	public void execute(Scanner sc) {
		System.out.println("�޴��� �����ϼ���.");
		System.out.println("1: ���� ��ȸ, 2: ��ü ��ȸ");
		
		int menu = sc.nextInt();
		sc.nextLine();
		
		AttendeeDAO dao = new AttendeeDAO();
		List<AttendeeDTO> list =  dao.attendeeCheck();
		
		
		switch (menu) {
		case 1:
			System.out.println("��ȸ �� ID�� �Է��ϼ���.");
			String id = sc.nextLine();
			AttendeeDTO dto = dao.intimeCheck(id);
			try {
				if(dto.getIntime() != null) {
					String name = dto.getName();
					String intime = dto.getIntime();
					
					dto = new AttendeeDTO(id, name, intime, dto.getExittime());
					System.out.println(dto);
					

				}
					
				{
					
					break;
				}
				
			} catch (Exception e) {
				System.out.println("������� ���� ����Դϴ�.");
			}
						
			break;
			
		case 2:
			
			for (int i = 0; i < list.size(); i++) {
				dto = list.get(i);
				
				
					System.out.println(dto);
				}
			}
			
	

		
		}
		
	

	@Override
	public String toString() {
		return "��/��� ��ȸ";
	}

	
	
}