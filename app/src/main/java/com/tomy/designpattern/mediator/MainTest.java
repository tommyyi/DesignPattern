package com.tomy.designpattern.mediator;

public class MainTest
{
    public static void main(String[] args)
    {
        IMediator IMediator = new ConcreteMediator();

        Alarm mAlarm = new Alarm(IMediator, "mAlarm");
        CoffeeMachine mCoffeeMachine = new CoffeeMachine(IMediator, "mCoffeeMachine");
        Curtains mCurtains = new Curtains(IMediator, "mCurtains");
        TV mTV = new TV(IMediator, "mTV");

        mAlarm.SendAlarm(0);
        mCoffeeMachine.FinishCoffee();
        mAlarm.SendAlarm(1);
    }
}
