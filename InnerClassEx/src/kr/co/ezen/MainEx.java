package kr.co.ezen;

import com.naver.Test2;
import com.naver.Test3;
import com.naver.Test3.StaticInnerClass;
import com.naver.Test5;


public class MainEx {

	public static void main(String[] args) {
		
		Test2.MemberClass mc1 = new Test2().new MemberClass();
		
		mc1.mc1();
		
		Test3.StaticInnerClass sic1 = new Test3.StaticInnerClass();
		sic1.sic();
		
		Test5 t1 = new Test5();
		t1.ano.me1();
		

	}

}
