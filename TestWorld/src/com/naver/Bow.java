package com.naver;

public class Bow extends Weapons{

	public Bow(int power, String name) {
		super(power, name);
		
	}

	@Override
	public String toString() {
		return getName();
	}

}
