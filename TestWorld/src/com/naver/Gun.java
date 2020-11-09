package com.naver;

public class Gun extends Weapons{

	public Gun(int power, String name) {
		super(power, name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return getName();
	}

}
