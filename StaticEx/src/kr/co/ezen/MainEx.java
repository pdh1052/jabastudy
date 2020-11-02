package kr.co.ezen;


import com.naver.Sonata;
import com.naver.Test;

public class MainEx {

	public static void main(String[] args) {
		
		Test t1 = new Test();
		t1.a = 100;
		System.out.println(t1.a);
		
		Test.b = 500;
		System.out.println(Test.b);
		
		Test t2 = new Test();
		t2.a = 200;
		System.out.println(t2.a);
		System.out.println(Test.b);
		t2.me1();
		
		Sonata s1 = new Sonata("k7");
		
		

	}

}
