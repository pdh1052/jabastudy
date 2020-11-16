package com.naver;

import java.util.Scanner;

public class EndCommand implements Command{

	@Override
	public void excute(Scanner sc) {
		System.exit(0);
		
	}

	@Override
	public String toString() {
		return "Á¾·á";
	}

}
