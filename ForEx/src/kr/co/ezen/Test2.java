package kr.co.ezen;

public class Test2 {
	public void StarEx(int a) {
		for (int i = 0; i < a+1; i++) {
			if (i < a/2) {
				Star(i+1);				
			}else {
				Star(a-i-1);
			}
		}
	}
	
	
	
	
	public void Star(int a) {
		for (int i = 0; i < a; i++) {
			System.out.print("*");
		}System.out.println();
		
	}
	
	public void gugudan(int a) {
		for (int i = 0; i < a; i++) {
			System.out.println(i+"´Ü");
			Dan(i);
		}
		}
	public void Dan(int dan) {
		for (int i = 1; i < 10; i++) {
			System.out.println(dan+"x"+i+"="+dan*i);
		}
	}

	
	public void me4(int n) {
		for (int i = 0; i < n ; i++) {
			System.out.println(i*2+1);
		}
	}
	
	public void me3() {
		for (int i = 1; i < 11; i++) {
			System.out.println(i*2);
			
		}
	}
	
	public void me2() {
		for (int i = 0; i < 101; i++) {
			System.out.println(i);
		}
	}
	
	public void me1() {
		for (int i = 0; i < 5; i++) {
			System.out.println("Hello World");
		}
	}

}
