package com.naver;



public class SM5 extends Car{

	public SM5() {
		run();
	}

	public SM5(String model, String company, int price) {
		super(model, company, price);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void run() {
		System.out.println("SM5의 run()");
		super.run();
	}

	public void me1() {
		//메서드 오버라이딩 : 상속관계가 성립하는 클래스에서 부모클래스가 갖고 있는 메서드의 내용을 자식클래스에서 재정의(수정/삭제/추가)
	}
	
}