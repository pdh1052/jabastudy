package com.kakao;

public class gun extends Weapon{

	public gun(int power, String name) {
		super(power, name);
		// TODO Auto-generated constructor stub
	}

	public gun(int power) {
		super(power);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return getName();
	}
	

}