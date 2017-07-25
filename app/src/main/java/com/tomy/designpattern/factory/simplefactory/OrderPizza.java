package com.tomy.designpattern.factory.simplefactory;

import com.tomy.designpattern.factory.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class OrderPizza
{
    SimplePizzaFactory mSimplePizzaFactory;

    public OrderPizza(SimplePizzaFactory mSimplePizzaFactory)
    {
        setFactory(mSimplePizzaFactory);
    }

    public void setFactory(SimplePizzaFactory mSimplePizzaFactory)
    {
        Pizza pizza = null;
        String type;

        this.mSimplePizzaFactory = mSimplePizzaFactory;

        while (true)
        {
            type = gettype();
            pizza = mSimplePizzaFactory.CreatePizza(type);
            if (pizza != null)
            {
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            }
        }
    }

    private String gettype()
    {
        try
        {
            BufferedReader strin = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("input pizza type:");
            String str = strin.readLine();

            return str;
        }
        catch (IOException e)
        {
            e.printStackTrace();
            return "";
        }
    }
}