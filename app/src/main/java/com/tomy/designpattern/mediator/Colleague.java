package com.tomy.designpattern.mediator;

public abstract class Colleague {
	private IMediator mIMediator;
	public String name;

	public Colleague(IMediator IMediator, String name) {

		this.mIMediator = IMediator;
		this.name = name;

	}

	public IMediator GetMediator() {
		return this.mIMediator;
	}

	public abstract void SendMessage(int stateChange);
}
