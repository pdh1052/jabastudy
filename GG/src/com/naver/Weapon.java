package com.naver;

public abstract class Weapon implements WeaponSkill{

	private int power;
	private String name;
	
	
	public Weapon(int power, String name) {
		super();
		this.power = power;
		this.name = name;
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
	@Override
	public String toString() {
		return getName();
		
		
	}
	
	public void attack(Monster mon) {
		int bHp = mon.getHp() ;
		int aHp = bHp - power;
		mon.setHp(aHp);;
		System.out.println("������ HP : "+aHp);
		
	}
}


