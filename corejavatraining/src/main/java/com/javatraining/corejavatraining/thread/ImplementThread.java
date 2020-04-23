package com.javatraining.corejavatraining.thread;

public class ImplementThread {

	public static void main(String[] args) {
		Runnable runnable  = new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Running Runnable");
				
			}
		};
		
		Thread thread = new Thread(runnable);
		thread.start();
		
		thread = new Thread(()->  {
			System.out.println("Running Runnable");
		});
		
		thread.start();
	}
	
	
}
