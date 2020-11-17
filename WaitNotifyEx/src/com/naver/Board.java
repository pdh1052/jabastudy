package com.naver;

public class Board {
	private String todayPost;
	private boolean isOk;

	public Board() {
		// TODO Auto-generated constructor stub
	}
	public Board(String todayPost) {
		super();
		this.todayPost = todayPost;
	}

	public String getTodayPost() {
		
		if (!isOk) {
			try {
				synchronized (this) {
					wait();
				}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
		return todayPost;
	}

	public void setTodayPost(String todayPost) {
		
		this.todayPost = todayPost;
		
		isOk = true;
		
		synchronized (this) {
			notify();
		}
	}

	
}
