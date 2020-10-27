package kr.co.ezen;

public class Hero {
	
	public Hero() {
		
	}
	
	private bow bow;
	private spear spear;
	

	public spear getSpear() {
		return spear;
	}

	public void setSpear(spear spear) {
		this.spear = spear;
	}

	public Hero(spear spear) {
		
		this.spear = spear;
	}

	public Hero(bow bow) {
		
		this.bow = bow;
	}

	public bow getBow() {
		return bow;
	}

	public void setBow(bow bow) {
		this.bow = bow;
	}	
	
	public void attck(Monster mon) {
		bow.attack(mon);
		
	}

	public void attck(Sword sword, Monster mon) {
		sword.Attack(mon);
		
	}	
	
	
	public void spearAttck(Monster mon) {
		spear.attack(mon);
		
	}
}



