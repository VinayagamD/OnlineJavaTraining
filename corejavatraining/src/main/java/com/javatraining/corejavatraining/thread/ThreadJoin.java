/**
 * 
 */
package com.javatraining.corejavatraining.thread;

import java.math.BigInteger;

/**
 * @author vinay
 *
 */
public class ThreadJoin {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		Thread threadA = new Thread(() -> {
			for (int i = 0; i < 10; i++) {
				System.out.println("Thread A" + i);
			}
		}, "ThreadA");
		
		Thread threadB = new Thread(() -> {
			for (int i = 0; i < Double.MAX_VALUE; i++) {
				System.out.println("Thread B" + i);
			}
		}, "ThreadB");
		
		threadB.setDaemon(true);
		threadA.start();
		threadB.start();
		System.exit(0);
	}

	private static void callLoop() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Main" + i);
		}
		
	}

}
