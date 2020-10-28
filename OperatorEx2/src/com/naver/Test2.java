package com.naver;

public class Test2 {
	
	public void k1(boolean a, boolean b) {
		boolean result = a && b;
		System.out.println(result);
		
	}
	
	public void k2(boolean a, boolean b) {
		boolean result = a||b;
		System.out.println(result);
	}
	
	public void k3(boolean a) {
		System.out.println(!a);
		System.out.println(a);
	}
	private int a =  0;
	public void swithInt() {
		a=1-a;
		System.out.println(a);
		
	}
	private boolean b = false;
	public void switchBoolean() {
		b = !b;
		System.out.println(b);
		
	}

}
