package com.kakao;

public class sword extends Weapon{

	public sword(int power, String name) {
		super(power, name);
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return getName();
	}
	public sword(int power) {
		super(power);
		// TODO Auto-generated constructor stub
	}
}
