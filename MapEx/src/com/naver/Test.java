package com.naver;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test {
	
	public void me5(String filename) {
		Map<String, String> map = new HashMap<String, String>();
		
		map.put("txt", "��������");
		map.put("png", "�̹�������");
		map.put("gif", "�̹�������");
		map.put("jpeg", "�̹�������");
		map.put("jpg", "�̹�������");
		
		int idx = filename.lastIndexOf(".");
		String key = filename.substring(idx)+1;
		String msg = map.get(key.toLowerCase());
		if (msg==null) {
			System.out.println("�ý�������");
		}else {
			System.out.println(msg);
		}
	}
	
	public void me4() {
		Map<String, List<Dog>> map = new HashMap<String, List<Dog>>();
		List<Dog> list1 = new ArrayList<Dog>();
		list1.add(new Dog("d001", "������", "Jin", 3));
		list1.add(new Dog("d002", "�鱸", "Kim", 4));
		List<Dog> list2 = new ArrayList<Dog>();
		list2.add(new Dog("d003", "happy", "Park", 3));
		list2.add(new Dog("d004", "Ÿ��", "Kang", 2));
		
		map.put("������", list1);
		map.put("���۵�", list2);
		
		List<Dog> d1 = map.get("������");
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
		list2.add("����");
		
		map.put("������", list1);
		map.put("�����", list2);
		
		System.out.println(map);
		List<String> hc = map.get("������");
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
		map.put(1, "kang"); //�̷���� �����ִ� kim�� kang���� ����
		System.out.println(map);
	}
	
	public void me1() {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("�߷°��ӵ�", 9);
		map.put("��й�ȣ", 1234);
		map.put("������λ�Ÿ�", 300);
		Integer k1 = map.get("��й�ȣ");
		System.out.println(k1);
	}

}
