package com.naver;

public class Gun extends Weapon{

	public Gun() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Gun(int power, String name) {
		super(power, name);
		// TODO Auto-generated constructor stub
	}

	public Gun(int power) {
		super(power);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return getName();
	}
	
}
