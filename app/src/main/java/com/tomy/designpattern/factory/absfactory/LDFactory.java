package com.tomy.designpattern.factory.absfactory;


import com.tomy.designpattern.factory.pizza.LDCheesePizza;
import com.tomy.designpattern.factory.pizza.LDPepperPizza;
import com.tomy.designpattern.factory.pizza.Pizza;

public class LDFactory implements AbsFactory {

	@Override
	public Pizza CreatePizza(String ordertype) {
		Pizza pizza = null;

		if (ordertype.equals("cheese")) {
			pizza = new LDCheesePizza();
		} else if (ordertype.equals("pepper")) {
			pizza = new LDPepperPizza();
		}
		return pizza;

	}

}
