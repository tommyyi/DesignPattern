package com.tomy.designpattern.factory.simplefactory;


import com.tomy.designpattern.factory.pizza.CheesePizza;
import com.tomy.designpattern.factory.pizza.GreekPizza;
import com.tomy.designpattern.factory.pizza.PepperPizza;
import com.tomy.designpattern.factory.pizza.Pizza;

public class SimplePizzaFactory {

	public Pizza CreatePizza(String ordertype) {
		Pizza pizza = null;

		if (ordertype.equals("cheese")) {
			pizza = new CheesePizza();
		} else if (ordertype.equals("greek")) {
			pizza = new GreekPizza();
		} else if (ordertype.equals("pepper")) {
			pizza = new PepperPizza();
		}
		return pizza;

	}

}
