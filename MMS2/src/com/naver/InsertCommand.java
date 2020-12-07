package com.naver;

import java.sql.Date;
import java.util.Calendar;
import java.util.Scanner;

public class InsertCommand implements Command{

	@Override
	public void execute(Scanner sc) {
		System.out.println("id�� �Է��Ͻÿ�");
		String mid = sc.nextLine();
		System.out.println("name�� �Է��Ͻÿ�");
		String name = sc.nextLine();
		System.out.println("������ �Է��Ͻÿ�");
		String job = sc.nextLine();
		System.out.println("����⵵�� �Է��Ͻÿ�");
		int year = sc.nextInt();
		sc.nextLine();	
		System.out.println("������� �Է��Ͻÿ�");
		int month = sc.nextInt()-1;
		sc.nextLine();
		System.out.println("������� �Է��Ͻÿ�");
		int date = sc.nextInt();
		sc.nextLine();
		
		Calendar cal = Calendar.getInstance();
		cal.set(year, month, date);
		Date birth = new Date(cal.getTimeInMillis());
		
		MemberDTO dto = new MemberDTO(mid, name, job, birth);
		
		MemberDAO dao = new MemberDAO();
		dao.insert(dto);
	}

	@Override
	public String toString() {
		return "���";
	}

}
