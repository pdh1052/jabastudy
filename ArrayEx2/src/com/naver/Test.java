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
		//1.arr�� �ε����� 0�� ��ڰ��� �ε����� 2�� ��ڰ��� ����϶�.
		//  >>>> sysout arr[0][2]
		//2.arr�� ���� ū �ε����� ��ڰ��� ���� ���� �ε����� ��ڰ��� 100���� �����Ͻÿ�.
		//  >>>> arr[arr.length-1][0]=100;
		//3. arr�� ���� ū �ε����� ��ڰ��� ���� ���� �ε����� ��ڰ��� ����Ͻÿ�.
		//  >>>> sysout  arr[arr.length-1][0];
		
		
		
	}
	
	public void me21() {
		//���� ��ڰ��� �ڷ����� Dog�� 2�����迭 arr�� ũ��� 10�̰�, �� �ȿ� �ִ� �迭�� ũ��� 2�̴�.
		Dog[][]arr = new Dog[10][2];
		//arr�� ��� ��ڰ�(Dog[])�� ����Ͻÿ�.
		for (int i = 0; i < arr.length; i++) {
			//Dog[] dogs = arr[i];
			System.out.println(arr[i]);

			//arr�� ���� ��ڰ��� ��� ����Ͻÿ�.
			for (int j = 0; j < arr[i].length; j++) {
				System.out.println(arr[i][j]);
			}	
		}
	}

	public void me2() {
		//������ڰ� StringBuffer�� 2���� �迭 arr���� 5���� 1���� �迭�� �ִ�.
		//�׸��� �� �ȿ� �ִ� 1����� �迭�� ũ��� 3�̴�.
		StringBuffer[][]arr=new StringBuffer[5][3];
		System.out.println(arr.length);
		System.out.println(arr[0].length);
	}

	public void me1() {
		//2�����迭
		//2�����迭 �ȿ��� 1�����迭�� ����ִ�.
		int[][]arrInt; 
	}


}
