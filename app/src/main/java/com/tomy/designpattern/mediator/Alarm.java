package com.tomy.designpattern.mediator;

public class Alarm extends Colleague {

	public Alarm(IMediator IMediator, String name) {
		super(IMediator, name);
		// TODO Auto-generated constructor stub
		IMediator.Register(name, this);
	}

	public void SendAlarm(int stateChange) {
		SendMessage(stateChange);
	}

	@Override
	public void SendMessage(int stateChange) {
		// TODO Auto-generated method stub
		this.GetMediator().GetMessage(stateChange, this.name);
	}

}
