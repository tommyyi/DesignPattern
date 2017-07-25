package com.tomy.designpattern.factory.method;

import com.tomy.designpattern.factory.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public abstract class OrderPizza
{
    public OrderPizza()
    {
        Pizza pizza = null;
        String type;

        while (true)
        {
            type = gettype();
            pizza = createPizza(type);

            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        }
    }

    abstract Pizza createPizza(String ordertype);

    private String gettype()
    {
        try
        {
            BufferedReader strin = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("input pizza type:");

            return strin.readLine();
        }
        catch (IOException e)
        {
            e.printStackTrace();
            return "";
        }
    }
}
