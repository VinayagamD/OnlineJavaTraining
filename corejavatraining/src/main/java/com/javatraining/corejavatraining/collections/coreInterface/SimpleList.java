package com.javatraining.corejavatraining.collections.coreInterface;

import java.util.Iterator;

public class SimpleList implements Iterable<DemoData> {

	private DemoData[] arrayList;
	private int currentSize;
	
	
	
	public SimpleList(DemoData[] arrayList) {
		this.arrayList = arrayList;
		this.currentSize = arrayList.length;
	}



	@Override
	public Iterator<DemoData> iterator() {
		Iterator<DemoData> demoIt = new Iterator<DemoData>() {
			private int currentIndex = 0;

			@Override
			public boolean hasNext() {
				return currentIndex < currentSize && arrayList[currentIndex] != null;

			}

			@Override
			public DemoData next() {
				return arrayList[currentIndex++];
			}
			
		};
		
		return demoIt;
	}

	
}
