package com.naver;

public class Person {
	private TV tv1;
	
	public Person() {
		
	}

	public TV getTv1() {
		return tv1;
	}

	public void setTv1(TV tv1) {
		this.tv1 = tv1;
	}

	public Person(TV tv1) {
		this.tv1 = tv1;
	}
	public void TvOn() {
		System.out.println("TV�� �մϴ�.");
		tv1.powerOn();
		
	}
	
	public void TvOff() {
		System.out.println("TV�� ���ϴ�.");
		tv1.powerOff();
	}

}
