package com.tomy.designpattern.mediator;

public interface IMediator
{
	void Register(String colleagueName, Colleague colleague);

	void GetMessage(int stateChange, String colleagueName);

	void SendMessage();
}
