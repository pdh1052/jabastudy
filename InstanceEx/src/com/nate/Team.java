package com.nate;

import kr.co.ezen.Car;

import com.naver.Person;

import kr.co.ezen.Dog;

public class Team {
	
	private Person captain;
	private Person member1;
	private Person member2;
	
	public Team(Person captain, Person member1, Person member2) {
		
		this.captain = captain;
		this.member1 = member1;
		this.member2 = member2;
	}

	public Person getCaptain() {
		return captain;
	}

	public void setCaptain(Person captain) {
		this.captain = captain;
	}

	public Person getMember1() {
		return member1;
	}

	public void setMember1(Person member1) {
		this.member1 = member1;
	}

	public Person getMember2() {
		return member2;
	}

	public void setMember2(Person member2) {
		this.member2 = member2;
	}
	
	public void showCaptainCarPrice() {
		Car captainCar = captain.getK7();
		captainCar.showMePrice();
			
	}
	
	public void mem1Sleep(String where) {
		System.out.println(member1.getHappy().sleep("집"));
	}
	
	public void mem2PrintCarModelName() {
	
		// Car car = member2.getK7();
		// String mn = car.getModelName();
		//sysout  "mn";
		
		
		String modelName = member2.getK7().getCarModel();
		System.out.println(modelName);
	}
	
	public char getCaptainCarModelNameFirstChar() {
		
		Car car = captain.getK7();
		String modelName= car.getCarModel();
		char c = modelName.charAt(0);
		return c;
		
	}
	
	public void changeMem1Dog(Dog dog) {
		
		member1.setHappy(dog);
		
		
	}
	
	public void changeMem1DogName(String dogName) {
		
		member1.getHappy().setName(dogName);
		
		
		
		
		
	
		
		
		
	}

	public void fight(Team bTeam) {
		
		String aTeamcaptainName = this.captain.getName();
		String bTeamcaptainName = bTeam.captain.getName();


		System.out.println(aTeamcaptainName + " VS " + bTeamcaptainName);
	}

	public void fightMem1(Team aTeam) {
		String bTeamCaptainName = this.member1.getName();
		String aTeamMember1 = aTeam.member1.getName();
		System.out.println(bTeamCaptainName+" VS "+aTeamMember1);
		
	}

	public void fightMem2Dog(Team bTeam) {
		String captainDogA = this.captain.getHappy().getName();
		String captainDogB = bTeam.captain.getHappy().getName();
		
		System.out.println(captainDogA+" VS "+captainDogB);
		
	}

	public void fightbTeam(Team bTeam) {
		String aTeamCaptain = this.captain.getName();
		String aTeamMember1 = this.member1.getName();
		String aTeamMember2 = this.member2.getName();
		String bTeamcapTain= bTeam.captain.getName();
		String bTeamMember1= bTeam.member1.getName();
		System.out.println(aTeamCaptain+","+aTeamMember1+","+aTeamMember2+" VS "+ bTeamcapTain+","+bTeamMember1);
		
				
	}

	public void fightCar(Team bTeam) {
		
		String captainCarA = this.captain.getK7().getCarModel();
		String captainCarB= bTeam.captain.getK7().getCarModel();
		System.out.println(captainCarA+" VS "+captainCarB);
		
		
	}

	public void sleepDog(Team bTeam) {
		String sleepDogA = this.captain.getHappy().sleep("잭스패로우집");
		String sleepDogB = bTeam.captain.getHappy().sleep("도현이집");
		System.out.println(sleepDogA+sleepDogB);
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}