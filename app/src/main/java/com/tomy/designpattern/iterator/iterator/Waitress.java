package com.tomy.designpattern.iterator.iterator;

import com.tomy.designpattern.iterator.MenuItem;

import java.util.ArrayList;


public class Waitress {
	private ArrayList<IIterator> mIIterators =new ArrayList<IIterator>();


	public Waitress() {
		
	}
	public void addIterator(IIterator IIterator)
	{
		mIIterators.add(IIterator);
		
	}
	public void printMenu() {
		IIterator IIterator;
		MenuItem menuItem;
		for (int i = 0, len = mIIterators.size(); i < len; i++) {
			IIterator = mIIterators.get(i);
			
			while(IIterator.hasNext())
			{
				menuItem=(MenuItem)	IIterator.next();
				System.out.println(menuItem.getName() + "***"
						+menuItem.getPrice()+"***"+ menuItem.getDescription());

			}
			
			
		}
		
		

	}

	public void printBreakfastMenu() {

	}

	public void printLunchMenu() {

	}

	public void printVegetableMenu() {

	}
}
