package com.naver;





public class Test {

	
	public void me5() {
		int[][] arr= new int[3][];
		arr[0] = new int []{1,2,3,4};
		arr[1] = new int [] {0,2,4};
		arr[2] = new int [] {1,3,5,7,9};
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.println(arr[i][j]);
			}
		}
		
	}
	
	public void me4() {
		int [][] arr= new int [3][10];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (i == 0) {
					arr[i][j]=i+1;
					System.out.print(arr[i][j]);
					
				}else if (i ==1) {					
					arr[i][j]=i*2;
					System.out.print(arr[i][j]);
					
				}else {
					arr[i][j]=i*2+1;
					System.out.print(arr[i][j]);
					
				}
			}
		}	
	}

	public void me3() {
		int[][] arr1 = {
				{4,1,0},
				{4,1,8},
				{5,7,1}
		};
		String[][]arr2 = {
				{"good","oh","my"},
				{"god","thank","you"}
		};
		int[][][] arr3 = {
				{{1,1,1,1}},
				{{2,2,2,2}},
				{{3,3,3,3}}
		};System.out.println(arr3[arr3.length-1][0]);
	
	
	int[][] arr4 = {
			{1,1,1},
			{2,2,2},
			{3,3,3},
			{4,4,4},
			{5,5,5},				
	}; 

	
	}
	


	public void me22() {
		int[][] arr = new int[5][4];
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
			for (int j = 0; j < arr[i].length; j++) {
				System.out.println(arr[i][j]);
			}
		}
		//1.arr의 인덱스가 0인 요솟값의 인덱스가 2인 요솟값을 출력하라.
		//  >>>> sysout arr[0][2]
		//2.arr의 가장 큰 인덱스의 요솟값의 가장 작은 인덱스의 요솟값을 100으로 설정하시오.
		//  >>>> arr[arr.length-1][0]=100;
		//3. arr의 가장 큰 인덱스의 요솟값의 가장 작은 인덱스의 요솟값으 출력하시오.
		//  >>>> sysout  arr[arr.length-1][0];
		
		
		
	}
	
	public void me21() {
		//최종 요솟값의 자료형이 Dog인 2차원배열 arr의 크기는 10이고, 그 안에 있는 배열의 크기는 2이다.
		Dog[][]arr = new Dog[10][2];
		//arr의 모든 요솟값(Dog[])을 출력하시오.
		for (int i = 0; i < arr.length; i++) {
			//Dog[] dogs = arr[i];
			System.out.println(arr[i]);

			//arr의 최종 요솟값을 모두 출력하시오.
			for (int j = 0; j < arr[i].length; j++) {
				System.out.println(arr[i][j]);
			}	
		}
	}

	public void me2() {
		//최종요솟값 StringBuffer인 2차원 배열 arr에는 5개의 1차원 배열이 있다.
		//그리고 그 안에 있는 1차우너 배열의 크기는 3이다.
		StringBuffer[][]arr=new StringBuffer[5][3];
		System.out.println(arr.length);
		System.out.println(arr[0].length);
	}

	public void me1() {
		//2차원배열
		//2차원배열 안에는 1차원배열이 들어있다.
		int[][]arrInt; 
	}


}
