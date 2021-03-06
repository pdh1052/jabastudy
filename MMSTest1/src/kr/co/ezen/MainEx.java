package kr.co.ezen;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.sql.CommonDataSource;

import com.naver.Command;
import com.naver.DeleteCommand;
import com.naver.EndCommand;
import com.naver.InsertCommand;
import com.naver.SelectCommand;
import com.naver.UpdateCommand;

public class MainEx {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	//	Command[] coms = {new InsertCommand(),new SelectCommand(), new DeleteCommand()};
		
		
		List<Command> list = new ArrayList<Command>();
		list.add(new InsertCommand());
		list.add(new SelectCommand());
		list.add(new DeleteCommand());
		list.add(new UpdateCommand());
		list.add(new EndCommand());

		boolean isOk = true;
		int idx = -1;

		try {
			while (isOk) {
				System.out.println("메뉴를 선택하시오");
				for (int i = 0; i < list.size(); i++) {
					Command com = list.get(i);
					System.out.print(i+". ");
					System.out.print(com);
					if (i != list.size()-1) {
						System.out.println();
					}
				}
				System.out.println();
				
				idx = sc.nextInt();
				sc.nextLine();
				
				list.get(idx).execute(sc);
				//coms[idx].execute(sc);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			sc.close();
			
		}
	}

}