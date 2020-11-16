package com.naver;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test {
	
	public void me5(String filename) {
		Map<String, String> map = new HashMap<String, String>();
		
		map.put("txt", "문서파일");
		map.put("png", "이미지파일");
		map.put("gif", "이미지파일");
		map.put("jpeg", "이미지파일");
		map.put("jpg", "이미지파일");
		
		int idx = filename.lastIndexOf(".");
		String key = filename.substring(idx)+1;
		String msg = map.get(key.toLowerCase());
		if (msg==null) {
			System.out.println("시스템파일");
		}else {
			System.out.println(msg);
		}
	}
	
	public void me4() {
		Map<String, List<Dog>> map = new HashMap<String, List<Dog>>();
		List<Dog> list1 = new ArrayList<Dog>();
		list1.add(new Dog("d001", "누렁이", "Jin", 3));
		list1.add(new Dog("d002", "백구", "Kim", 4));
		List<Dog> list2 = new ArrayList<Dog>();
		list2.add(new Dog("d003", "happy", "Park", 3));
		list2.add(new Dog("d004", "타코", "Kang", 2));
		
		map.put("진돗개", list1);
		map.put("세퍼드", list2);
		
		List<Dog> d1 = map.get("진돗개");
		for (int i = 0; i < d1.size(); i++) {
			Dog dog = d1.get(i);
			String id = dog.getId();
			System.out.println(id);
		}
		
	}
	
	public void me3() {
		Map<String, List<String>> map = new HashMap<String, List<String>>();
		List<String>list1 = new ArrayList<String>();
		list1.add("sonata");
		list1.add("exel");
		list1.add("genesis");
		list1.add("grangure");
		List<String>list2 = new ArrayList<String>();
		list2.add("k7");
		list2.add("k5");
		list2.add("pride");
		list2.add("지프");
		
		map.put("현대차", list1);
		map.put("기아차", list2);
		
		System.out.println(map);
		List<String> hc = map.get("현대차");
		System.out.println(hc);
		for (int i = 0; i < hc.size(); i++) {
			System.out.println(hc.get(i));
		}
				
	}
	
	public void me2() {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "kim");
		map.put(0, "lee");
		map.put(2, "park");
		map.put(1, "kang"); //이런경우 기존있던 kim을 kang으로 변경
		System.out.println(map);
	}
	
	public void me1() {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("중력가속도", 9);
		map.put("비밀번호", 1234);
		map.put("서울과부산거리", 300);
		Integer k1 = map.get("비밀번호");
		System.out.println(k1);
	}

}
