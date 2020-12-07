package kr.co.ezen;

import java.lang.reflect.Constructor;

import com.naver.Command;

public class MainEx2 {

	public static void main(String[] args) {
	
		try {
			 Class<?> testClass = Class.forName("com.naver.InsertEmployeeCommand");
			Constructor<?> cons =  testClass.getConstructor();
			Command com = (Command)cons.newInstance();
			
			com.execute(null);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
