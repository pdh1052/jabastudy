package com.naver;

import java.util.Scanner;

public class EndCommand implements Command{
	
	// �ý����� �����ϴ� �޼���
	

	@Override
	public void execute(Scanner sc) {
		
		sc.close();
		System.out.println("����� ������ �ʱ�ȭ�˴ϴ�.");
		System.exit(0);
		
	}

	@Override
	public String toString() {
		return "����";
	}
	
	

	
}
