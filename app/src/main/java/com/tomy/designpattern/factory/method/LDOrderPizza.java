package com.tomy.designpattern.factory.method;


import com.tomy.designpattern.factory.pizza.LDCheesePizza;
import com.tomy.designpattern.factory.pizza.LDPepperPizza;
import com.tomy.designpattern.factory.pizza.Pizza;

public class LDOrderPizza extends OrderPizza
{
    @Override
    Pizza createPizza(String type)
    {
        Pizza pizza = null;

        if (type.equals("cheese"))
        {
            pizza = new LDCheesePizza();
        }
        else if (type.equals("pepper"))
        {
            pizza = new LDPepperPizza();
        }
        return pizza;
    }
}
