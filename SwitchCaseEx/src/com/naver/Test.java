package com.naver;

public class Test {
	
	public void me7(int score) {
		switch (score/10) {
		case 10:
		case 9:			
			System.out.println("A");
			break;
			case 8:
				System.out.println("B");
				break;
				case 7:
					System.out.println("C");
					break;
					case 6:
						System.out.println("D");
						break; 

		default:System.out.println("F");          
			break; 
		}
	}
	
	public void me6(int month) {
		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8: 
		case 10:
		case 12: 
			System.out.println("31일까지 있습니다");
			break;
		case 2:
			System.out.println("28일까지 있습니다");   
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("30일까지 있습니다");

		default:
			break;
		}
	}
	                                                                                                                                     
	
	public void me3(int a) {
		switch (a/10) {
		case 1:
			System.out.println("10~19");
			break;
		case 2:
			System.out.println("20~29");
			break;
		default:
			System.out.println("end");
			break;
		}
		System.out.println(">>>>>>>>>>>>>");
	}
	
	public void me2(int a) {
		switch ( a) {
		case 3:
			System.out.println(333);
			
			break;
		case 4:
			System.out.println(444);
			
		default:
			System.out.println(999);
			break;
		}
		System.out.println(">>>>>>>>>>>>");
	}
	
	public void me1(int a) {
		switch (a) {
		case 3:
		System.out.println(3333);
			System.out.println(1111);		
			break;
		case 4:
		System.out.println(4444);
			System.out.println("end");
		break;
		case 5:
		System.out.println(5555);
		System.out.println("oh");
		break;

		default:
			System.out.println("fine");
			break;
		}
	}

}
