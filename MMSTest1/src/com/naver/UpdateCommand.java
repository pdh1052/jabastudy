package com.naver;

import java.util.Scanner;

public class UpdateCommand implements Command
{

	@Override
	public void execute(Scanner sc) {
		System.out.println("id를 입력하시오");
		String id = sc.nextLine();
		System.out.println("name을 입력하시오.");
		String name = sc.nextLine();
		System.err.println("age를 입력하시오");
		int age = sc.nextInt();
		
		MemberDTO dto = new MemberDTO(id, name, age);
		int idx = DB.db.indexOf(dto);
		DB.db.set(idx, dto);
		
		
	}

	@Override
	public String toString() {
		return "수정";
	}

}
