package com.naver;

public class Sonata extends Car {
	private String model = "Sonata";
	
	public Sonata() {
		run();
	}		
	@Override
	public void run() {
		System.out.println("Sonata 클래스의 run()");
		super.run();
	}
	public Sonata(String model, String company, int price) {
		super(model, company, price);
		// TODO Auto-generated constructor stub
	}

	public void only() {
		System.out.println("부모클래스에는 없고, 소나타클래스에만 있는 메서드");
		
		
		
	}
	
}