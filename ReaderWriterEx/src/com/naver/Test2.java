package com.naver;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;

public class Test2 {
	
	public void me2() {
		Reader in = null;
		try {
			in = new FileReader("C:"+File.separator+"ee.txt");
			char[] arr = new char[1024];
			int length = -1;
			while (true) {
				length = in.read(arr, 0, arr.length);
				if (length == -1) {
					break;
				}
				for (int i = 0; i < arr.length; i++) {
					System.out.println(arr[i]);
				}
				
			}
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if (in != null) {
					in.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
	
	public void me1() {
		
		Writer out = null;
		String[] arr = {"hello", "good"};
		try {
			out = new FileWriter("C:"+File.separator+"ee.txt");
			out.write("ddddd");
			out.write(System.getProperty("line.separator"));
			for (int i = 0; i < arr.length; i++) {
				out.write(i);
				out.write(System.getProperty("line.separator"));
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if (out != null) {
					out.close();
				}
			} catch (Exception e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}
		}
	}

}
