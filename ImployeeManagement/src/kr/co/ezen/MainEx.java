package kr.co.ezen;

import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import com.naver.AttendeeSelectCommand;
import com.naver.Command;
import com.naver.DeleteAttendeeCommand;
import com.naver.EmployeeDeleteCommand;
import com.naver.EmployeeSelectCommand;
import com.naver.EmployeeUpdateCommand;
import com.naver.ExittimeCommand;
import com.naver.InsertAttendeeCommand;
import com.naver.InsertEmployeeCommand;


public class MainEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		List<Command> menu = new ArrayList<Command>();
//		Map<Integer, Command> menu = new HashMap<Integer, Command>();
//		menu.put(0,new InsertAttendeeCommand());
//		menu.put(1,new ExittimeCommand());
//		menu.put(2,new InsertEmployeeCommand());
//		menu.put(3,new EmployeeDeleteCommand());
//		menu.put(4,new EmployeeSelectCommand());
//		menu.put(5,new AttendeeSelectCommand());
//		menu.put(6,new EmployeeUpdateCommand());
//		menu.put(7,new DeleteAttendeeCommand());
		
		Map<Integer, String> menu = new HashMap<Integer, String>();
		
//		MenuDAO dao = new MenuDAO();
//		List<String> list = dao.select();
//		for (int i = 0; i < list.size(); i++) {
//			menu.put(i, list.get(i));
//		}                      *실적코드*
		
		menu.put(0, "com.naver.InsertEmployeeCommand");
		menu.put(1, "com.naver.InsertSelectCommand");
		menu.put(2, "com.naver.InsertDeleteCommand");
		menu.put(3, "com.naver.DeleteAttendeeCommand");
		
	
		boolean isOk = true;
		int idx = -1;
		
		try {
			while (isOk) {
				System.out.println("메뉴를 선택하시오");
				for (int i = 0; i < menu.size(); i++) {
					String com = menu.get(i);
					System.out.print(i+".");
					System.out.print(com);
					if (i != menu.size()) {
						System.out.println();
					}
				}
				System.out.println();
				
				idx = sc.nextInt();
				sc.nextLine();
				
				String str = menu.get(idx);
				Class<?> testClass = Class.forName(str);
				Constructor<?> cons = testClass.getConstructor();
				Command coms = (Command)cons.newInstance();
				coms.execute(sc);
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			sc.close();
		}
				
		

		
		
		
	
		
		
		
		
		

		
		

	}

}
