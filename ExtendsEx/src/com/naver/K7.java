package com.naver;

public class K7 extends Car{

	public K7() {
	run();
	}

	@Override
	public void run() {
		System.out.println("K7�� run()");
		super.run();
	}

	public K7(String model, String company, int price) {
		super(model, company, price);
		// TODO Auto-generated constructor stub
	}
	
}