package com.naver;

public class Bow extends Weapon{

	public Bow(int power, String name) {
		super(power, name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return getName();
	}

}
