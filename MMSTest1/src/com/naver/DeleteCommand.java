package com.naver;

import java.util.Scanner;

public class DeleteCommand implements Command{

	@Override
	public void execute(Scanner sc) {
		System.out.println("삭제할 id를 입력하시오.");
		String id = sc.nextLine();
		
		boolean b = DB.db.remove(new MemberDTO(id, null, 0));
		if (b) {
			System.out.println("삭제성공");
			
		}else {
			System.out.println("삭제실패");
		}
	}

	@Override
	public String toString() {
		return "삭제";
	}

	
}
