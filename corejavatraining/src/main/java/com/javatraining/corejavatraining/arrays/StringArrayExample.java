package com.javatraining.corejavatraining.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class StringArrayExample {
	
	public static void main(String[] args) {
		String[] arrays = new String[10];
		arrays[9] = "Hello";
//		System.out.println(arrays[-1]);
		
		for (int i = 0; i < arrays.length; i++) {
			arrays[i] = String.valueOf(i);
		}
		for (int i = 0; i < arrays.length; i++) {
			System.out.println(arrays[i]);
		}
		System.out.println();
		for (String string : arrays) {
			System.out.println(string);
		}
		Arrays.asList(arrays).forEach(System.out::println);
		
		varargs(  1,2, 3,4);
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNext()) {
			if(scanner.nextLine().equals("q")) {
				break;
			}
			
		}
		
	}
	
	public static  void varargs(int ... varint ) {
		for (int i = 0; i < varint.length; i++) {
			System.out.println(varint[i]);
		}
	}

	public static  void varargs(int i1, int i2, int i3) {
		
	}
}
