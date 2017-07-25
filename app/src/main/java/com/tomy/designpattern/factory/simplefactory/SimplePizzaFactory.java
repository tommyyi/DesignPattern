package com.tomy.designpattern.factory.simplefactory;


import com.tomy.designpattern.factory.pizza.CheesePizza;
import com.tomy.designpattern.factory.pizza.GreekPizza;
import com.tomy.designpattern.factory.pizza.PepperPizza;
import com.tomy.designpattern.factory.pizza.Pizza;

public class SimplePizzaFactory
{
    public Pizza CreatePizza(String type)
    {
        Pizza pizza = null;

        if (type.equals("cheese"))
        {
            pizza = new CheesePizza();
        }
        else if (type.equals("greek"))
        {
            pizza = new GreekPizza();
        }
        else if (type.equals("pepper"))
        {
            pizza = new PepperPizza();
        }
        return pizza;
    }
}
