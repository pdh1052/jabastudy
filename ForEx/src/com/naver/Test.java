package com.naver;

public class Test {
	
	public void me8(int a) {
		for (int i = 0; i < a+1; i++) {
			if (i < a/2) {
				me6(i+1);
			}else {
				me6(a-i-1);
			}
	}	
	}
	
	
	
	public void me7(int a) {
		for (int i = 0; i < a; i++) {
			me6(i);
		}	
	}
	
	public void gugudan() {
		;for (int i = 2; i < 10; i++) {
			System.out.println(i+"단");
			dan(i);
		}
		}
	
	
	public void me6(int a) {
		for (int i = 0; i < a; i++) {
			System.out.print("*");
		}System.out.println();
	}
		
	
	public void me5() {
		for (int i = 0; i < 10; i++) {
			System.out.print("*");
		}		System.out.println();	
		}
	
	
	public void me5(int a) {
		for (int i = 2; i < a+1; i++) {
			if (a % i==0) {
				if (i==a) {
					System.out.println("소수입니다.");
				}   
			}else{
				System.out.println("소수가 아닙니다.");
				break;
			}
		}

	}
	public void dan(int dan) {
		for (int i = 1; i < 10; i++) {
			System.out.println(dan+"x"+i+"="+dan*i);

		}
	}
	
	public void me4(int n) {
		for (int i = 0; i < n; i++) {
			System.out.println(i*2+1);
		}
	}

	public void me4() {
		for (int i = 0; i < 52; i++) {
			System.out.println(i*2+1);
		}
	}
	
	
	
	public void me3() {
		for (int i = 0; i < 52; i++) {
			System.out.println(i*2);			
		}
	}

	public void me2() {
		for(int i = 0; i < 100;  i++) {
			System.out.println(i);
		}
	}


	public void me1() {
		for(int i = 0; i < 5;  i++) {
			System.out.println("Hello World");
		}
	}

}
