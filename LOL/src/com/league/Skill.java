package com.league;

public class Skill {
	
	public Skill() {
	}
	
	private String Q;
	private String W;
	private String E;
	private String R;
	
	
	
	public Skill(String q, String w, String e, String r) {
		
		Q = q;
		W = w;
		E = e;
		R = r;
	}



	public String getQ() {
		return Q;
	}



	public void setQ(String q) {
		System.out.println(q+"����");
		Q = q;
		
	}



	public String getW() {
		return W;
	}



	public void setW(String w) {
		System.out.println(w+"����");
		W = w;
	}



	public String getE() {
		return E;
	}



	public void setE(String e) {
		System.out.println(e+"����");
		E = e;
	}



	public String getR() {
		return R;
	}



	public void setR(String r) {
		System.out.println(r+"����");
		R = r;
	}
	
	
	

}








