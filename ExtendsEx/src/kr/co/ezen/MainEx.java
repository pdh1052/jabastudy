package kr.co.ezen;

import com.naver.BMW;
import com.naver.Car;
import com.naver.Sonata;

public class MainEx {

	public static void main(String[] args) {
		Sonata sonata1 = new Sonata();
		BMW bmw1 = new BMW();
		Car car1 = new Car();
		
		//������ : ��ü�� �����ϴ� �پ��� ���..
		//�θ��ڷ��� ������ = new �ڽĻ�����():
		//�ڽ��ڷ��� ������ = new �ڽĻ�����();
		
		Car sonata2 = new Sonata();
		Car bmw2 = new BMW();
		
		Car[] arrCar = {sonata1, bmw1, sonata2, bmw2};
		//�޼��� �������̵� : ��Ӱ��谡 �����ϴ� Ŭ�������� �θ�Ŭ������ ���� �ִ� �޼����� ������ �ڽ�Ŭ�������� ������(����/����/�߰�)
		//               ���������� ������ ��ü�� ���, �ڷ����� �θ��ڷ����̶� �� ��ü�� �����ϴ� �޼���� �������̵��� �޼����.
		sonata1.equals(sonata2); // equals()�޼����� �Ķ���� �ڷ����� Object
		
		sonata1.only();
		
		Sonata s = null;

		
		if (sonata2 instanceof Sonata) {
			s = (Sonata)sonata2;
			s.only();
	}
		
		Sonata ss= null;
		if (sonata2.getClass() == Sonata.class) {
			ss = (Sonata)sonata2;
			ss.only();
		}

}
}
