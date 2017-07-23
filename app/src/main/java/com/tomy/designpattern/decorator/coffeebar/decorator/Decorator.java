package com.tomy.designpattern.decorator.coffeebar.decorator;

import com.tomy.designpattern.decorator.coffeebar.Drink;

/**
 * 在被装饰者的特性上，增加一些特性
 */
public class Decorator extends Drink
{
    /*被装饰者*/
    private Drink mDrink;

    /**
     * @param drink 被装饰者
     */
    public Decorator(Drink drink)
    {
        this.mDrink = drink;
    }

    /*被装饰者的价格+自身的价格
     * @return
     */
    @Override
    public float cost()
    {
        return mDrink.cost() + super.getPrice();
    }

    /**
     * 被装饰者的描述+自身的描述+自身的价格
     * @return
     */
    @Override
    public String getDescription()
    {
        return mDrink.getDescription() + "&&" + super.description + "-" + super.getPrice();
    }
}
