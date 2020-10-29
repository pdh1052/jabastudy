package com.naver;



public class Test {
	
	public char me7(int score) {
		if (score >= 90) {
			return '¼ö';
		}else if(score >= 80) {
			return '¿ì';
		}else {
			return '°¡';
		}
	    }
	public void me6(int a) {
		if (a%2==0) {
			System.out.println(2);
		}else if (a%3==0) {
				System.out.println(3);
		}else if (a%5==0) {
					System.out.println(5);			
		}else {
			System.out.println(0);
	}
	}
	
	public void me5(int x) {
		
		if (x>0) {
			 System.out.println("y=3");
		}else {
			System.out.println("y=-3");
		}
	}
	
	
	
    public String me4(int a) {
    	if (a<=10) { 
    		return "ok";
    	} else { 
    		return "no";
    	}
    	}
		
	
	public void me3(int a) {
		if (a!=4) {
			System.out.println(true);
		}
		}
	
	
	public void m2(int a) {
		if(a%5==0&&a%6==0) {
			System.out.println(30);
    	}
        }
	
	public void me1() {
		int a = 10;
			
		if(a%5 ==0) {
		System.out.println(5);

		}
		}
}
