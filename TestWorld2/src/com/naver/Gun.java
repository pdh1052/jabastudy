package com.naver;

public class Gun extends Weapons{

	@Override
	public String toString() {
		return getName();
	}

	public Gun(int power, String name) {
		super(power, name);
		// TODO Auto-generated constructor stub
	}

}
