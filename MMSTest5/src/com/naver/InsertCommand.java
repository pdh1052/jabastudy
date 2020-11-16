package com.naver;

import java.util.Scanner;

public class InsertCommand implements Command{

	@Override
	public void excute(Scanner sc) {
		System.out.println("id를 입력하시오");
		String id = sc.nextLine();
		System.out.println("name을 입력하시오");
		String name = sc.nextLine();
		System.out.println("age를 입력하시오");
		int age = sc.nextInt();
		
		MemberDTO dto = new MemberDTO(id, name, age);
		DB.db.add(dto);
		
		
				
		
	}

	@Override
	public String toString() {
		return "회원가입";
	}

}
