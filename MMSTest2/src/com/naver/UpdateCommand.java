package com.naver;

import java.util.Scanner;

public class UpdateCommand implements Command{

	@Override
	public void excute(Scanner sc) {
		System.out.println("변경할 id를 입력하시오");
		String id = sc.nextLine();
		
		System.out.println("변경할 name를 입력하시오");
		String name = sc.nextLine();
		
		System.out.println("변경할 age를 입력하시오");
		int age = sc.nextInt();
		
		MemberDTO dto = new MemberDTO(id, name, age);
		int idx = DB.db.indexOf(dto);
		DB.db.set(idx, dto);
		
	}

}
