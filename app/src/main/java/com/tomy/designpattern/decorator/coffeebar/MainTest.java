package com.tomy.designpattern.decorator.coffeebar;


import com.tomy.designpattern.decorator.coffeebar.coffee.Decaf;
import com.tomy.designpattern.decorator.coffeebar.coffee.LongBlack;
import com.tomy.designpattern.decorator.coffeebar.decorator.Decorator;

public class MainTest
{
    public static void main(String[] args)
    {
        Drink drink;
        drink = new Decaf();
        System.out.println("order1 price:" + drink.cost());
        System.out.println("order1 desc:" + drink.getDescription());

        System.out.println("****************");
        drink = new LongBlack();/*黑咖啡*/

        /*加可乐*/
        drink = new Decorator(drink);
        drink.setDescription("可乐");
        drink.setPrice(12);

        /*加花生*/
        drink = new Decorator(drink);
        drink.setDescription("花生");
        drink.setPrice(9);

        /*加核桃*/
        drink = new Decorator(drink);
        drink.setDescription("核桃");
        drink.setPrice(7);

        System.out.println("order2 price:" + drink.cost());
        System.out.println("order2 desc:" + drink.getDescription());
    }
}
