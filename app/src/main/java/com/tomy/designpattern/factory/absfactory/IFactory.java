package com.tomy.designpattern.factory.absfactory;


import com.tomy.designpattern.factory.pizza.Pizza;

public interface IFactory
{
	public Pizza CreatePizza(String ordertype) ;
}
