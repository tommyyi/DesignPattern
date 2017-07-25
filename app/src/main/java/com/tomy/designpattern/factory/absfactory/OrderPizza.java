package com.tomy.designpattern.factory.absfactory;

import com.tomy.designpattern.factory.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class OrderPizza
{
    private IFactory mIFactory;

    public OrderPizza(IFactory iFactory)
    {
        setIFactory(iFactory);
    }

    public void setIFactory(IFactory mFactory)
    {
        Pizza pizza;
        String type;

        this.mIFactory = mFactory;
        while (true)
        {
            type = getType();
            pizza = mFactory.CreatePizza(type);
            if (pizza != null)
            {
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            }
        }
    }

    private String getType()
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