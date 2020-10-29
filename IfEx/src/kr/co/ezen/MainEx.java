package kr.co.ezen;

import com.naver.Person;
import com.naver.TV;
import com.naver.Test;

public class MainEx {

	public static void main(String[] args) {
		Test t1 = new Test();
		t1.me1();
		t1.m2(60);
		t1.me3(3);
		String msg = t1.me4(4);
		System.out.println(msg);
		t1.me5(2);
		t1.me6(5);
		char score = t1.me7(90);
		System.out.println(score);
		
		TV tv1 = new TV(10, 15, false);
		tv1.powerOn();
		System.out.println(tv1.getVol());
		tv1.volUp();
		System.out.println(tv1.getVol());
		tv1.powerOff();
		tv1.volUp();
		System.out.println(tv1.getVol());
		
		Person kim = new Person(tv1);
		kim.TvOn();
		TV tv = kim.getTv1();
		System.out.println(tv.getCh());
		tv.chUp();
		System.out.println(tv.getCh());
		kim.getTv1().volDown();
		kim.getTv1().setVol(50);

		
		

	}

}
