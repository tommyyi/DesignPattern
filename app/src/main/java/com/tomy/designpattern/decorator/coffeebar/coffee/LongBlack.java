package com.tomy.designpattern.decorator.coffeebar.coffee;

import com.tomy.designpattern.decorator.coffeebar.Drink;

public class LongBlack extends Drink
{
    public LongBlack()
    {
        super.setDescription("黑咖啡");
        super.setPrice(6.0f);
    }

    @Override
    public float cost()
    {
        return super.getPrice();
    }
}

