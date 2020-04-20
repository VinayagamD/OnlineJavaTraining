package com.javatraining.corejavatraining.serializable;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DemodModelFilterStaticExample {
	
	public static void main(String[] args) {
		DemoFilterModel dDemoModel = null;
		 String filename = "file.ser"; 
		 
		try(FileInputStream fileIn = new FileInputStream(filename);
				ObjectInputStream in = new ObjectInputStream(fileIn)){
			
			dDemoModel = (DemoFilterModel) in.readObject();
			System.out.println(dDemoModel.getName());
			System.out.println(dDemoModel.getSurname());
			System.out.println(dDemoModel.getMessage());
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
