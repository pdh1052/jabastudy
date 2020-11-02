package com.naver;

public class Test {
	public void me5() {
		int i = 0;
		while (i<10) {
			if (i !=0 && i % 5 ==0) {
				i++;
				continue;
			}
			System.out.println(i);
			i++;
		}
	}
	public void me4() {
		int i = 0;
		while(i<10) {
			if (i != 0 && i % 5 ==0) {
				break;
			}System.out.println(i);
			i++;
		}
		System.out.println("끝");
	}
	
	public void printpibo() {
		int a = 1;
		int b = 1;
		 for (int i = 0; i < 15; i++) {
			int c = a+b;
			System.out.println(c);
			a=b;
			b=c;
		}
	}
	
	public void printStar(int n) {
		int i = 1;
		while (i < n) {
		me31(i);
		i++;
			
		}
	}
	
	public void gugudan() {
		int i = 2;
		while (i<10) {
			dan(i);
			i++;
			
		}
	}
	public void me31(int n) {
		int i = 0;
		while (i<n) {
			System.out.print("*");
			i++;
		}System.out.println();
	}
	
	public void me3() {
		int i = 0;
		while (i<11) {
			System.out.print("*");
			i++;
			
		}System.out.println();
	}
	
	public void dan(int dan) {
		int i = 1;
		while (i<10) {
			StringBuffer sb = new StringBuffer();
			sb.append(dan);
			sb.append("X");
			sb.append(i);
			sb.append("=");
			sb.append(dan*i);
			String msg = sb.toString();
			System.out.println(msg);
			i++;
			
		}
	}
	
	public void me21() {
		int i = 99;
		while (i>=20) {
			System.out.println(i);
			i=i-2;
		}
	}
	
	
	public void me2() {
		int i = 0;
		while (i<47) {
			System.out.println(i);
			i = i + 2;
		}
	}
//for 문은 반복횟수  while은 값까지



	public void me11() {
		int i = 100;
		while (i>=0) {
			System.out.println(i);
			i--;
		}
	}


	public void me1() {
		int i = 0;

		while (i<101) {			
			System.out.println(i);
			
			i++;
			
		}
	}
	
	
	
	}
