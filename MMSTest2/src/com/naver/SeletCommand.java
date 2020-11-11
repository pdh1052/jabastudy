package com.naver;

import java.util.Scanner;

public class SeletCommand implements Command{

	@Override
	public void excute(Scanner sc) {
		for (int i = 0; i < DB.db.size(); i++) {
			MemberDTO dto = DB.db.get(i);
			System.out.println(dto);
		}
		
	}
	
	

}
