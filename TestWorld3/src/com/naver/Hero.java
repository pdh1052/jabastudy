package com.naver;

public class Hero {
	


	Weapons[] weapons;
	Weapons w;
	
	public Hero() {
		weapons = new Weapons[] {new Bow(1, "Ȱ"), new Sword(5, "��"),new Gun(10, "��")};
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
