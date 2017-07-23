package com.tomy.designpattern.decorator.coffeebar.coffee;

import com.tomy.designpattern.decorator.coffeebar.Drink;

public class Decaf extends Drink
{
    public Decaf()
    {
        super.setDescription("Decaf");
        super.setPrice(3.0f);
    }

    @Override
    public float cost()
    {
        return super.getPrice();
    }
}
