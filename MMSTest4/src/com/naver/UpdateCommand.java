package com.naver;

import java.util.Scanner;

public class UpdateCommand implements Command{

	@Override
	public void execute(Scanner sc) {
		System.out.println("������ id�� �Է��Ͻÿ�");
		String id = sc.nextLine();
		System.out.println("������ name�� �Է��Ͻÿ�");
		String name = sc.nextLine();
		System.out.println("������ age�� �Է��Ͻÿ�");
		int age = sc.nextInt();
		
		MemberDTO dto = new MemberDTO(id, name, age);
		int idx = DB.db.indexOf(dto);
		DB.db.set(idx, dto);
		
		
	}

	@Override
	public String toString() {
		return "����/����";
	}

}
