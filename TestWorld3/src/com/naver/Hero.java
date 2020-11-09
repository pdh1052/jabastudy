package com.naver;

public class Hero {
	


	Weapons[] weapons;
	Weapons w;
	
	public Hero() {
		weapons = new Weapons[] {new Bow(1, "È°"), new Sword(5, "°Ë"),new Gun(10, "ÃÑ")};
		w=weapons[0];
	}

	public Hero(Weapons[] weapons, Weapons w) {
		super();
		this.weapons = weapons;
		this.w = w;
	}
	
	public void attack(Monster mon) {
		w.attack(mon);
	}
	
	public void chageWeapon(int weaponIdx) {
		if (weaponIdx >= weapons.length||weaponIdx < 0) {
			weaponIdx = weapons.length-1;
		}
		w = weapons[weaponIdx];
		System.out.println(w);
	}
		
	
	
	
	
	
	
	

}
