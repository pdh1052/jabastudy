package kr.co.ezen;

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
		
		
		
		
		
	}

}
