package com.naver;

public class Sword extends Weapons{

	public Sword(int power, String name) {
		super(power, name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return getName();
	}

}