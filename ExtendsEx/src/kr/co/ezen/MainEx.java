package kr.co.ezen;

import com.naver.BMW;
import com.naver.Car;
import com.naver.Sonata;

public class MainEx {

	public static void main(String[] args) {
		Sonata sonata1 = new Sonata();
		BMW bmw1 = new BMW();
		Car car1 = new Car();
		
		//다형성 : 객체를 생성하는 다양한 방법..
		//부모자료형 변수명 = new 자식생성자():
		//자식자료형 변수명 = new 자식생성자();
		
		Car sonata2 = new Sonata();
		Car bmw2 = new BMW();
		
		Car[] arrCar = {sonata1, bmw1, sonata2, bmw2};
		//메서드 오버라이딩 : 상속관계가 성립하는 클래스에서 부모클래스가 갖고 있는 메서드의 내용을 자식클래스에서 재정의(수정/삭제/추가)
		//               다형성으로 생성된 객체의 경우, 자료형이 부모자료형이라도 그 객체가 실행하는 메서드는 오버라이딩된 메서드다.
		sonata1.equals(sonata2); // equals()메서드의 파라미터 자료형이 Object
		
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
