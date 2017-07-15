package com.tomy.designpattern.factory.absfactory;


import com.tomy.designpattern.factory.pizza.Pizza;

public interface AbsFactory {
	public Pizza CreatePizza(String ordertype) ;
}
