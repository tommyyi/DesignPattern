package com.tomy.designpattern.factory.absfactory;


import jdk.nashorn.internal.runtime.Debug;

public class PizzaStore
{
    public static void main(String[] args)
    {
        OrderPizza mOrderPizza;
        mOrderPizza = new OrderPizza(new LDFactory());
    }
}
