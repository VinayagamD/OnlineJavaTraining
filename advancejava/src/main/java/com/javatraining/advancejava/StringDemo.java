/**
 * 
 */
package com.javatraining.advancejava;

/**
 * @author vinay
 *
 */
public class StringDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String str1 = "Hello";
		String str2 = "Hello";
		String str3 = new String("Hello");
		System.out.println(str1 == str2);
		System.out.println(str1 == str3);
		System.out.println(str1.equals(str3));
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);

	}

}