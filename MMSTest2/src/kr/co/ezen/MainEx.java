package kr.co.ezen;

import java.util.Scanner;

import com.naver.Command;
import com.naver.DeleteCommand;
import com.naver.InsertCommand;
import com.naver.SeletCommand;
import com.naver.UpdateCommand;

public class MainEx {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		
		Command [] com = {new InsertCommand(), new SeletCommand(), new DeleteCommand(), new UpdateCommand()};
		
		boolean isok = true;
		int idx = -1;
		
		while (isok) {
			System.out.println("�޴��� ���ÿ�");
			System.out.println("0.ȸ������ 1.ȸ����ȸ 2.ȸ������ 3.ȸ������ 4.����");
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
