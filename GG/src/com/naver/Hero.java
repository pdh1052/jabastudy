package com.naver;

public class Hero {
	Weapon[] weapon;
	Weapon w;
	
	public Hero() {
		weapon = new Weapon[] {new Bow(1, "Ȱ"), new Sword(5, "��"), new Gun(10, "��")};
				w=weapon[0];	
	}

	public Hero(Weapon[] weapon, Weapon w) {
		super();
		this.weapon = weapon;
		this.w = w;
	}
	
	public void attack(Monster mon) {
		w.attack(mon);
	}

	public void chageWeapon(int weaponIdx) {
		if (weaponIdx >= weapon.length || weaponIdx < 0) {
			weaponIdx = weapon.length-1;}
			w=weapon[weaponIdx];
			System.out.println(w + "�� ����Ǿ����ϴ�.");
		
	}
}