package com.naver;

import java.util.Scanner;

public class InsertCommand implements Command{

	@Override
	public void excute(Scanner sc) {
		System.out.println("id�� �Է��Ͻÿ�");
		String id = sc.nextLine();
		System.out.println("name�� �Է��Ͻÿ�");
		String name = sc.nextLine();
		System.out.println("age�� �Է��Ͻÿ�");
		int age = sc.nextInt();
		
		MemberDTO dto = new MemberDTO(id, name, age);
		DB.db.add(dto);
		
		
				
		
	}

	@Override
	public String toString() {
		return "ȸ������";
	}

}
