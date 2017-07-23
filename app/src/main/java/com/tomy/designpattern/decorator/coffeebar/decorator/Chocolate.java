package com.tomy.designpattern.decorator.coffeebar.decorator;


import com.tomy.designpattern.decorator.coffeebar.Drink;

public class Chocolate extends Decorator
{
    public Chocolate(Drink drink)
    {
        super(drink);
        super.setDescription("Chocolate");
        super.setPrice(3.0f);
    }
}
