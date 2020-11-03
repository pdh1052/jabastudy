package kr.co.ezen;

import com.naver.Dog;
import com.naver.Test;

public class MainEx {

	public static void main(String[] args) {
		Test t1 = new Test();
		t1.me1();
		System.out.println("===================");
		t1.me11();
		System.out.println("===================");
		t1.me12(new  Dog[5]);
		System.out.println("===================");
		t1.me13();		
		System.out.println("===================");
		t1.me2();
		System.out.println("===================");
		t1.me21();
		String []arrStr = {"aa", "bb"};
		System.out.println("===================");
		t1.me22(arrStr);
		System.out.println("===================");
		t1.me31();
		Dog[] dogs = new Dog[] {new Dog(null), new Dog(null), new Dog(null)};
		t1.me32(dogs);
		System.out.println("===================");
		t1.me01();
	}

}
