package com.naver;

public class Test {
	
	
	
	
	public boolean me1(int a, int b) {
	
		return a>b;
		
	}
	
	public boolean me2(long a, long b) {
		return a>=b;
	}
	
	
	public String me3(float a, float b) {
		boolean result = a<b;
		
		if (result) {
			
			return "OK";
		} else {
			return "NO";
		}  
		}
		
	public char me4(int a, int b) {
		
		boolean result = a>b;
		if (result) {
			return 'a';
		}else {
			return 'z';
		}
		}
	
	public boolean me5(byte a , byte b) {
		return a<=b;
	}
	
	public boolean me6(short a, short b) {
		return a==b;
		
	}
	
	public void me7(boolean a,boolean b) {
		boolean c = a==b;
		System.out.println(c);
	}
	
	public void me8(boolean a,boolean b) {
		boolean c = a != b;
		System.out.println(c);
	}

}
