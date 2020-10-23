package kr.co.ezen;

import com.naver.MethodTest2;
import com.naver.MethodTest3;


public class MainEx {

	
public static void main(String[] args) {
		
		MethodTest mt1 = new MethodTest();
		MethodTest mt2 = new MethodTest();
		
		
		
		mt1.stand();
		mt1.sleep();
		mt1.sayHello();
		mt1.mtSkill("발차기", 500);
		
		mt2.sitDown();
		mt2.callName("박도현");
		mt2.printDan(5);
		mt2.printScore("홍길동", 100);
		mt2.mtSkill("주먹치기", 300);
		
		Test12 t10 = new Test12();
		t10.sayHello();
		t10.printScore(10);
		
		MethodTest2 mt5 = new MethodTest2();
		int re1 = mt5.giveMeTheMoney();
		MethodTest2 mt6 = new MethodTest2();
		int re2 = mt6.giveMeTheMoney();
		int re3 = mt5.giveMeTheMoney();
		re2 = mt6.giveMeTheMoney();
		
		MethodTest3 mt7 = new MethodTest3();
		Test12 re4 = mt7.getTest12();
		
		
		

        
		
		
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

		
		
		
		
		
		
				
		
		
		

}
}