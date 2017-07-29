package com.tomy.designpattern.mediator;

public class TV extends Colleague
{

    public TV(IMediator IMediator, String name)
    {
        super(IMediator, name);
        // TODO Auto-generated constructor stub
        IMediator.Register(name, this);
    }

    @Override
    public void SendMessage(int stateChange)
    {
        // TODO Auto-generated method stub
        this.GetMediator().sendMessage(this.name, stateChange);
    }

    public void StartTv()
    {
        // TODO Auto-generated method stub
        System.out.println("It's time to StartTv!");
    }

    public void StopTv()
    {
        // TODO Auto-generated method stub
        System.out.println("StopTv!");
    }
}
