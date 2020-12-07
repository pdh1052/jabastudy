package com.naver;

import java.sql.Date;
import java.util.Calendar;
import java.util.Scanner;

public class InsertCommand implements Command{

	@Override
	public void execute(Scanner sc) {
		System.out.println("id를 입력하시오");
		String mid = sc.nextLine();
		System.out.println("name을 입력하시오");
		String name = sc.nextLine();
		System.out.println("직업을 입력하시오");
		String job = sc.nextLine();
		System.out.println("출생년도를 입력하시오");
		int year = sc.nextInt();
		sc.nextLine();	
		System.out.println("출생월을 입력하시오");
		int month = sc.nextInt()-1;
		sc.nextLine();
		System.out.println("출생일을 입력하시오");
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
		return "등록";
	}

}
