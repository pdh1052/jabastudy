package kr.co.ezen;

import com.kakao.Hero;
import com.kakao.Monster;
import com.kakao.Weapon;
import com.kakao.bow;
import com.kakao.gun;
import com.kakao.sword;


public class MainEx {
	public static void main(String[] args) {
		
		Monster mon = new Monster(100);
		
		Weapon[] weapons = {new bow(1, "Ȱ"),
				new sword(10, "��"),
				new gun(15, "��")
		};
		Weapon w = weapons[0];
		
		Hero h1 = new Hero(weapons,w);
		h1.attack(mon);
		h1.attack(mon);
		h1.chageWeapons(2);
		h1.attack(mon);
	

	
	
}
}
