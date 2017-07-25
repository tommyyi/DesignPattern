package com.tomy.designpattern.factory;

import com.tomy.designpattern.factory.pizza.CheesePizza;
import com.tomy.designpattern.factory.pizza.ChinesePizza;
import com.tomy.designpattern.factory.pizza.GreekPizza;
import com.tomy.designpattern.factory.pizza.PepperPizza;
import com.tomy.designpattern.factory.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class OrderPizza
{

    public OrderPizza()
    {
        Pizza pizza = null;
        String type;

        label:
        do
        {
            type = gettype();

            switch (type)
            {
                case "cheese":
                    pizza = new CheesePizza();
                    break;
                case "greek":
                    pizza = new GreekPizza();
                    break;
                case "pepper":
                    pizza = new PepperPizza();
                    break;
                case "chinese":
                    pizza = new ChinesePizza();
                    break;
                default:
                    break label;
            }
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        }
        while (true);
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
