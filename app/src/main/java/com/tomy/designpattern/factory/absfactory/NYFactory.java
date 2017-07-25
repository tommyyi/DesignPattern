package com.tomy.designpattern.factory.absfactory;


import com.tomy.designpattern.factory.pizza.NYCheesePizza;
import com.tomy.designpattern.factory.pizza.NYPepperPizza;
import com.tomy.designpattern.factory.pizza.Pizza;

public class NYFactory implements IFactory
{
    @Override
    public Pizza CreatePizza(String type)
    {
        Pizza pizza = null;

        if (type.equals("cheese"))
        {
            pizza = new NYCheesePizza();
        }
        else if (type.equals("pepper"))
        {
            pizza = new NYPepperPizza();
        }
        return pizza;
    }
}
