package com.tomy.designpattern.mediator;

public class CoffeeMachine extends Colleague
{
    public CoffeeMachine(IMediator IMediator, String name)
    {
        super(IMediator, name);
        IMediator.Register(name, this);
    }

    @Override
    public void SendMessage(int colleagueState)
    {
        this.GetMediator().sendMessage(this.name, colleagueState);
    }

    public void StartCoffee()
    {
        System.out.println("It's time to startcoffee!");
    }

    public void FinishCoffee()
    {
        System.out.println("After 5 minutes!");
        System.out.println("Coffee is ok!");
        SendMessage(0);
    }
}
