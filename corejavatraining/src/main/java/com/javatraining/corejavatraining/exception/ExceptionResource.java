/**
 * 
 */
package com.javatraining.corejavatraining.exception;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

/**
 * @author vinay
 *
 */
public class ExceptionResource {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try(FileInputStream inputStream =new  FileInputStream("message.txt");
		/*
		 * BufferedInputStream bufferedInputStream = new
		 * BufferedInputStream(inputStream)
		 */){
			Scanner scanner = new Scanner(inputStream);
			/*
			 * int data = bufferedInputStream.read(); while(data != -1){
			 * System.out.print((char) data); data = bufferedInputStream.read(); }
			 */
			System.out.println(scanner.nextLine());

			
		} catch ( FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
