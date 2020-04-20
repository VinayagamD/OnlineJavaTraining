package com.javatraining.corejavatraining.userinput;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String message = scanner.nextLine();
		System.out.println(message);
		scanner.close();
	}
}
