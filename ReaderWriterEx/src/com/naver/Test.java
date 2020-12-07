package com.naver;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.Writer;

public class Test {
	
	public void me7() {
		Writer out = null;
		PrintWriter pw = null;
		
		try {
			out = new FileWriter("aaa.txt");
			pw = new PrintWriter(out);
			
			pw.print(false);
			pw.println(false);
			pw.println(false);
			
			pw.flush();
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if (pw != null) {
					pw.close();
				}
				if (out != null) {
					out.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
	
	public void me6() {
		InputStream in = null;
		InputStreamReader isr = null;
		BufferedReader br = null;
		
		try {
			in = new FileInputStream("abc.txt");
			isr = new InputStreamReader(in);
			br = new BufferedReader(isr);
			
			while (true) {
				String msg = br.readLine();
				if (msg == null) {
					break;
				}
				System.out.println(msg);
			}
				
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if (br != null) {
					br.close();
				}
				if (isr != null) {
					isr.close();
				}
				if (in!=null) {
					in.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
	
	public void me5() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("당신이 가장 좋아하는 숫자를 입력하시오.");		
		String sNum= br.readLine();
		int num = Integer.parseInt(sNum);
		
		System.out.println("당신이 가장 싫어하는 숫자를 입력하시오.");
		String sNum2 = br.readLine();
		int num2 = Integer.valueOf(sNum2);
		
		System.out.println("두 수의 합은 "+(num+num2));
		
		if (br != null) {
			br.close();
		}
		
		
	}
	
	public void me4() {
		
		Reader in = null;
		BufferedReader br = null;
		
		try {
			in = new FileReader("C:"+File.separator+"abc.txt");
			br = new BufferedReader(in);
			
			 
				
					while (true) {
						String msg = br.readLine();
						
						if (msg==null) {
							break;
						}
						
						String a = "100";
						String b = "200";
						int c=Integer.parseInt(a+b) + Integer.parseInt(b);
						System.out.println(c);
						System.out.println(msg);
					}
					
				
				
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if (br != null) {
					br.close();
				}
				if (in != null) {
					in.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
	}
	
	public void me3() {
		Writer out = null;
		Reader in = null;
		
		
		try {
			out = new FileWriter("C:"+File.separator+"abc.txt");
			
			out.write("1");
			out.write(System.getProperty("line.separator"));
			out.write("2");
			out.write(System.getProperty("line.separator"));
			out.write("3");
			out.write(System.getProperty("line.separator"));
			out.write("4");
			out.write(System.getProperty("line.separator"));
			out.write("목요일");
			out.write(System.getProperty("line.separator"));
			out.write("5");
			out.write(System.getProperty("line.separator"));
			out.flush();
					
			in = new FileReader("C:"+File.separator+"abc.txt");
			char[] arr = new char[1024];
			int length = -1;
			
			while (true) {
				length= in.read(arr,0,arr.length);
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
				if (in!=null) {
					in.close();
				}
				if (out!=null) {
					out.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
	}
	
	public void me2() {
		Reader in = null;
		
		try {
			in = new FileReader("C:"+File.separator+"ss.txt");
			
			char[] arr = new char[1024];
			int length = -1;
			
			while (true) {
				length = in.read(arr, 0, arr.length);
				if (length == -1) {
					break;
				}
				for (int i = 0; i < length; i++) {
					System.out.print(arr[i]);
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
		String[] arr = {"hello", "world", "good"};
		
		try {
			
			out = new FileWriter("C:"+File.separator+"ss.txt");
			out.write("brrrr");
			out.write(System.getProperty("line.separator"));    // >> 줄바꿈
			
			
			
			
			for (int i = 0; i < arr.length-1; i++) {
				out.write(i);
				out.write(System.getProperty("line.separator"));
				
			}
			
			out.flush();
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if (out != null) {
					out.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
	
}
