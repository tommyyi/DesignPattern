package com.tomy.designpattern.factory.simplefactory;


public class PizzaStroe
{
    public static void main(String[] args)
    {
        OrderPizza mOrderPizza;
        mOrderPizza = new OrderPizza(new SimplePizzaFactory());

    }


}
