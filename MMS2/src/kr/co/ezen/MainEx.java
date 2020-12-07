package kr.co.ezen;

import java.lang.reflect.Constructor;
import java.sql.Date;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import com.naver.Command;
import com.naver.DeleteCommand;
import com.naver.EndCommand;
import com.naver.InsertCommand;
import com.naver.MemberDAO;
import com.naver.MemberDTO;
import com.naver.MenuDAO;
import com.naver.SelectCommand;
import com.naver.UpdateCommand;

public class MainEx {

	public static void main(String[] args) {
//		Command [] menus = {new InsertCommand(),
//				new SelectCommand(),
//				new UpdateCommand(),
//				new DeleteCommand(),
//				new EndCommand()};
		Map<Integer, String> menu = new HashMap<Integer, String>();
		Scanner sc = new Scanner(System.in);
		
		
		MenuDAO dao = new MenuDAO();
		List<String> list = dao.select();
		for (int i = 0; i < list.size(); i++) {
			menu.put(i, list.get(i));
		}                  
		
		while (true) {
			System.out.println("메뉴를 선택하시오");
			
			StringBuffer sb = new StringBuffer();
			
			for (int i = 0; i < list.size(); i++) {
				String fullname = list.get(i);
				 Class<?> testClass2 = Class.forName(fullname);
				Constructor<?> con2 = testClass2.getConstructor();
				 Command com2= (Command)con2.newInstance();
				 
				 sb.append(i);
				 sb.append(": ");
				 sb.append(com2.toString());
				 sb.append(", ");
			}
			System.out.println(sb.toString());
			int idx = sc.nextInt();
			sc.nextLine();
			
			
			
		}
	
		
		
		
		
		
		
}
}
