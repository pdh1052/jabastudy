package com.kakao;

public class bow extends Weapon{
	public bow() {
		super();
	}

	public bow(int power, String name) {
		super(power, name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return getName();
	}

	public bow(int power) {
		super(power);
		// TODO Auto-generated constructor stub
	}

}
