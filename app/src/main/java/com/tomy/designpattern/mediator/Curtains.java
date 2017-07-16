package com.tomy.designpattern.mediator;

public class Curtains extends Colleague {

	public Curtains(IMediator IMediator, String name) {
		super(IMediator, name);
		// TODO Auto-generated constructor stub
		IMediator.Register(name, this);
	}

	@Override
	public void SendMessage(int stateChange) {
		// TODO Auto-generated method stub
		this.GetMediator().GetMessage(stateChange, this.name);
	}

	public void UpCurtains() {
		System.out.println("I am holding Up Curtains!");
	}

}
