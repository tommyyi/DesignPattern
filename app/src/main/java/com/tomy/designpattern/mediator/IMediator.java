package com.tomy.designpattern.mediator;

public interface IMediator
{
    void Register(String colleagueName, Colleague colleague);
    void sendMessage(String colleagueName, int colleagueState);
}
