package com.kakao;

public class Hero {
	Weapon[]  weapons;
	Weapon w;
	
	public Hero() {
		weapons = new Weapon[] {new bow(1, "활"), new sword(10, "검"), new gun(15, "총")};
		w = weapons[2];
	}
	
	public void attack(Monster mon) {
		w.attack(mon);
	}

	public Hero(Weapon[] weapons, Weapon w) {
		super();
		this.weapons = weapons;
		this.w = w;
	}

	public void chageWeapons(int weaponIdx) {
		if (weaponIdx >= weapons.length||weaponIdx < 0) {
			weaponIdx = weapons.length-1;
			
		}
	w= weapons[weaponIdx];
	System.out.println(w+"로 변경되었습니다.");
	}
	


}
