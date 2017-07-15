package com.tomy.designpattern.factory.method;


import com.tomy.designpattern.factory.pizza.NYCheesePizza;
import com.tomy.designpattern.factory.pizza.NYPepperPizza;
import com.tomy.designpattern.factory.pizza.Pizza;

public class NYOrderPizza extends OrderPizza {

	@Override
	Pizza createPizza(String ordertype) {
		Pizza pizza = null;

		if (ordertype.equals("cheese")) {
			pizza = new NYCheesePizza();
		} else
		{
			if (ordertype.equals("pepper"))
			{
				pizza = new NYPepperPizza();
			}
		}
		return pizza;

	}

}
