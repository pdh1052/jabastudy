package com.naver;



public class SM5 extends Car{

	public SM5() {
		run();
	}

	public SM5(String model, String company, int price) {
		super(model, company, price);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void run() {
		System.out.println("SM5�� run()");
		super.run();
	}

	public void me1() {
		//�޼��� �������̵� : ��Ӱ��谡 �����ϴ� Ŭ�������� �θ�Ŭ������ ���� �ִ� �޼����� ������ �ڽ�Ŭ�������� ������(����/����/�߰�)
	}
	
}