package com.tomy.designpattern.mediator;

public class Alarm extends Colleague
{
    public Alarm(IMediator iMediator, String name)
    {
        super(iMediator, name);
        iMediator.Register(name, this);
    }

    public void SendAlarm(int colleagueState)
    {
        SendMessage(colleagueState);
    }

    @Override
    public void SendMessage(int colleagueState)
    {
        this.GetMediator().sendMessage(this.name, colleagueState);
    }
}
