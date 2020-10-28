package com.naver;

import kr.co.ezen.Car;
import kr.co.ezen.Dog;

public class Person {
	
	public Person() {
				
	}
	
	
	private String id;
	private String name;
	private Dog happy;
	private Car k7;
	
	public Person(String id, String name, Dog happy, Car k7) {
		
		this.id = id;
		this.name = name;
		this.happy = happy;
		this.k7 = k7;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Dog getHappy() {
		return happy;
	}

	public void setHappy(Dog happy) {
		this.happy = happy;
	}

	public Car getK7() {
		return k7;
	}

	public void setK7(Car k7) {
		this.k7 = k7;
	}
	
	
	
	
 	    









}
