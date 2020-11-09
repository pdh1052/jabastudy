package com.naver;

public class Hero {
	
	Weapons[] weapons;
	Weapons w;
	
	public Hero() {
		weapons = new Weapons[] {new Bow(1, "활"),new Sword(5, "검"),new Gun(10, "총")};
		w = weapons[0];
	}

	public Hero(Weapons[] weapons, Weapons w) {
		super();
		this.weapons = weapons;
		this.w = w;
	}
	
	public void changeWeapons(int weaponIdx) {
		if (weaponIdx >= weapons.length||weaponIdx < 0) {
			weaponIdx = weapons.length-1;
		}
		w = weapons[weaponIdx];
		System.out.println(w + "로 변경되었습니다.");
		
	}
	public void attack(Monster mon) {
		w.attack(mon);
	}
	

}
