package kr.co.ezen;

import com.naver.Test;
import com.naver.Test2;
import com.naver.Test3;

public class MainEx {

	public static void main(String[] args) {
		

		Test2 ts1 = new Test2();
		ts1.k1(true, true);
		ts1.k1(false, false);
		ts1.k1(true, false);
		System.out.println("===============================");
		ts1.k2(true, false);
		ts1.k2(false, false);
		ts1.k2(false, true);
		System.out.println("===============================");
		ts1.k3(true);
		ts1.k3(false);
		System.out.println("===============================");
		ts1.swithInt();
		ts1.swithInt();
		ts1.swithInt();
		ts1.switchBoolean();
		ts1.switchBoolean();
		ts1.switchBoolean();
		System.out.println("===============================");
		Test3 t3 = new Test3();
		t3.plus1();
		t3.plus11();
		System.out.println("===============================");
		t3.plus2();
		t3.plus21();
		System.out.println(t3.getB());
		System.out.println("===============================");
		t3.minus1();
		System.out.println("===============================");
		Test5 t5 = new Test5();
		t5.h1();
		t5.h2();
		t5.h3();
		t5.h4();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}