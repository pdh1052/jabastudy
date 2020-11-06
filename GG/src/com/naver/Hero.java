package com.naver;

public class Hero {
	
	Weapon[] weapons;
	Weapon w;
	
	public Hero() {
		weapons = new Weapon[] {new Bow(1, "활"),new Sword(5, "검"), new Gun(10, "총")};
		
		w =weapons[2];
		
		
	}
	
	
	public void attack(Monster mon) {
		w.attack(mon);
	}
	
	public Hero(Weapon[] weapons, Weapon w) {
		super();
		this.weapons = weapons;
		this.w = w;
	}
	public void chageWeapon(int weaponIdx) {
		if (weaponIdx >= weapons.length||weaponIdx < 0) {
			weaponIdx = weapons.length-1;
		}
		
		
		
		w = weapons[weaponIdx];
				System.out.println(w + "로 변경되었습니다.");
	}
	
	
	

}
