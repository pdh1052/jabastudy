package com.naver;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Test {
	
	public void me9() {
		System.out.println(String.format("%4d, %3s", 33, "hel"));
		
		Calendar c = Calendar.getInstance();
		
		System.out.println(c.getTime());
		
		SimpleDateFormat sdf = new SimpleDateFormat("YYYY년 MM월 dd일 hh시 mm분 ss초");
		String msg = sdf.format(c.getTime());
		System.out.println(msg);
	}
	
	public void me8() {
//		자바에서는 캘린더 클래스를 쓰자.
//		그러나 DB에서는 캘린더클래스보다는 Date클래스를 많이 사용한다
//		따라서 반드시 두 타입을 변환할 수 있어야 한다.
		
		Calendar c = Calendar.getInstance();
		Date d = new Date(c.getTimeInMillis());
		c.setTime(d);
	
	}
	
	public void me7() {
		Calendar c = Calendar.getInstance();
		System.out.println(c.getTime());
		
		
		c.roll(Calendar.DATE, 20);
		System.out.println(c.getTime());
		
	}
	
	
	public void me61() {
		Calendar c = Calendar.getInstance();
		
		Calendar c2= (Calendar) c.clone();
		c2.add(Calendar.DATE,20);
		
		
		System.out.println(c);
		System.out.println(c2);
	}
	
	
	
	public void me6() {
		//2020 11 12입니다
		//20일후에는 몇일일까요?
		//2020 11 32
		//2020 12 2
		//add는 캘린더객체의 정보를 변경합니다.
		//특정 필드의 값에 주어진 값을 더해서 변경합니다.
		
		Calendar c = Calendar.getInstance();
		System.out.println(c.getTime());
		c.add(Calendar.DATE, 20);
		System.out.println(c.getTime());
		
		
	}
	
	public void me5() { //안중요한 예제
		Scanner sc = new Scanner(System.in);
		try {
//			System.out.println("연도를 입력하세요");
//			int year = sc.nextInt();
//			sc.nextLine();
//			
//			System.out.println("월을 입력하세요");
//			int month = sc.nextInt();
//			sc.nextLine();
			
			int year = 2020;
			int month = 10;
			
			
			Calendar c = Calendar.getInstance();
			c.set(year, month-1, 1);
			
			int lastDate = c.getActualMaximum(Calendar.DAY_OF_MONTH);
			int firstDateDay = c.get(Calendar.DAY_OF_WEEK);
			
			System.out.println(year+"년"+month+"월");
			System.out.println(" SU MO TU WE TH FR SA");
			
			for (int i = 1; i < firstDateDay; i++) {
				System.out.print("   ");
			}
			
			for (int i = 0; i < lastDate+1; i++) {
				String naljja = i<10? "  "+i : " "+i;
				System.out.print(naljja);
				if ((i+firstDateDay)%Calendar.SATURDAY ==0) {
					System.out.println();
				}
			}
						
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			sc.close();
		}
	}
	
	public void me41() {
		Calendar c = Calendar.getInstance();
		c.set(Calendar.YEAR, 1950);
		c.set(Calendar.MONTH, Calendar.FEBRUARY);
		int maxDate = c.getActualMaximum(Calendar.DAY_OF_MONTH);
		c.set(Calendar.DATE, maxDate);
		int day = c.get(Calendar.DAY_OF_WEEK);
		System.out.println(day);
		
	}
		
	
	public void me4() {
		Calendar c = Calendar.getInstance();
		int maxDate = c.getActualMaximum(Calendar.DAY_OF_MONTH);
		System.out.println(maxDate);
	}
	
	
	
	public void me32() {
		Calendar c = Calendar.getInstance();
		c.set(1950, Calendar.JUNE, 25);
		int day = c.get(Calendar.DAY_OF_WEEK);
		System.out.println(day);
	
	}
	
	public void me31() {
		Calendar c = Calendar.getInstance();
				c.set(Calendar.MONTH, Calendar.MAY);
				System.out.println(c);
	}
	
	public void me3() {
		Calendar c1 = Calendar.getInstance();
		Calendar c2 = Calendar.getInstance();
		
		c1.set(1950, 6-1, 25);
		
		System.out.println(c1);
		System.out.println(c2);
	}
	
	public void me2() {
		Calendar c = Calendar.getInstance();
		//년도 정보
		int year = c.get(Calendar.YEAR);
		//월 정보
		int month = c.get(Calendar.MONTH)+1;
		//일 정보
		int date = c.get(Calendar.DATE);
		//요일 정보
		int day = c.get(Calendar.DAY_OF_WEEK);
		System.out.println(year);
		System.out.println(month);
		System.out.println(date);
		System.out.println(day);
	}

	public void me1() {
		//1.Calendar 클래스 객체 생성 방법
		Calendar c = Calendar.getInstance();
	}
}
