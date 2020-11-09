package com.naver;

import java.util.StringTokenizer;

public class Test2 {
	

	public void me1() {
	
		String msg = "a#b#c#d##e#f";
		String[] arr = msg.split("#");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		StringTokenizer st = new StringTokenizer(msg, "#");
		String[] tArr = new String[st.countTokens()];
		int i = 0;
		
		while (st.hasMoreTokens()) {
			String token  = st.nextToken();
			tArr[i] = token;
			i++;
			System.out.println(token);
					
			
		}
		
		
		
		
	}
	}

		
		
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

