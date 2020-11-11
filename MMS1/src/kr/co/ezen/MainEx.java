package kr.co.ezen;

import java.util.Scanner;

import com.naver.Command;
import com.naver.InsertCommand;
import com.naver.SelectCommand;

public class MainEx {
	
	public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	Command [] com = {new InsertCommand(),new SelectCommand()};
	
	boolean ok = true;
	int idx = -1;
	
	while (ok) {
		System.out.println("메뉴를 고르세요");
		System.out.println("0.회원가입 1.회원조회 2.종료");
		idx = sc.nextInt();
		sc.nextLine();
		if (idx == com.length) {
			break;
		}
		com[idx].excute(sc);
	}
	sc.close();
}
}
