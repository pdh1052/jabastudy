package kr.co.ezen;

import java.util.Scanner;

import com.naver.Bow;
import com.naver.Gun;
import com.naver.Hero;
import com.naver.Monster;
import com.naver.Sword;
import com.naver.Weapon;

public class MainEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);


		Monster mon = new Monster(100);
		Weapon []weapons = {new Bow(1, "활"), new Sword(5 , "검"), new Gun(10, "총") };
		Weapon w = weapons[0];
		
		Hero h1 = new Hero(weapons, w);
		
		boolean isTrue = true;
		int menu=0;
		int weaponIdx = 0;
		
		while (isTrue) {
			System.out.println("다음중 하나를 선택하시오.");
			System.out.println("0.공격  1.무기선택  2.종료");
		 menu = sc.nextInt();
		
		if (menu == 2) {
			break;
		}else if (menu==1) {
			System.out.println("무기를 선택하시오");
			for (int i = 0; i < weapons.length; i++) {
				System.out.print(i);
				System.out.print("."+weapons[i]);			
		}System.out.println();
		weaponIdx = sc.nextInt();
		sc.nextLine();
		h1.chageWeapon(weaponIdx);
		}else if (menu==0) {
			h1.attack(mon);
		}
	
	
}
		System.out.println("end");
		sc.close();

}
}
