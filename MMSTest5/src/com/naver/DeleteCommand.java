package com.naver;

import java.util.Scanner;

public class DeleteCommand implements Command{

	@Override
	public void excute(Scanner sc) {
		System.out.println("������ id�� �Է��Ͻÿ�");
		String id = sc.nextLine();
		
		
		boolean b = DB.db.remove(new MemberDTO(id, null, 0));
		if (b) {
			System.out.println("�����Ϸ�");
			
		}else {
			System.out.println("��������");
		}
		
	}

	@Override
	public String toString() {
		return "ȸ������";
	}

}
