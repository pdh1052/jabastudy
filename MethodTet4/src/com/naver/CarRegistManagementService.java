package com.naver;

public class CarRegistManagementService {
	
	private String carName;
	
	public CarRegistManagementService() {
		carName = "�ҳ�Ÿ";
		
		
	}
	
	
	public String getCarName() {
		return carName;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}


	
	
	public int getCountCarName(String carName) {
		
		int size = carName.length();
		
		return size;
				
	}
	public int add(int a, int b) {
		
		return a+b;
		
		
	}
	
	
}
