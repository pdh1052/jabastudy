package com.naver;

public class Sum {
	private int num;
	private int tes;
	Object key1 = new Object();
	Object key2 = new Object();
	public Sum() {
		// TODO Auto-generated constructor stub
	}
	public Sum(int num) {
		super();
		this.num = num;
	}
	public  void addNum(int n) {
		synchronized (key1) {
			num += n;
		}
	}
	
	public  void subTes(int n) {
		synchronized (this) {
			tes -= n;
		}
	}
	
	public void subNum(int n) {
		synchronized (key1) {
			num -= n;
		}
	}
	
	public void addTes(int n) {
		synchronized (this) {
			tes += n;
		}
	}
	
	public Sum(int num, int tes) {
		super();
		this.num = num;
		this.tes = tes;
	}
	public int getTes() {
		return tes;
	}
	public void setTes(int tes) {
		this.tes = tes;
	}
	

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
	
	

}
