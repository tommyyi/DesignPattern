package com.tomy.designpattern.decorator.coffeebar.decorator;


import com.tomy.designpattern.decorator.coffeebar.Drink;

public class Milk extends Decorator
{
    public Milk(Drink drink)
    {
        super(drink);//设置被装饰者
        super.setDescription("Milk");//设置milk的描述
        super.setPrice(2.0f);//设置milk的价格
    }
}

