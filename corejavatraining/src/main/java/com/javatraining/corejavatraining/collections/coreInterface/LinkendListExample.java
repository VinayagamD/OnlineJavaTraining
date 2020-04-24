/**
 * 
 */
package com.javatraining.corejavatraining.collections.coreInterface;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * @author vinay
 *
 */
public class LinkendListExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		LinkedList<String> datas = new LinkedList<String>();
		datas.add("One");
		datas.add("Two");
		datas.add("Three");
		
		System.out.println(datas);
		datas.addFirst("OneFirst");
		datas.addLast("Added Last");
		System.out.println(datas.peekFirst());
		System.out.println(datas);
		System.out.println(datas.pollFirst());
		System.out.println(datas);
		datas.addFirst("OneFirst");
		Iterator<String> dataIterator = datas.descendingIterator();
		while(dataIterator.hasNext()) {
			System.out.println(dataIterator.next());
			
		}
		
		dataIterator = datas.iterator();
		
		while(dataIterator.hasNext()) {
			System.out.println(dataIterator.next());
		}
		
		

	}

}
