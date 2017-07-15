package com.tomy.designpattern.factory.absfactory;


import com.tomy.designpattern.factory.pizza.NYCheesePizza;
import com.tomy.designpattern.factory.pizza.NYPepperPizza;
import com.tomy.designpattern.factory.pizza.Pizza;

public class NYFactory implements AbsFactory {

	
	@Override
	public Pizza CreatePizza(String ordertype) {
		Pizza pizza = null;

		if (ordertype.equals("cheese")) {
			pizza = new NYCheesePizza();
		} else if (ordertype.equals("pepper")) {
			pizza = new NYPepperPizza();
		}
		return pizza;

	}

}
