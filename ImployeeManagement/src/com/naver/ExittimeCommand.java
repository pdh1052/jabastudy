package com.naver;



import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ExittimeCommand implements Command{

	@Override
	public void execute(Scanner sc) {
		System.out.println("��� ID�� �Է��Ͻÿ�.");
		String id = sc.nextLine();
		System.out.println("����մϴ�");
		
		
		SimpleDateFormat format = new SimpleDateFormat ( "yyyy-MM-dd HH:mm:ss");
		Date time = new Date();
		String exittime = format.format(time);
		
		AttendeeDAO dao = new AttendeeDAO();

		AttendeeDTO dto = new AttendeeDTO(id, null, null, exittime);
		dao.exittime(dto);
		
		
		
	}

	@Override
	public String toString() {
		return "����ϱ�";
	}

}
