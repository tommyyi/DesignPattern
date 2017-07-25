package com.tomy.designpattern.factory.absfactory;


import com.tomy.designpattern.factory.pizza.LDCheesePizza;
import com.tomy.designpattern.factory.pizza.LDPepperPizza;
import com.tomy.designpattern.factory.pizza.Pizza;

public class LDFactory implements IFactory
{
    @Override
    public Pizza CreatePizza(String type)
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
