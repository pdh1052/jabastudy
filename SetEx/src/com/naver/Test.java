package com.naver;

import java.util.HashSet;
import java.util.Set;

public class Test {
	
	
	public void me4() {
		Set<Member> set = new HashSet<Member>();
		set.add(new Member("m001", "kim", 4));
		set.add(new Member("m002", "lee", 11));
		set.add(new Member("m005", "park", 32));
	
		
	}
	
	public void me3() {
		Set<Apple> set = new HashSet<Apple>();
		set.add(new Apple("a001", "�뱸", "���1", 1500));
		set.add(new Apple("a002", "����", "���2", 2000));
		set.add(new Apple("a003", "����", "���3", 3000));
		set.add(new Apple("a002", "�λ�", "���44", 500));
		set.add(new Apple("a005", "û��", "���5", 1000));
		
	}
	
	public void me2() {
		Set<String> set = new HashSet<String>();
		set.add("hello");
		set.add(new String("hello"));
		set.add("hello");
		set.add("Hello");
		set.add(new String("Hello"));
		set.add("HELLO");
		set.add(new String("HELLO"));
		
	}
	
	public void me1() {
		Set<Integer> set = new HashSet<Integer>();
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(4);
		set.add(5);
		set.add(1);
		
	}
}
