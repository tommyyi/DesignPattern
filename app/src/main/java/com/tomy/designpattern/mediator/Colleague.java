package com.tomy.designpattern.mediator;

public abstract class Colleague
{
    public String name;
    private IMediator mIMediator;

    public Colleague(IMediator IMediator, String name)
    {
        this.mIMediator = IMediator;
        this.name = name;
    }

    public IMediator GetMediator()
    {
        return this.mIMediator;
    }

    public abstract void SendMessage(int stateChange);
}
