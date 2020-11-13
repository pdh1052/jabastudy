package kr.co.ezen;

import java.util.Scanner;

import com.naver.Command;
import com.naver.InserCommand;

public class MainEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Command [] com = {new InserCommand()};
		
		boolean isok = true;
		int idx = -1;
		
		while (isok) {
			System.out.println("메뉴를 고르시오");
			System.out.println("0.회원가입 1.종료");
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
