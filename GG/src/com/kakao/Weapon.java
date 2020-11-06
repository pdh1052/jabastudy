package com.kakao;

public class Weapon {
	private int power;
	private String name;
	
	
	
	public int getPower() {
		return power;
	}
	public Weapon(int power, String name) {
		super();
		this.power = power;
		this.name = name;
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
	

	
	public Weapon(int power) {
		super();
		this.power = power;
	}
	public void attack(Monster mon) {
		int bhp = mon.getHp();
		int ahp = bhp - power;
		mon.setHp(ahp);
		System.out.println("몬스터의 hp :"+ahp );
	}
	@Override
	public String toString() {
		return getName();
	}
}
