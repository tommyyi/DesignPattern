package com.tomy.designpattern.mediator;

public class Curtains extends Colleague
{

    public Curtains(IMediator iMediator, String name)
    {
        super(iMediator, name);
        iMediator.Register(name, this);
    }

    @Override
    public void SendMessage(int stateChange)
    {
        this.GetMediator().sendMessage(this.name, stateChange);
    }

    public void UpCurtains()
    {
        System.out.println("I am holding Up Curtains!");
    }
}
