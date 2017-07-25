package com.tomy.designpattern.iterator.iterator;

import com.tomy.designpattern.iterator.MenuItem;

public interface IIterator
{
	boolean hasNext();
	MenuItem next();
}
