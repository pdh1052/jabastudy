package com.naver;

public class Test {
	public void me999() {
		int[] arrInt = new int[4];
		
		for (int i = 0; i < arrInt.length; i++) {
		int a =1;
		int b =1;
		int c =a+b;
			arrInt[i] = c;
			 
			 a=b;
			 b=c;
			
		}
	}
	public void me01() {
		int[] arr = {3,6,3,7};
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
	}
	
	public void me32(Dog[]dogs) {
		System.out.println(dogs.length);
	}
	
	public void me31() {
		float[] arrFloat = new float[] {3.14f, 4.2f, 9.8f};
		System.out.println(arrFloat.length);
		
	}
	
	public void me3() {
		int[] arrInt = new int[] {1,3,5,7};
		System.out.println(arrInt.length);
	}
	
	public void me22(String []arrStr) {
		System.out.println(arrStr.length);
		arrStr[1] = "12";
		System.out.println(arrStr[1]);
	}
	
	public void me21() {		
		Dog[] arrDog = {new Dog(null),new Dog(null)};
		System.out.println(arrDog.length);
		arrDog[arrDog.length -1] = null;
		for (int i = 0; i < arrDog.length; i++) {
			System.out.println(arrDog[i]);
		}if (arrDog[1] != null) {
				
			}
		}
		

	public void me2() {
		//자료형[] 변수명 = {자료형에 맞는 값~~~~~};
		int[]arrInt = {1,4,6};
		System.out.println(arrInt.length);
		System.out.println(arrInt[1]);
		arrInt[1] = 333;
		for (int i = 0; i < arrInt.length; i++) {
			
			
		  if(i==1) {
				continue;
			}else if (arrInt[i]==0) {
				
			}
		  System.out.println(arrInt[i]);
		}


	}
	public void me13() {
		String data = "teacheryo#1#seoul#226#-1";
		String []arrData=data.split("#");
		System.out.println(arrData.length);
		int largestIdx = arrData.length -1;
		arrData[largestIdx] = "100";
		arrData[0] = "ezen";
		for (int i = 0; i < arrData.length; i++) {

			System.out.println(arrData[i].charAt(0));
		}
	}

	public void me12(Dog[] dogs) {		
		// 1. Test class의 me12{}에서 파라미터로 넘어온 배열 데이터의 크기를 출력하시오.
		// 2. main{}에 가서 me12{}를 호출하시오.
		System.out.println(dogs.length);
		int largestIdx = dogs.length -1;
		dogs[largestIdx]=null;
		for (int i = 0; i < dogs.length; i++) {
			System.out.println(dogs[i]);
		}
		if (dogs != null) {
			for (int i = 0; i < dogs.length; i++) {
				//System.out.println(dogs[i].getName());
			} 
		}
		
	}
	
	public void me11() {
		StringBuffer [] arrSb = new StringBuffer[100];
		System.out.println(arrSb.length);
		System.out.println("===================");
		System.out.println(arrSb[50]);
		StringBuffer sb1 = new StringBuffer();
		arrSb[1] = sb1;
		System.out.println(arrSb[1]);
		for (int i = arrSb.length-1;i > 0 ;i--) {
			System.out.println(arrSb[i]);
		}
		
		
		
	}
	
	public void me1() {
		//자료형[] 변수명 = new 자료형 [배열의크기]
		int [] arrInt = new int [4];
		//length는 배열의 속성으로 반복문을 돌릴 때. 직접적인 배열의 크기 대신 사용한다.
		arrInt[0]=100;
		arrInt[1]=200;
		arrInt[2]=300;
		arrInt[3]=400;
		System.out.println(arrInt.length);
		System.out.println(arrInt[2]);
		System.out.println(arrInt[0]);
		System.out.println(arrInt[1]);
		System.out.println(arrInt[3]);
		for (int i = 0; i < arrInt.length; i++) {
			System.out.println(arrInt[i]);
			
		}
		
	}
	

		
	

}
