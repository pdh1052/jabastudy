package com.naver;

import java.util.Scanner;

public class DeleteAttendeeCommand implements Command {
	
	// ����� ������ �ʱ�ȭ�ϴ� Ŭ����
	// 1�� ������ �ʱ�ȭ�ǰ� �����߽��ϴ�

	@Override
	public void execute(Scanner sc) {
		
		System.out.println("���α׷��� �����մϴ�");
		System.out.println("���� �����Ͻðڽ��ϱ�? ����� ����� ������ �ʱ�ȭ�˴ϴ�.");
		System.out.println("1: �����ϱ�, 2: ���ư���");
		
		int key = sc.nextInt();
		
		
		switch (key) {
		case 1:
			AttendeeDAO dao = new AttendeeDAO();
			dao.deleteAttendee();
			
			sc.close();
			System.out.println("����Ǿ����ϴ�.");

			System.exit(0);
			
			break;
		case 2:
			System.out.println("�޴��� ���ư��ϴ�.");
			break;

		default:
			if(key>2) {
				key = 2;
			}
			break;
		}
		
		
	}

	@Override
	public String toString() {
		return "���α׷� ����";
	}
	
	

}
