package kr.co.ezen;

public class MainEx {

	public static void main(String[] args) {
		
		bow bow = new bow();
		spear spear = new spear();
		Monster mon = new Monster();	
		Hero hero = new Hero(bow);
		Sword sword = new Sword();
		
		

		
		hero.attck(mon);
		hero.attck(sword, mon);
		hero.setSpear(spear);
		hero.spearAttck(mon);
		
		
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		

	}

}
