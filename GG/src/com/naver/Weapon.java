package com.naver;

public class Weapon {
private int power;
private String name;	

	public Weapon() {
		
	}

	
	
	public Weapon(int power) {
		super();
		this.power = power;
	}



	public int getPower() {
		return power;
	}



	public void setPower(int power) {
		this.power = power;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public Weapon(int power, String name) {
		super();
		this.power = power;
		this.name = name;
	}



	public void attack(Monster mon) {
		int bHp = mon.getHp();
		int aHp = bHp - power;
		mon.setHp(aHp);
		System.out.println("moster¿« HP :" + aHp);
		
		
		
	}



	@Override
	public String toString() {
		return getName();
	}
}


