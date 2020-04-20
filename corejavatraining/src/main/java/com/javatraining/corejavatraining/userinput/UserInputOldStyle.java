package com.javatraining.corejavatraining.userinput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UserInputOldStyle {

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		String line;
		
		while((line = bufferedReader.readLine()) != null ) {
			if(line.equals("exit")) {
				break;
			}
			System.out.println(line);
		}
	}
}
